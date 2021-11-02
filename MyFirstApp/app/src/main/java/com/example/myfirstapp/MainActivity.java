package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
//        System.out.println("Pushed!");
//        sendUdp(view);

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }



    public void sendUdp(View view){
        new Thread(new Runnable(){
            @Override
            public void run() {
                try{
                    System.out.println("Thread send start");

                    InetAddress laddr = InetAddress.getByName("10.0.2.2");


                    DatagramSocket sendUdpSocket = new DatagramSocket();

                    String localad;
                    localad = sendUdpSocket.getLocalAddress().toString();
                    System.out.println(localad);

                    byte[] buffer = new byte[1024];
                    buffer[1] = 0x55;
                    buffer[2] = 0x54;
                    buffer[3] = 0x53;
                    buffer[4] = 0x52;
                    DatagramPacket packet = new DatagramPacket(buffer, buffer.length, laddr, 5000);
                    sendUdpSocket.send(packet);
                    System.out.println("Thread send end");

                    byte[] buffer2 = new byte[1024];

                    //DatagramPacket packet2 = new DatagramPacket(buffer2, buffer2.length, laddr, 5000);
                    DatagramPacket packet2 = new DatagramPacket(buffer2, buffer2.length);
                    sendUdpSocket.receive(packet2);
                    String result = new String(buffer2, "UTF-8");
                    System.out.println(result);



                } catch (SocketException e){
                    System.out.println(e.getMessage());
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }).start();

    }
}