/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE CONTROL_SYSTEM_STATE PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * The smoothed, monotonic system state used to feed the control loops of the system.
 */
public class msg_control_system_state extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_CONTROL_SYSTEM_STATE = 146;
    public static final int MAVLINK_MSG_LENGTH = 100;
    private static final long serialVersionUID = MAVLINK_MSG_ID_CONTROL_SYSTEM_STATE;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    public long time_usec;
      
    /**
     * X acceleration in body frame
     */
    public float x_acc;
      
    /**
     * Y acceleration in body frame
     */
    public float y_acc;
      
    /**
     * Z acceleration in body frame
     */
    public float z_acc;
      
    /**
     * X velocity in body frame
     */
    public float x_vel;
      
    /**
     * Y velocity in body frame
     */
    public float y_vel;
      
    /**
     * Z velocity in body frame
     */
    public float z_vel;
      
    /**
     * X position in local frame
     */
    public float x_pos;
      
    /**
     * Y position in local frame
     */
    public float y_pos;
      
    /**
     * Z position in local frame
     */
    public float z_pos;
      
    /**
     * Airspeed, set to -1 if unknown
     */
    public float airspeed;
      
    /**
     * Variance of body velocity estimate
     */
    public float vel_variance[] = new float[3];
      
    /**
     * Variance in local position
     */
    public float pos_variance[] = new float[3];
      
    /**
     * The attitude, represented as Quaternion
     */
    public float q[] = new float[4];
      
    /**
     * Angular rate in roll axis
     */
    public float roll_rate;
      
    /**
     * Angular rate in pitch axis
     */
    public float pitch_rate;
      
    /**
     * Angular rate in yaw axis
     */
    public float yaw_rate;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_CONTROL_SYSTEM_STATE;
        
        packet.payload.putUnsignedLong(time_usec);
        packet.payload.putFloat(x_acc);
        packet.payload.putFloat(y_acc);
        packet.payload.putFloat(z_acc);
        packet.payload.putFloat(x_vel);
        packet.payload.putFloat(y_vel);
        packet.payload.putFloat(z_vel);
        packet.payload.putFloat(x_pos);
        packet.payload.putFloat(y_pos);
        packet.payload.putFloat(z_pos);
        packet.payload.putFloat(airspeed);
        
        for (int i = 0; i < vel_variance.length; i++) {
            packet.payload.putFloat(vel_variance[i]);
        }
                    
        
        for (int i = 0; i < pos_variance.length; i++) {
            packet.payload.putFloat(pos_variance[i]);
        }
                    
        
        for (int i = 0; i < q.length; i++) {
            packet.payload.putFloat(q[i]);
        }
                    
        packet.payload.putFloat(roll_rate);
        packet.payload.putFloat(pitch_rate);
        packet.payload.putFloat(yaw_rate);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a control_system_state message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedLong();
        this.x_acc = payload.getFloat();
        this.y_acc = payload.getFloat();
        this.z_acc = payload.getFloat();
        this.x_vel = payload.getFloat();
        this.y_vel = payload.getFloat();
        this.z_vel = payload.getFloat();
        this.x_pos = payload.getFloat();
        this.y_pos = payload.getFloat();
        this.z_pos = payload.getFloat();
        this.airspeed = payload.getFloat();
         
        for (int i = 0; i < this.vel_variance.length; i++) {
            this.vel_variance[i] = payload.getFloat();
        }
                
         
        for (int i = 0; i < this.pos_variance.length; i++) {
            this.pos_variance[i] = payload.getFloat();
        }
                
         
        for (int i = 0; i < this.q.length; i++) {
            this.q[i] = payload.getFloat();
        }
                
        this.roll_rate = payload.getFloat();
        this.pitch_rate = payload.getFloat();
        this.yaw_rate = payload.getFloat();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_control_system_state() {
        this.msgid = MAVLINK_MSG_ID_CONTROL_SYSTEM_STATE;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_control_system_state( long time_usec, float x_acc, float y_acc, float z_acc, float x_vel, float y_vel, float z_vel, float x_pos, float y_pos, float z_pos, float airspeed, float[] vel_variance, float[] pos_variance, float[] q, float roll_rate, float pitch_rate, float yaw_rate) {
        this.msgid = MAVLINK_MSG_ID_CONTROL_SYSTEM_STATE;

        this.time_usec = time_usec;
        this.x_acc = x_acc;
        this.y_acc = y_acc;
        this.z_acc = z_acc;
        this.x_vel = x_vel;
        this.y_vel = y_vel;
        this.z_vel = z_vel;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.z_pos = z_pos;
        this.airspeed = airspeed;
        this.vel_variance = vel_variance;
        this.pos_variance = pos_variance;
        this.q = q;
        this.roll_rate = roll_rate;
        this.pitch_rate = pitch_rate;
        this.yaw_rate = yaw_rate;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_control_system_state( long time_usec, float x_acc, float y_acc, float z_acc, float x_vel, float y_vel, float z_vel, float x_pos, float y_pos, float z_pos, float airspeed, float[] vel_variance, float[] pos_variance, float[] q, float roll_rate, float pitch_rate, float yaw_rate, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_CONTROL_SYSTEM_STATE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.x_acc = x_acc;
        this.y_acc = y_acc;
        this.z_acc = z_acc;
        this.x_vel = x_vel;
        this.y_vel = y_vel;
        this.z_vel = z_vel;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.z_pos = z_pos;
        this.airspeed = airspeed;
        this.vel_variance = vel_variance;
        this.pos_variance = pos_variance;
        this.q = q;
        this.roll_rate = roll_rate;
        this.pitch_rate = pitch_rate;
        this.yaw_rate = yaw_rate;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_control_system_state(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_CONTROL_SYSTEM_STATE;
        
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                                      
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_CONTROL_SYSTEM_STATE - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" x_acc:"+x_acc+" y_acc:"+y_acc+" z_acc:"+z_acc+" x_vel:"+x_vel+" y_vel:"+y_vel+" z_vel:"+z_vel+" x_pos:"+x_pos+" y_pos:"+y_pos+" z_pos:"+z_pos+" airspeed:"+airspeed+" vel_variance:"+vel_variance+" pos_variance:"+pos_variance+" q:"+q+" roll_rate:"+roll_rate+" pitch_rate:"+pitch_rate+" yaw_rate:"+yaw_rate+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_CONTROL_SYSTEM_STATE";
    }
}
        