import java.util.*;
import java.io.*;

public class Coord implements Comparable<Coord>
{
    protected int x;
    protected int y;
    protected double _distance;
    protected Random gen;
    protected int limit;

    public int compareTo( Coord c )
    {
	if( _distance > c._distance)
	    return 1;// this is greater
	if( _distance < c._distance )
	    return -1;// this is smaller
	    
	return 0;// they are the same
    }
    
    public Coord(Random g, int lim )
    {
	gen = g;
	limit = lim;
	x = gen.nextInt(limit)+1;
	y = gen.nextInt(limit)+1;
    } 

    public Coord(int x_coord, int y_coord )
    {
        x = x_coord;
	y = y_coord;
    }

    public int get_x() {return x;}
    public int get_y() {return y;}
    public double get_distance() {return _distance;}

   
    public void calc_distance( Coord c)
    {// use the distance formula, from this to c
	_distance = Math.sqrt( Math.pow( (c.x - x), 2) + 
			       Math.pow( (c.y - y), 2) );
    }
    
    public void gen_new_coords()
    {
	x = gen.nextInt(limit)+1;
	y = gen.nextInt(limit)+1;
    } 
    
    public String toString_dist()
    {
	String s="";
	return s+= _distance + " ";
    }
    
    public String toString()
    {
	return "" + "(" + x + "," + y + ")";
    }
}