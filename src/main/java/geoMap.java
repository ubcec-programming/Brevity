import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class geoMap {
    // creates a preset map with doubles: latitude and longitude
    public List<PositionPair> keyList;
    public Map<PositionPair, String> location;

    public static void main (String [] args){
        //List<PositionPair> keyList = new ArrayList<>();


    }

    public void storeMsg(Message msg){
        location.put(msg.getPosition(), msg.toString());
        keyList.add(msg.getPosition());
    }

    public List<String> getMsgs(PositionPair user, int range){
        List<String> localMsgs = new ArrayList<>();
        for (int x = 0; x < keyList.size(); x++){
            if (withinRange(user, keyList.get(x), range)){
                localMsgs.add( location.get(keyList.get(x)));
            }
        }
        return localMsgs;
    }

    private boolean withinRange(PositionPair user, PositionPair message, int range){
        double distance = Math.sqrt( Math.pow((user.getLatitude() - message.getLatitude()), 2) + Math.pow((user.getLongitude() - message.getLongitude()), 2) );
        if (distance < range){
            return true;
        }
        return false;
    }


}

