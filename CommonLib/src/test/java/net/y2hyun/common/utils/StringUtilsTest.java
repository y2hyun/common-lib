package net.y2hyun.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void trimJTest() {

		String testStr = "abcd";
		String testStr2 = " abcd";
		String testStr3 = "abcd ";
		String testStr4 = " abcd ";
		
		String testStr5 = " 　abcd　 ";
		String testStr6 = "a　bcd 　";
		String testStr7 = "　 ab cd ";
		String testStr8 = " ";
		String testStr9 = "";

		assertEquals("abcd", StringUtils.trimJ(testStr));
		assertEquals("abcd", StringUtils.trimJ(testStr2));
		assertEquals("abcd", StringUtils.trimJ(testStr3));
		assertEquals("abcd", StringUtils.trimJ(testStr4));
		assertEquals("abcd", StringUtils.trimJ(testStr5));
		assertEquals("a　bcd", StringUtils.trimJ(testStr6));
		assertEquals("ab cd", StringUtils.trimJ(testStr7));
		assertEquals(StringUtils.trimJ(testStr8), "");
		assertEquals(StringUtils.trimJ(testStr9), "");
	}

}
