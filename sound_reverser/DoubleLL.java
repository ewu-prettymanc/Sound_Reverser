public class DoubleLL
{
    protected LLNode _head;
    protected LLNode _tail;

    public DoubleLL()
    {
	_head = _tail = null;
    }


    public Object delete_from_back()
    {
	if ( _head == null )
	    throw new RuntimeException("Linked List is empty.");
	if( _head == _tail )
	    return delete_from_front();

	LLNode old_tail = _tail;
	
	_tail = old_tail.get_prev();// set new tail to point to old tails previouse
	_tail.set_next( null ); // end of list

	old_tail.set_links( null, null );// garbage collect

	return  old_tail.get_data();
    }
   

    public void add_to_back( Object d)
    {
	if( _tail == null )// add back to empty list
	    _tail = _head = new LLNode( d, _tail, null );
	else
	    {
		_tail.set_next (new LLNode( d, _tail, null) );
		_tail = _tail.get_next();
	    }
    }



    public void add_to_front( Object d)
    {
	if( _head == null ) // add front to empty list
	    _head = _tail =  new LLNode(d, null, _head);
	else
	    {
		_head.set_prev( new LLNode( d, null, _head ) );
		_head = _head.get_prev();
	    }
    }


    public Object delete_from_front()
    {
	if ( _head == null )
	    throw new RuntimeException("Linked List is empty.");
	if( _head  == _tail )
	    {
		Object o = _head.get_data();
		_head = _tail = null;
		
		return o;
	    }

	LLNode old_head = _head;
	
	_head = old_head.get_next();
	_head.set_prev(null);

	old_head.set_links(null,null);  // aids in garbage collection
	                        
	return  old_head.get_data();
    }

    public String toString()
    {
	return toString_rec(_head);
    }

    protected String toString_rec(LLNode n)
    {
	if ( n == null )
	    return "";

	return "" + n + "\n " + toString_rec(n.get_next());
    }
    
    // prints the list in reverse
    public String toStringRev()
    {
	return toStringRev_rec( _tail );
    }


    protected String toStringRev_rec( LLNode n )
    {
	if( n == null )
	    return "";

	return "" + n + "\n " + toStringRev_rec( n.get_prev() );
    }
}