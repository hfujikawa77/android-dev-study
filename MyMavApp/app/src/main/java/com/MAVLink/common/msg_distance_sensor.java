/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE DISTANCE_SENSOR PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Distance sensor information for an onboard rangefinder.
 */
public class msg_distance_sensor extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_DISTANCE_SENSOR = 132;
    public static final int MAVLINK_MSG_LENGTH = 14;
    private static final long serialVersionUID = MAVLINK_MSG_ID_DISTANCE_SENSOR;

      
    /**
     * Timestamp (time since system boot).
     */
    public long time_boot_ms;
      
    /**
     * Minimum distance the sensor can measure
     */
    public int min_distance;
      
    /**
     * Maximum distance the sensor can measure
     */
    public int max_distance;
      
    /**
     * Current distance reading
     */
    public int current_distance;
      
    /**
     * Type of distance sensor.
     */
    public short type;
      
    /**
     * Onboard ID of the sensor
     */
    public short id;
      
    /**
     * Direction the sensor faces. downward-facing: ROTATION_PITCH_270, upward-facing: ROTATION_PITCH_90, backward-facing: ROTATION_PITCH_180, forward-facing: ROTATION_NONE, left-facing: ROTATION_YAW_90, right-facing: ROTATION_YAW_270
     */
    public short orientation;
      
    /**
     * Measurement variance. Max standard deviation is 6cm. UINT8_MAX if unknown.
     */
    public short covariance;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
        
        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putUnsignedShort(min_distance);
        packet.payload.putUnsignedShort(max_distance);
        packet.payload.putUnsignedShort(current_distance);
        packet.payload.putUnsignedByte(type);
        packet.payload.putUnsignedByte(id);
        packet.payload.putUnsignedByte(orientation);
        packet.payload.putUnsignedByte(covariance);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a distance_sensor message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.time_boot_ms = payload.getUnsignedInt();
        this.min_distance = payload.getUnsignedShort();
        this.max_distance = payload.getUnsignedShort();
        this.current_distance = payload.getUnsignedShort();
        this.type = payload.getUnsignedByte();
        this.id = payload.getUnsignedByte();
        this.orientation = payload.getUnsignedByte();
        this.covariance = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_distance_sensor() {
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_distance_sensor( long time_boot_ms, int min_distance, int max_distance, int current_distance, short type, short id, short orientation, short covariance) {
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;

        this.time_boot_ms = time_boot_ms;
        this.min_distance = min_distance;
        this.max_distance = max_distance;
        this.current_distance = current_distance;
        this.type = type;
        this.id = id;
        this.orientation = orientation;
        this.covariance = covariance;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_distance_sensor( long time_boot_ms, int min_distance, int max_distance, int current_distance, short type, short id, short orientation, short covariance, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.min_distance = min_distance;
        this.max_distance = max_distance;
        this.current_distance = current_distance;
        this.type = type;
        this.id = id;
        this.orientation = orientation;
        this.covariance = covariance;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_distance_sensor(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_DISTANCE_SENSOR;
        
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
        return "MAVLINK_MSG_ID_DISTANCE_SENSOR - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" min_distance:"+min_distance+" max_distance:"+max_distance+" current_distance:"+current_distance+" type:"+type+" id:"+id+" orientation:"+orientation+" covariance:"+covariance+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_DISTANCE_SENSOR";
    }
}
        