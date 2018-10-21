

public class User {
    private double longitude;
    private double latitude;
    private String username;
    private int range;
//    private List<Message> message=new ArrayList<>();

    public User(double longitude, double latitude, String username, int range) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.username = username;
        this.range = range;
    }

    public void newMessage(String msg){
        Message message = new Message(msg, new PositionPair(latitude, longitude), this);
    }

    public List<Message> getMessage() {
        return message;
    }
}
