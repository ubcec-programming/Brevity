import java.util.ArrayList;
import java.util.List;

public class geoMap {
    // creates a preset map with doubles: latitude and longitude
    public static List<Message> msgList = new ArrayList<>();

    public static void storeMsg(Message msg){
        msgList.add(msg);
    }

    public static List<Message> getMsgs(PositionPair user, int range){
        List<Message> localMsgs = new ArrayList<>();

        for (int x = 0; x < msgList.size(); x++){
            if (withinRange(user, msgList.get(x).getPosition(), range)){
                localMsgs.add( msgList.get(x));
            }
        }
        return localMsgs;
    }

    public static List<Message> getTaggedMsgs(PositionPair user, int range){
        List<Message> localMsgs = new ArrayList<>();

        for (int x = 0; x < msgList.size(); x++){
            if (withinRange(user, msgList.get(x).getPosition(), range)){
                localMsgs.add( msgList.get(x));
            }
        }
        return localMsgs;
    }

    private static boolean withinRange(PositionPair user, PositionPair message, int range){
        double distance = Math.sqrt( Math.pow((user.getLatitude() - message.getLatitude()), 2) + Math.pow((user.getLongitude() - message.getLongitude()), 2) );
        if (distance < range){
            return true;
        }
        return false;
    }


}

