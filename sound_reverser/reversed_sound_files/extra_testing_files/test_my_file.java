
import java.io.*;
import java.util.*;

public class test_my_file
{
    public static void main( String[] args ) throws IOException
    {
	if( args.length != 1 )
	    {
		System.err.println("No file name!! ");
		System.exit( 1 ); 
		}

	Scanner file = new Scanner( new  FileReader( args[0] ) );
	DoubleLL list = new DoubleLL();

	while( file.hasNextInt() )
	    list.add_to_front( file.nextInt() );
		
	System.out.println( " Printing Input forwards:");
	System.out.println( "\n " +  list.toString() );
	
	System.out.println( "\n/************************************/");

	System.out.println( " Printing Input backwards:");
	System.out.println( "\n " + list.toStringRev() );

	file.close();
    }
}