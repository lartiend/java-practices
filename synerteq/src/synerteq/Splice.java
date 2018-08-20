package synerteq;

import java.lang.Math;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Splice {
/*
 * Only strings are allowed as text and target.
 * len should not be zero.
 * 
*/

	public boolean isSameLength(String text, String target) {
		return isAlpha(text, target) == false ? false : text.length() == target.length();
	}
	public boolean isAlpha(String text, String target) {
	    return text.matches("[a-zA-Z]+") && target.matches("[a-zA-Z]+");
	}
	public ArrayList<String> convertToArray(String text, int len) {
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
	public boolean isSpliceJoin(String text, int len, String target) {
		if(isSameLength(text, target) == false || len == 0) return false;
		Splice fstring = new Splice();
		ArrayList<String> farray = fstring.convertToArray(text, len);
		
		for(String x: farray) {
			if(target.contains(x)) {
				target = target.replaceFirst(x, "");
			}
		}
		
		return target.isEmpty();
	}
	
	public static void main(String[] args) {
		Splice demo = new Splice();
		String text = "abaca";
		String target = "abaaca";
		int len = 2;
		
		System.out.println(demo.isSpliceJoin(text, len, target));
		Queue<String> q = new LinkedList<>();
		q.
	}

}
