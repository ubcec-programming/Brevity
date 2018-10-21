

public class User {
    private PositionPair position;
    private String username;
    private int range;
//    private List<Message> message=new ArrayList<>();

    public User(PositionPair position, String username, int range) {
        this.position = position;
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
