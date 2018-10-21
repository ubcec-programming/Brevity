import java.util.ArrayList;
import java.util.List;

public class User {
    private PositionPair currentLocation;
    private String username;
    private int range;

    public User(PositionPair position, String username, int range) {
        this.currentLocation = position;
        this.username = username;
        this.range = range;
    }

    public void moveTo (int newLat, int newLong){
        this.currentLocation = new PositionPair(newLat, newLong);
    }

    public void setRange(int range){
        this.range = range;
    }

    public PositionPair getPosition() {
        return currentLocation;
    }

    public String getUserName() {
        return username;
    }

    public void newMessage(String msg){
        Message message = new Message(msg, currentLocation, this);
        geoMap.storeMsg(message);

    }

    public boolean printMessages(){
        List<Message> inRange = new ArrayList<>(geoMap.getMsgs(this.currentLocation, range));
        for (int i = 0; i < inRange.size(); i++){
            System.out.println(inRange.get(i).toString());
        }

        if (inRange.size() > 0){
            return true;
        } else {return false;}
    }

    public boolean printWarnings(){
        List<Message> inRange = new ArrayList<>(geoMap.getMsgs(this.currentLocation, range));
        Boolean haveWarnings = false;

        for (int i = 0; i < inRange.size(); i++){
            if (inRange.get(i).getTags().contains("#Warning")){
                System.out.println("Warning: ");
                System.out.println(inRange.get(i).toString());
                haveWarnings = true;
            }
        }

        if(haveWarnings == false){
            System.out.println("No Warnings Nearby");
            return false;
        } else {return true;}
    }
}
