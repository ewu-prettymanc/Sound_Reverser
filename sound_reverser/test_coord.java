
import java.io.*;
import java.util.*;

public class test_coord
{
    public static void main( String[] args ) 
    {
	DoubleLL list = new DoubleLL();
	int i, j;
	
	for( j=0; j < 3; j ++ )
	    {
		
		for( i = 0; i< 20; i++ )
		    list.add_to_front( new Coord( i, i ) );
		
		System.out.println( "\n\n/************************************/");
		System.out.println( "Added to front -> \nPrinting Coordinates forwards:");
		System.out.println( "\n " +  list.toString() );
		
		System.out.println( " Printing Coordinates backwards:");
		System.out.println( "\n " + list.toStringRev() );
		
		
		
		for( i = 0; i < 20; i++ )
		    list.delete_from_front();
		
		System.out.println( "\n\n/************************************/");
		System.out.println( "Deleted list from front:\n");
		
		System.out.println( "Forwards: " );
		System.out.println( list );
		
		System.out.println( "Backwards: " );
		System.out.println( list.toStringRev() );
		
		
		
		for( i = 0; i< 20; i++ )
		    list.add_to_back( new Coord( i, i ) );
		
		System.out.println( "\n\n/************************************/");
		
		System.out.println( "Added to back -> \nPrinting Coordinates forwards:");
		System.out.println( "\n " +  list.toString() );
		
		System.out.println( " Printing Coordinates backwards:");
		System.out.println( "\n " + list.toStringRev() );
		
		
		
		for( i = 0; i < 20; i++ )
		    list.delete_from_front();
		
		System.out.println( "\n\n/************************************/");
		
		System.out.println( "Deleted list from back:\n");
		System.out.println( "Forwards: " );
		System.out.println( list );
		
		System.out.println( "Backwards: " );
		System.out.println( list.toStringRev() );
	    }
    }
}