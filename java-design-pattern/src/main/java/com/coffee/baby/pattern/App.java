package com.coffee.baby.pattern;


//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
//    private static final Logger logger = LogManager.getLogger(App.class.getName());

    private final static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.error( "Hello World! Log4j" );
        System.out.println( "Hello World!" );
    }
}
