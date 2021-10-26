/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SERVO_OUTPUT_RAW PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Superseded by ACTUATOR_OUTPUT_STATUS. The RAW values of the servo outputs (for RC input from the remote, use the RC_CHANNELS messages). The standard PPM modulation is as follows: 1000 microseconds: 0%, 2000 microseconds: 100%.
 */
public class msg_servo_output_raw extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SERVO_OUTPUT_RAW = 36;
    public static final int MAVLINK_MSG_LENGTH = 21;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;

      
    /**
     * Timestamp (UNIX Epoch time or time since system boot). The receiving end can infer timestamp format (since 1.1.1970 or since system boot) by checking for the magnitude of the number.
     */
    public long time_usec;
      
    /**
     * Servo output 1 value
     */
    public int servo1_raw;
      
    /**
     * Servo output 2 value
     */
    public int servo2_raw;
      
    /**
     * Servo output 3 value
     */
    public int servo3_raw;
      
    /**
     * Servo output 4 value
     */
    public int servo4_raw;
      
    /**
     * Servo output 5 value
     */
    public int servo5_raw;
      
    /**
     * Servo output 6 value
     */
    public int servo6_raw;
      
    /**
     * Servo output 7 value
     */
    public int servo7_raw;
      
    /**
     * Servo output 8 value
     */
    public int servo8_raw;
      
    /**
     * Servo output port (set of 8 outputs = 1 port). Flight stacks running on Pixhawk should use: 0 = MAIN, 1 = AUX.
     */
    public short port;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;
        
        packet.payload.putUnsignedInt(time_usec);
        packet.payload.putUnsignedShort(servo1_raw);
        packet.payload.putUnsignedShort(servo2_raw);
        packet.payload.putUnsignedShort(servo3_raw);
        packet.payload.putUnsignedShort(servo4_raw);
        packet.payload.putUnsignedShort(servo5_raw);
        packet.payload.putUnsignedShort(servo6_raw);
        packet.payload.putUnsignedShort(servo7_raw);
        packet.payload.putUnsignedShort(servo8_raw);
        packet.payload.putUnsignedByte(port);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a servo_output_raw message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_usec = payload.getUnsignedInt();
        this.servo1_raw = payload.getUnsignedShort();
        this.servo2_raw = payload.getUnsignedShort();
        this.servo3_raw = payload.getUnsignedShort();
        this.servo4_raw = payload.getUnsignedShort();
        this.servo5_raw = payload.getUnsignedShort();
        this.servo6_raw = payload.getUnsignedShort();
        this.servo7_raw = payload.getUnsignedShort();
        this.servo8_raw = payload.getUnsignedShort();
        this.port = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_servo_output_raw() {
        this.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_servo_output_raw( long time_usec, int servo1_raw, int servo2_raw, int servo3_raw, int servo4_raw, int servo5_raw, int servo6_raw, int servo7_raw, int servo8_raw, short port) {
        this.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;

        this.time_usec = time_usec;
        this.servo1_raw = servo1_raw;
        this.servo2_raw = servo2_raw;
        this.servo3_raw = servo3_raw;
        this.servo4_raw = servo4_raw;
        this.servo5_raw = servo5_raw;
        this.servo6_raw = servo6_raw;
        this.servo7_raw = servo7_raw;
        this.servo8_raw = servo8_raw;
        this.port = port;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_servo_output_raw( long time_usec, int servo1_raw, int servo2_raw, int servo3_raw, int servo4_raw, int servo5_raw, int servo6_raw, int servo7_raw, int servo8_raw, short port, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_usec = time_usec;
        this.servo1_raw = servo1_raw;
        this.servo2_raw = servo2_raw;
        this.servo3_raw = servo3_raw;
        this.servo4_raw = servo4_raw;
        this.servo5_raw = servo5_raw;
        this.servo6_raw = servo6_raw;
        this.servo7_raw = servo7_raw;
        this.servo8_raw = servo8_raw;
        this.port = port;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_servo_output_raw(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SERVO_OUTPUT_RAW;
        
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
        return "MAVLINK_MSG_ID_SERVO_OUTPUT_RAW - sysid:"+sysid+" compid:"+compid+" time_usec:"+time_usec+" servo1_raw:"+servo1_raw+" servo2_raw:"+servo2_raw+" servo3_raw:"+servo3_raw+" servo4_raw:"+servo4_raw+" servo5_raw:"+servo5_raw+" servo6_raw:"+servo6_raw+" servo7_raw:"+servo7_raw+" servo8_raw:"+servo8_raw+" port:"+port+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SERVO_OUTPUT_RAW";
    }
}
        