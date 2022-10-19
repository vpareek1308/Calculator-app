package project.testcompany.com.mytestapplication;
import org.junit.Test;
import static org.junit.Assert.*;
public class ExampleUnitTest {
    @Test
    public void add_isCorrect() throws Exception {
        assertEquals(4, Utils.addNumbers(2 , 2));
    }
    @Test
    public void add_twodigits_isCorrect() throws Exception {
        assertEquals(44, Utils.addNumbers(22 , 22));
    }
    @Test
    public void add_big_isCorrect() throws Exception {
        assertEquals(4444, Utils.addNumbers(2222 , 2222));
    }
    
}