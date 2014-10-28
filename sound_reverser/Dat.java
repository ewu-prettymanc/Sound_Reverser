import java.util.*;
import java.io.*;

public class Dat
{
    protected DoubleLL dm;
    protected DoubleLL dt;
    protected PrintWriter outfile;
    protected Scanner infile;
    protected String first_line;
   
    public Dat( Scanner in, PrintWriter out )
    {
	outfile = out;
	infile = in;
	
	dm = new DoubleLL();
	dt = new DoubleLL();
    }

    public void read_in_data()
    {
	first_line = infile.nextLine();

	while( true )
	    {
		try
		    {
			dt.add_to_back( infile.nextDouble() );
			dm.add_to_back( infile.nextDouble() );
		    }
		catch ( NoSuchElementException e )
		    {
			//System.out.println( "Caught end of file Excpetion.);
			return; // at the end
		    }
	    }
    }

    public void print_out_data()
    {
	outfile.println( first_line );

	while( true )
	    {
		try
		    {
			outfile.print( "  " + dt.delete_from_front() );
			outfile.print( "\t\t\t" + dm.delete_from_back() 
				       + "\n" );
		    }
		catch ( RuntimeException e )
		    {
			//System.out.println( "Caught end of array Exception ");
			return; // we printed the whole array
		    }
	    }
    }
}