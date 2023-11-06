package practice.sentensies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    Sentence sentence;

    @BeforeEach
    void setUp() {
        sentence=new Sentence();
    }

    @Test
    void countWords() {
        String str=" One - two three , fro .";
        assertEquals(4,sentence.countWords(str));
    }

    @Test
    void countSymbol() {
        String str ="One? two. three%";
        assertEquals(14,sentence.countSymbol(str));
    }
}