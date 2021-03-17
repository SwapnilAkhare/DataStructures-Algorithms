/*  CLOCK ANGLE PROBLEM: GIVEN TIME IN mm:hh FORMAT CALCULATE SHORTER ANGLE
    BETWEEN THE HOUR HAND AND MINUTE HAND IN ANALOG CLOCK
    FOR EXAMPLE:

                    Input:  5:30
                            Output: 15°


                            Input:  9:00
                            Output: 90°


                            Input:  12:00
                            Output: 0°

                                                 */
package Puzzle;

public class ClockAngle {
    public static int findAngle(int Hour,int Min){
         //hour hand rotate 360 in 12 hr...
        // minute  hand rotate
        //find the position of hour hand
         int hr = (Hour * 30)+ (Min * 360) / (12 * 60);

         // find the position of minute hand
         int min = (Min * 360)/(60);
          // calculate absolute angle between hr and min hand
         int angle=Math.abs(hr-min);
        //if the angle is greater than 180 then return 360 - angle
         if(angle > 180){

             angle = 360 - angle;
         }
          return angle;
    }
    public static void main(String[] args){

        int Hour= 5;
        int Min= 30;

         System.out.println(findAngle(Hour,Min));
    }
}
