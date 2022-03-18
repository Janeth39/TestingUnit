import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class simpleStuffTest {

    @Test
    void someStuff5(){
        int expected = 5;
        int actual = simpleStuff.someStuff(false);
        assertEquals( expected, actual);
    }

    @Test
    void someStuff10(){
        int expected = 10;
        int actual = simpleStuff.someStuff(true);
        assertEquals( expected, actual);
    }

}
