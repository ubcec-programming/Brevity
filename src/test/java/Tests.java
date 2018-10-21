import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    private static User user1 = new User(new PositionPair(1.0, 1.0), "Ben", 10);
    private static User user2 = new User(new PositionPair(0.0, 0.0), "Jerry", 10);


    @BeforeClass
    public static void setup(){
        user1.newMessage("Hello world!");
        user1.moveTo(50,20);
        user1.newMessage("5.6 magnitude earthquake #Warning");
        user1.moveTo(50,25);
        user1.newMessage("Purple prepubescent potatoes");
    }

    @Test
    public void testl(){
        user2.printMessages();
    }

    @Test
    public void test2(){
        user2.moveTo(-20,-20);
        user2.printMessages();
    }

    @Test
    public void test3(){
        user1.printMessages();
    }

    @Test
    public void test4(){
        user1.printWarnings();
    }


}
