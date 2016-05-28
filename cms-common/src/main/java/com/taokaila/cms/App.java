package com.taokaila.cms;

import java.math.BigInteger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Integer a = new Integer(23);
//        int a = 23;
        BigInteger bi = new BigInteger("0");
        bi = bi.setBit(1);
        bi = bi.setBit(2);
        bi = bi.setBit(23);
        System.out.println(bi);
        boolean b = bi.testBit(a);
        System.out.println(b);

    }
}
