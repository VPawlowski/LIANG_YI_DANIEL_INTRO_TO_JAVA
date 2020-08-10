package com.liang.y.daniel.chapter.four;

/* Use the GPS locations for Atlanta, Georgia; Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the
figure in Section 4.1 to compute the estimated area enclosed by these four cities. (Hint: Use the formula in Programming
Exercise 4.2 to compute the distance between two cities. Divide the polygon into two triangles and use the formula in
Programming Exercise 2.19 to compute the area of a triangle.)

    Charlotte (35.2270869, –80.8431267)
    Atlanta (33.7489954, –84.3879824)
    Savannah (32.0835407, –81.0998342)
    Orlando (28.5383355, –81.3792365) */

public class EstimateAreas {
    public static void main(String[] args) {
        // Longitude and latitude of all cities are made into doubles for ease of access
        final double CHARLOTTE_X = 35.227_086_9;
        final double CHARLOTTE_Y = -80.843_126_7;
        final double ATLANTA_X = 33.748_995_4;
        final double ATLANTA_Y = -84.387_982_4;
        final double SAVANNAH_X = 32.083_540_7;
        final double SAVANNAH_Y = -81.099_834_2;
        final double ORLANDO_X = 28.538_335_5;
        final double ORLANDO_Y = -81.379_236_5;
        // Required for later calculations
        final double AVERAGE_EARTH_RADIUS = 6_371.01;
        /* Cut polygon in half to form triangles; calculate distance between Charlotte and Orlando; side C for both
        triangles. Formula from exercise 4.2 to calculate distance between two points (only works with radians) */
        double sideC = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(CHARLOTTE_X))
                * Math.sin(Math.toRadians(ORLANDO_X)) + Math.cos(Math.toRadians(CHARLOTTE_X))
                * Math.cos(Math.toRadians(ORLANDO_X)) * Math.cos(Math.toRadians(CHARLOTTE_Y) - Math.toRadians(ORLANDO_Y)));
        // Calculate distance between Charlotte and Atlanta
        double firstSideA = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(CHARLOTTE_X))
                * Math.sin(Math.toRadians(ATLANTA_X)) + Math.cos(Math.toRadians(CHARLOTTE_X))
                * Math.cos(Math.toRadians(ATLANTA_X)) * Math.cos(Math.toRadians(CHARLOTTE_Y) - Math.toRadians(ATLANTA_Y)));
        // Calculate distance between Atlanta and Orlando
        double firstSideB = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(ATLANTA_X))
                * Math.sin(Math.toRadians(ORLANDO_X)) + Math.cos(Math.toRadians(ATLANTA_X))
                * Math.cos(Math.toRadians(ORLANDO_X)) * Math.cos(Math.toRadians(ATLANTA_Y) - Math.toRadians(ORLANDO_Y)));
        // compute s of triangle one and its corresponding area
        double firstS = (firstSideA + firstSideB + sideC) / 2;
        double firstTriangleArea = Math.pow((firstS * ((firstS - firstSideA) * (firstS - firstSideB)
                * (firstS - sideC))), 0.5);
        // Calculate distance between Charlotte and Savannah
        double secondSideA = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(CHARLOTTE_X))
                * Math.sin(Math.toRadians(SAVANNAH_X)) + Math.cos(Math.toRadians(CHARLOTTE_X))
                * Math.cos(Math.toRadians(SAVANNAH_X)) * Math.cos(Math.toRadians(CHARLOTTE_Y) - Math.toRadians(SAVANNAH_Y)));
        // Calculate distance between Savannah and Orlando
        double secondSideB = AVERAGE_EARTH_RADIUS * Math.acos(Math.sin(Math.toRadians(SAVANNAH_X))
                * Math.sin(Math.toRadians(ORLANDO_X)) + Math.cos(Math.toRadians(SAVANNAH_X))
                * Math.cos(Math.toRadians(ORLANDO_X)) * Math.cos(Math.toRadians(SAVANNAH_Y) - Math.toRadians(ORLANDO_Y)));
        // compute s of triangle two and its corresponding area
        double secondS = (secondSideA + secondSideB + sideC) / 2;
        double secondTriangleArea = Math.pow((secondS * ((secondS - secondSideA) * (secondS - secondSideB)
                * (secondS - sideC))), 0.5);
        System.out.println(firstTriangleArea + secondTriangleArea);
    }
}
