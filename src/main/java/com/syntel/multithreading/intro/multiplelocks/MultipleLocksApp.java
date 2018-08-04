package com.syntel.multithreading.intro.multiplelocks;

/**
 * Hello world!
 *
 */
public class MultipleLocksApp 
{
    public static void main( String[] args )
    {
        Worker worker=new Worker();
        worker.main();
    }
}
