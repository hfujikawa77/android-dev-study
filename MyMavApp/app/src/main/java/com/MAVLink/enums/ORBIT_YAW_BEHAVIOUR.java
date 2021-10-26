/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/** 
 * Yaw behaviour during orbit flight.
 */
public class ORBIT_YAW_BEHAVIOUR {
   public static final int ORBIT_YAW_BEHAVIOUR_HOLD_FRONT_TO_CIRCLE_CENTER = 0; /* Vehicle front points to the center (default). | */
   public static final int ORBIT_YAW_BEHAVIOUR_HOLD_INITIAL_HEADING = 1; /* Vehicle front holds heading when message received. | */
   public static final int ORBIT_YAW_BEHAVIOUR_UNCONTROLLED = 2; /* Yaw uncontrolled. | */
   public static final int ORBIT_YAW_BEHAVIOUR_HOLD_FRONT_TANGENT_TO_CIRCLE = 3; /* Vehicle front follows flight path (tangential to circle). | */
   public static final int ORBIT_YAW_BEHAVIOUR_RC_CONTROLLED = 4; /* Yaw controlled by RC input. | */
   public static final int ORBIT_YAW_BEHAVIOUR_ENUM_END = 5; /*  | */
}
            