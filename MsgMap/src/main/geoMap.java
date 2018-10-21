import java.util.ArrayList;

public class geoMap {
    // creates a preset map with doubles: latitude and longitude
    public double latitude, longitude;
    public PositionPair[] keyList;

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
        keyList.add(coordinates);
    }

    public String[] getMsgs(PositionPair user, int range){

        for (int x = 0; x < keyList.length; x++){
            if (withinRange(user, keyList.get(x), range)){

            }
        }

    }

    private boolean withinRange(PositionPair user, PositionPair message, int range){
        double distance = Math.sqrt( Math.pow((user.getLatitude() - message.getLatitude()), 2) + Math.pow((user.getLongitude() - message.getLongitude()), 2) );
        if (distance < range){
            return true;
        }
        return false;
    }


}
