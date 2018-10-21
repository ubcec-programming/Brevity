import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class msgMapTestPublic {
    @BeforeClass
    public static void setup(){
        User user1 = new User(new PositionPair(1.0, 1.0), "Ben", 10);
        user1.newMessage("Hellow!");

        User user2 = new User(new PositionPair(1.0, 2.0), "Harry", 10);


    }

    @Test
    public void testEqual(){
        assertEquals(true, true);
    }


}
