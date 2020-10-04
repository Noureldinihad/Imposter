import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class unitTest {

    @Test
    public void sumTest(){
        assertEquals(5,calculations.sum(3,2));
        System.out.println("done");
    }
    @Test
    public void diffTest(){
        assertEquals(5,calculations.diff(10,5));
    }
    @Test
    public void multiplyTest(){
        assertEquals(6,calculations.multiply(2,3));
    }
    @Test
    public void divisionTest(){
        assertEquals(3,calculations.division(6,2));
    }
}
