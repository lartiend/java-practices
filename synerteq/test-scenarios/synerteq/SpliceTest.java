package synerteq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpliceTest {
	int len = 2;
	String text = "abkkx";
	
	@Test
	void abkkx_kabkx() {
		
		String target = "kabkx";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void abkkx_abkkx() {
		
		String target = "abkkx";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = true;
		assertEquals(expected,result);
	}
	@Test
	void abkkx_abkxk() {
		
		String target = "abkxk";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void abkkx_abxkk() {
		
		String target = "abxkk";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = true;
		assertEquals(expected,result);
	}
	@Test
	void abkkx_axbkk() {
		
		String target = "axbkk";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void abkkx_xabkk() {
		
		String target = "xabkk";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = true;
		assertEquals(expected,result);
	}
	@Test
	void abkkx_abkk() {
		String target = "abkk";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void unequalSize() {
		String text = "abkk";
		String target = "xabkk";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void spaces() {
		String text = " ";
		String target = " ";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void caseSensitive() {
		String target = "abXkk";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void numerals() {
		String text = "1";
		String target = "1";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void nulls() {
		String text = "";
		String target = "";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void lenZero() {
		len=0;
		String target = "abkkx";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void lenNegative() {
		len=-1;
		String target = "abkkx";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void lenEqualtoSize() {
		len = 5; 
		text = "abkkx";
		String target = "abkkx";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = true;
		assertEquals(expected,result);
	}
	@Test
	void lenLessthanSize() {
		len = 4; 
		text = "abkkx";
		String target = "abkkx";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = true;
		assertEquals(expected,result);
	}

	@Test
	void lenGreaterthanSize() {
		len = 6; 
		text = "abkkx";
		String target = "abkkx";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = false;
		assertEquals(expected,result);
	}
	@Test
	void ababa_baaba() {
		len = 2; 
		text = "ababa";
		String target = "baaba";
		
		boolean result = Splice.isSpliceJoin(text, len, target);
		boolean expected = true;
		assertEquals(expected,result);
	}
	
}
