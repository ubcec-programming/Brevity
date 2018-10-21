import java.lang.Object.android.location.Location;
import java.util.ArrayList;

public class geoMap {
    // creates a preset map with doubles: latitude and longitude
    public double latitude, longitude;

    public static void main (String [] args){
        List<PositionPair> coordinates = new ArrayList<>();


    }
    /**
     * Create a new Location given a latitude and longitude pair
     *
     * @param latitude not null, between -100 and 100
     * @param longitude not null, between -100 and 100
     */
    public void PositionPair(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void msgLocation(PositionPair coordinates, String message){
        Map<PositionPair, String> location = new HashMap<PositionPair, String>();
        location.put(coordinates, message);
    }

    public String[] getMsg(PositionPair coordinates, int range){
        //for ()
        float distanceInMeters = coordinates.distanceTo(test);
        boolean isWithinRange = distanceInMeters < range;

        float[] results = new float[1];
        Location.distanceBetween(centerLatitude, centerLongitude, testLatitude, testLongitude, results);
        float distanceInMeters = results[0];
        boolean isWithin10km = distanceInMeters < 10000;

    }


}
