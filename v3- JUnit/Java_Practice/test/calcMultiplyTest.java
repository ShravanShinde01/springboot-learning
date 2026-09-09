import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calcMultiplyTest {

    @Test
    void testMultiply() {

        calcMultiply cal =  new calcMultiply();
        int result = cal.multiply(10, 10);

        assertEquals(100, result);
    }

}