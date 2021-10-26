/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SCALED_IMU3 PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * The RAW IMU readings for 3rd 9DOF sensor setup. This message should contain the scaled values to the described units
 */
public class msg_scaled_imu3 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SCALED_IMU3 = 129;
    public static final int MAVLINK_MSG_LENGTH = 22;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SCALED_IMU3;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * X acceleration
     */
    public short xacc;
      
    /**
     * Y acceleration
     */
    public short yacc;
      
    /**
     * Z acceleration
     */
    public short zacc;
      
    /**
     * Angular speed around X axis
     */
    public short xgyro;
      
    /**
     * Angular speed around Y axis
     */
    public short ygyro;
      
    /**
     * Angular speed around Z axis
     */
    public short zgyro;
      
    /**
     * X Magnetic field
     */
    public short xmag;
      
    /**
     * Y Magnetic field
     */
    public short ymag;
      
    /**
     * Z Magnetic field
     */
    public short zmag;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_SCALED_IMU3;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putShort(xacc);
        packet.payload.putShort(yacc);
        packet.payload.putShort(zacc);
        packet.payload.putShort(xgyro);
        packet.payload.putShort(ygyro);
        packet.payload.putShort(zgyro);
        packet.payload.putShort(xmag);
        packet.payload.putShort(ymag);
        packet.payload.putShort(zmag);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a scaled_imu3 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.xacc = payload.getShort();
        this.yacc = payload.getShort();
        this.zacc = payload.getShort();
        this.xgyro = payload.getShort();
        this.ygyro = payload.getShort();
        this.zgyro = payload.getShort();
        this.xmag = payload.getShort();
        this.ymag = payload.getShort();
        this.zmag = payload.getShort();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_scaled_imu3() {
        this.msgid = MAVLINK_MSG_ID_SCALED_IMU3;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_scaled_imu3( long time_boot_ms, short xacc, short yacc, short zacc, short xgyro, short ygyro, short zgyro, short xmag, short ymag, short zmag) {
        this.msgid = MAVLINK_MSG_ID_SCALED_IMU3;

        this.time_boot_ms = time_boot_ms;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        this.xmag = xmag;
        this.ymag = ymag;
        this.zmag = zmag;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_scaled_imu3( long time_boot_ms, short xacc, short yacc, short zacc, short xgyro, short ygyro, short zgyro, short xmag, short ymag, short zmag, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SCALED_IMU3;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        this.xmag = xmag;
        this.ymag = ymag;
        this.zmag = zmag;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_scaled_imu3(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SCALED_IMU3;
        
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
        return "MAVLINK_MSG_ID_SCALED_IMU3 - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" xacc:"+xacc+" yacc:"+yacc+" zacc:"+zacc+" xgyro:"+xgyro+" ygyro:"+ygyro+" zgyro:"+zgyro+" xmag:"+xmag+" ymag:"+ymag+" zmag:"+zmag+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SCALED_IMU3";
    }
}
        