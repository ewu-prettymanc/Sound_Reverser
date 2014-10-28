import java.io.*;
import java.util.*;

public class reverse_dat
{
    public static void main( String[] args )
    {
	if( args.length != 2 )
	    {
		System.out.println( 
			       "Usage: java reverse_dat "+
			       "<infilename.dat> <outfiname.dat>");
		System.exit( 1 );
	    }

	Scanner infile = null;
	PrintWriter outfile = null;

	Scanner scan = new Scanner( System.in );
	String filename_in = args[0];
	String filename_out = args[1];
	boolean done = false;

	Dat sound  = null;
	
	while( ! done )
	    {
		try
		    {
			infile = new Scanner( new FileReader( filename_in ) );
			done = true;
		    }
		catch( FileNotFoundException e )
		    {
			System.out.print( "Please enter a valid input filename >> ");
			filename_in = scan.nextLine();
		    }
	    }

	done = false;

	while( ! done )
	    {
		try
		    {
			outfile = new PrintWriter(  filename_out  );
			done = true;
		    }
		catch ( FileNotFoundException e )
		    {
      			System.out.println( 
				      " Please enter a valid output finename >> ");
			filename_out = scan.nextLine();
		    }
	    }
	
	sound = new Dat( infile, outfile );
	
	sound.read_in_data();
	sound.print_out_data();
	
	infile.close();
	outfile.close();
    }
}