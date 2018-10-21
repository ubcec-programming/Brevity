import java.util.List;
import java.util.Scanner;

public class Message {

    private String containt;
    private PositionPair position;
    private User owner;
    private List<String> tags;

    public Message (String containt, PositionPair position, User owner){
        this.containt = containt;
        this.position = position;
        this.owner = owner;
        this.getTags();
    }

    public PositionPair getPosition(){return position;}

    private void getTags (){
        Scanner tagScanner = new Scanner(containt);
        String nextWord;

        while (tagScanner.hasNext()){
            nextWord = tagScanner.next();
            if (nextWord.charAt(0) == '#'){
                tags.add(nextWord);
            }
        }
    }
}
