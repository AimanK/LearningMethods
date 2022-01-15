public class Plane {

   private String make;  // Plane manufacturer
   private int fuel_level; // Fuel remaining (in %, starting at 100%)
   private int current_altitude; // Planes current altitude (in feet)
   private int max_altitude; // Planes max altitude (in feet)


    Plane(String make, int fuel_level, int current_altitude, int max_altitude)
    {
        this.make = make;
        this.fuel_level = fuel_level;
        this.current_altitude = current_altitude;
        this.max_altitude = max_altitude;
    }

    /*
       Accessor method to return plane manufacturer
     */
    public String getMake()
    {
        return make;
    }

    /*
       Accessor method to return plane fuel level
     */
    public int getFuel_level()
    {
        return fuel_level;
    }

    /*
        Accessor method to return planes current altitude
     */
    public int getCurrent_altitude()
    {
        return current_altitude;
    }

    /*
       Accessor method to return planes max altitude
    */
    public int getMax_altitude()
    {
        return max_altitude;
    }

    /*
        Create a helper method that checks if you are above max altitude
     */
    private static boolean safeMaxAltitude( int current_altitude, int max_altitude)
    {
        if (current_altitude >= max_altitude)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /*
        Create a method to ascend the plane safely
     */
    public void ascend(int ascend_amount)
    {
        if (safeMaxAltitude(10000,  30000) == true && fuel_level >= 50)
        {
            current_altitude = ascend_amount + current_altitude;
        }
        else
        {
            current_altitude = current_altitude;
        }
    }


    /*
        Create a method to descend the plane safely
     */
    public void descend(int descend_amount)
    {
        if (safeMinAltitude(20000, 5000) == true)
        {
            current_altitude = current_altitude - descend_amount;
        }
        else
        {
            current_altitude = current_altitude;
        }
    }

    /*
        Check if plane is descending below minimum value (helper method)
     */
    private static boolean safeMinAltitude(int current_altitude, int min_altitude)
    {
        min_altitude = 5000;

        if (current_altitude <= min_altitude)
        {
            return false;
        }
        else
        {
            return true;
        }
    }



}
