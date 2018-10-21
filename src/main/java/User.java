import java.util.ArrayList;
import java.util.List;

public class User {
    private PositionPair currentLocation;
    private String username;
//    private List<Message> message=new ArrayList<>();

    public User(PositionPair position, String username, int range) {
        this.currentLocation = position;
        this.username = username;
    }

    public PositionPair getPosition() {
        return currentLocation;
    }

    public String getUsername() {
        return username;
    }

    public void newMessage(String msg){
        Message message = new Message(msg, currentLocation, this);
        geoMap.storeMsg(message);

    }

    public void printMessages(int range){
        List<Message> inRange = new ArrayList<>(geoMap.getMsgs(this.currentLocation, range));
        for (int i = 0; i < inRange.size(); i++){
            System.out.println(inRange.get(i).toString());
        }
    }


}
