package com.speldipn.example.algorithm;

import org.junit.Assert;
import org.junit.Test;


/*
 * @author Oh, joon young (speldipn)
 * @since 2018-06-29
 */
public class LongestPalindromTest {
  @Test
  public void test() throws Exception {
    LongestPalindrom obj = new LongestPalindrom();
    String result = obj.getLongestPalindrom("babad");
    Assert.assertEquals("bab", result);
  }

  @Test
  public void test1() throws Exception {
    LongestPalindrom obj = new LongestPalindrom();
    String result = obj.getLongestPalindrom("cbbd");
    Assert.assertEquals("bb", result);
  }

}