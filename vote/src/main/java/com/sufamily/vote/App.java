package com.sufamily.vote;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This is main page for voting appliation" );
        System.out.println("test test");
    }
    
    public static void test() {
    	System.out.println("This is test method");
    }
    
    public static String getDate() {
    	return System.currentTimeMillis() + " ms";
    }
}
