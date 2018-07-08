package com.speldipn.example.java8;

import org.junit.Assert;
import org.junit.Test;


/*
 * @author Oh, joon young (speldipn)
 * @since 2018-06-25
 */
public class CalculatorServiceTest {
  @Test
  public void testCalculateSum() throws Exception {
    CalculatorService service = new CalculatorService();
    final int actual = service.calculate('+', 10, 20);
    Assert.assertEquals(30, actual);
  }

  @Test
  public void testCalculateSubtract() throws Exception {
    CalculatorService service = new CalculatorService();
    final int actual = service.calculate('-', 30, 20);
    Assert.assertEquals(10, actual);
  }

  @Test
  public void testCalculateMultiple() throws Exception {
    CalculatorService service = new CalculatorService();
    final int actual = service.calculate('*', 10, 20);
    Assert.assertEquals(200, actual);
  }

  @Test
  public void testCalculateDivision() throws Exception {
    CalculatorService service = new CalculatorService();
    final int actual = service.calculate('/', 30, 5);
    Assert.assertEquals(6, actual);
  }
}