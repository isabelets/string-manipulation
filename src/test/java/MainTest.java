import org.example.Main;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testeMain(){
        String input = "teste input";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Main teste = new Main();
        String reversedWord = teste.reverseWord();
        assertEquals(reversedWord, "tupni etset");
    }
}
