package Classwork;

public class Midterm_Q3 {
    public static void main(String[] args) {
        int SpeedLimit = 70;
        int milesOver = 5;public String licensePointCalculator(int speedLimit, int userSpeed) {
            int milesOver = userSpeed - speedLimit;
            int licensePoints = Math.floorDiv(milesOver,5);
            String message = "you are suspended";
            if (licensePoints > 1 && licensePoints < 12) {
                message = "You have a total of " + licensePoints + " points.";
            } else if (licensePoints >= 12) {
                message = "You have reached: " + licensePoints + " points. Your license will be suspended.";
            }
        }



    }
}



//Scenario: Traffic ticketing system
//        1. Speed Limit = 70
//        2. Every 5 miles over the speed limit will add 1 point
//        3. Use Math.floor(1.4)to round the speed to downward value
//        4. If user reaches 12 points then license is suspended
//        Example:
//        userspeed=78(70-75->1point)
//        userspeed=88(70-75->1point,75-80->1point,80-85->1point ; total 3 points)