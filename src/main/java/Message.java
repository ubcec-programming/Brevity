import java.util.List;

public class Message {

    private String containt;
    private PositionPair position;
    private User owner;
    private List<String> tags;

    public Message (String containt, PositionPair position, User owner){
        this.containt = containt;
        this.position = position;
        this.owner = owner;
    }
}
