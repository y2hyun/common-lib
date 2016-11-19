package net.y2hyun.common.utils;

/**
 * useful string utilities.
 * 
 * @author Yihyun Yang
 *
 */
public class StringUtils {

	private StringUtils() {}
	
	/**
	 * check empty string
	 * @param str
	 * @return 
	 */
	public static boolean isEmpty(String str) {
		if(str == null || str.length() == 0) return true;
		return false;
	}
	
	final static char SPACE = 0x20;
	final static char FULLWIDTH_SPACE = 0x3000;
	
	/**
	 * trim halfwidth space and fullwidth space
	 * @param str
	 * @return trimed string
	 */
	public static String trimJ(String str) {
		if(isEmpty(str)) return str;
		
		char[] chars = str.toCharArray();
		int frontPos = 0;
		int endPos = chars.length-1;
		
		while(frontPos < chars.length) {
			if(chars[frontPos] != SPACE && chars[frontPos] != FULLWIDTH_SPACE) break;
			frontPos++;
		}

		while(endPos > 0) {
			if(chars[endPos] != SPACE && chars[endPos] != FULLWIDTH_SPACE) break;
			endPos--;
		}
		return str.substring(frontPos, endPos+1);
	}
}
