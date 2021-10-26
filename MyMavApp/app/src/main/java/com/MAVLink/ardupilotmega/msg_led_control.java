/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE LED_CONTROL PACKING
package com.MAVLink.ardupilotmega;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
        
/**
 * Control vehicle LEDs.
 */
public class msg_led_control extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_LED_CONTROL = 186;
    public static final int MAVLINK_MSG_LENGTH = 29;
    private static final long serialVersionUID = MAVLINK_MSG_ID_LED_CONTROL;

      
    /**
     * System ID.
     */
    public short target_system;
      
    /**
     * Component ID.
     */
    public short target_component;
      
    /**
     * Instance (LED instance to control or 255 for all LEDs).
     */
    public short instance;
      
    /**
     * Pattern (see LED_PATTERN_ENUM).
     */
    public short pattern;
      
    /**
     * Custom Byte Length.
     */
    public short custom_len;
      
    /**
     * Custom Bytes.
     */
    public short custom_bytes[] = new short[24];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_LED_CONTROL;
        
        packet.payload.putUnsignedByte(target_system);
        packet.payload.putUnsignedByte(target_component);
        packet.payload.putUnsignedByte(instance);
        packet.payload.putUnsignedByte(pattern);
        packet.payload.putUnsignedByte(custom_len);
        
        for (int i = 0; i < custom_bytes.length; i++) {
            packet.payload.putUnsignedByte(custom_bytes[i]);
        }
                    
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a led_control message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();
        
        this.target_system = payload.getUnsignedByte();
        this.target_component = payload.getUnsignedByte();
        this.instance = payload.getUnsignedByte();
        this.pattern = payload.getUnsignedByte();
        this.custom_len = payload.getUnsignedByte();
         
        for (int i = 0; i < this.custom_bytes.length; i++) {
            this.custom_bytes[i] = payload.getUnsignedByte();
        }
                
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_led_control() {
        this.msgid = MAVLINK_MSG_ID_LED_CONTROL;
    }
    
    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_led_control( short target_system, short target_component, short instance, short pattern, short custom_len, short[] custom_bytes) {
        this.msgid = MAVLINK_MSG_ID_LED_CONTROL;

        this.target_system = target_system;
        this.target_component = target_component;
        this.instance = instance;
        this.pattern = pattern;
        this.custom_len = custom_len;
        this.custom_bytes = custom_bytes;
        
    }
    
    /**
     * Constructor for a new message, initializes everything
     */
    public msg_led_control( short target_system, short target_component, short instance, short pattern, short custom_len, short[] custom_bytes, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_LED_CONTROL;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.target_system = target_system;
        this.target_component = target_component;
        this.instance = instance;
        this.pattern = pattern;
        this.custom_len = custom_len;
        this.custom_bytes = custom_bytes;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_led_control(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_LED_CONTROL;
        
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
        return "MAVLINK_MSG_ID_LED_CONTROL - sysid:"+sysid+" compid:"+compid+" target_system:"+target_system+" target_component:"+target_component+" instance:"+instance+" pattern:"+pattern+" custom_len:"+custom_len+" custom_bytes:"+custom_bytes+"";
    }
    
    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_LED_CONTROL";
    }
}
        