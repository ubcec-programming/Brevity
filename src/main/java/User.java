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

    public PositionPair getPosition() {
        return position;
    }

    public String getUsername() {
        return username;
    }

    public int getRange() {
        return range;
    }

    public void newMessage(String msg){
        Message message = new Message(msg, position, this);
    }


}
