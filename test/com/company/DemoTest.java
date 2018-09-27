package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest {
    @Test
    public void testAdd0and1() {

        int expected = 1;

        int res = Demo.add(0, 1);

        assertEquals(expected, res);
    }
    @Test
    public void testPrintDate1(){

        int expected = 2;

        int res = Demo.printNextDay(1,1,2018);
        assertEquals(expected, res);
    }
    @Test
    public void testPrintDate2(){
        int a = 31;
        int b = 1;
        int c = 2018;

        int expected = 1;

        int res = Demo.printNextDay(a,b,c);
        assertEquals(expected, res);
    }
    @Test
    public void testPrintDate3(){
        int a = 30;
        int b = 4;
        int c = 2018;

        int expected = 1;

        int res = Demo.printNextDay(a,b,c);
        assertEquals(expected, res);
    }
    @Test
    public void testPrintDate4(){
        int a = 28;
        int b = 2;
        int c = 2018;

        int expected = 29;

        int res = Demo.printNextDay(a,b,c);
        assertEquals(expected, res);
    }
    @Test
    public void testPrintDate5(){
        int a = 29;
        int b = 2;
        int c = 2020;

        int expected = 1;

        int res = Demo.printNextDay(a,b,c);
        assertEquals(expected, res);
    }
    @Test
    public void testPrintDate6(){
        int a = 31;
        int b = 12;
        int c = 2018;

        int expected = 1;

        int res = Demo.printNextDay(a,b,c);
        assertEquals(expected, res);
    }

}
