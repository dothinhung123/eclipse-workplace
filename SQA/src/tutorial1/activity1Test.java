package tutorial1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class activity1Test {

	@Test
	void test() {
		activity1 s = new activity1(23);
		assertEquals(23,s.getSalePrice(),0);
	}

}
