package application;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

/**
 * 
 * @author Arthur Fasano
 * @version 4/10/2023
 *
 */

public class JunitTest {
	
@Test
/**
 * Test comment
 */
	public void test() throws Exception {
		//int outLimit = 1;
		String[] words = new String[] {"foo"};
		List<Word> output = wordOccur.getOccurrences(words, 1);
		wordOccur.getOccurrences(words, 20).forEach(w -> System.out.printf("%s %s\n", w.word, w.frequency));
		assertEquals(("foo"+1), output);

	}

}
