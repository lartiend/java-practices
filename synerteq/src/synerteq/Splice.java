package synerteq;

import java.lang.Math;
import java.util.ArrayList;

public class Splice {
/*
 * Only strings are allowed as text and target.
 * len should not be zero.
 * Aug 22, 2018		: corrected isSpliceJoin
*/

	public static boolean isSameLength(String text, String target) {
		return isAlpha(text, target) == false ? false : text.length() == target.length();
	}
	public static boolean isAlpha(String text, String target) {
	    return text.matches("[a-zA-Z]+") && target.matches("[a-zA-Z]+");
	}
	public static ArrayList<String> convertToArray(String text, int len) {
		int end = (int)Math.ceil(text.length()/len) + 1;
		ArrayList<String> subSet = new ArrayList<String>();
		int cnt = 0;
		for(int idx=0;idx<end;idx++) {
			int tail = cnt+len > text.length() ? text.length() : cnt+len; 
			subSet.add(text.substring(cnt, tail));
			cnt+=len;
		}
		return subSet;
	}
	public static boolean isSpliceJoin(String text, int len, String target) {
		if(isSameLength(text, target) == false || len < 1 || len > text.length()) return false;
		ArrayList<String> textArray = convertToArray(text, len);
		for(String x: textArray) {
			System.out.println(x); // uncomment for debugging purposes only
			System.out.println(target); // uncomment for debugging purposes only
			if(target.contains(x)) target = target.replaceFirst(x, " ").trim();
		}
		return target.isEmpty();
	}
	
	public static void main(String[] args) {
		String text = "baaba";
		String target = "ababa";
		System.out.println(isSpliceJoin(text, 2, target));
	}
}

