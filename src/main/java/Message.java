import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Message {

    private String containt;
    private PositionPair position;
    private User owner;
    private List<String> tags = new ArrayList<>();

    public Message (String containt, PositionPair position, User owner){
        this.containt = containt;
        this.position = position;
        this.owner = owner;
        this.storeTags();
    }

    public PositionPair getPosition(){return position;}

    public String toString (){
        String result;
        result = owner.getUserName() + ": " + "\n" + containt;
        return result;
    }

    public List<String> getTags(){return new ArrayList<>(tags);}


    private void storeTags (){
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
