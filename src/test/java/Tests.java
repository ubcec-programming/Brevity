import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    private static User user1 = new User(new PositionPair(1.0, 1.0), "Ben", 10);
    private static User user2 = new User(new PositionPair(1.0, 2.0), "Harry", 10);


    @BeforeClass
    public static void setup(){
        user1.newMessage("Hello!");
        user1.moveTo(20,20);
        user1.newMessage("Hello2!");


    }

    @Test
    public void testEqual(){
        assertEquals(1, geoMap.getMsgs(user2.getPosition(), 10).size());
    }

    @Test
    public void testEqual2(){
        user2.moveTo(-20,-20);
        assertEquals(0, geoMap.getMsgs(user2.getPosition(), 10).size());
    }

    @Test
    public void testEqual3(){
        assertEquals(2, geoMap.getMsgs(user2.getPosition(), 100).size());
    }


}
