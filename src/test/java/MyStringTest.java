import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by david on 24.05.2018.
 */
public class MyStringTest {
    @Test
    public void testWhenHash_givenNotNull_thenExpectedHash() throws Exception {
        //given
        final MyString myString = new MyString("abc");
        final int expectedHash = 1;
        //when
        final int hash = myString.hash();
        //then
        assertEquals(expectedHash, hash);
    }

    @Test
    public void testWhenHash_givenNull_thenZero() throws Exception {
        //given
        final MyString myString = new MyString(null);
        final int expectedHash = 0;
        //when
        final int hash = myString.hash();
        //then
        assertEquals(expectedHash, hash);
    }
}
