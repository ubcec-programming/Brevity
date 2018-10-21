import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    private static User user1 = new User(new PositionPair(1.0, 1.0), "Ben", 10);
    private static User user2 = new User(new PositionPair(1.0, 2.0), "Harry", 10);


    @BeforeClass
    public static void setup(){
        user1.newMessage("Hellow!");



    }

    @Test
    public void testEqual(){
        assertEquals(1, geoMap.getMsgs(user2.getPosition(), 10).size());
    }


}
