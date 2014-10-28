

public class LLNode
{
    protected Object _data;
    protected LLNode _next;
    protected LLNode _prev;

    public LLNode(Object d, LLNode p, LLNode n)
    {
	_data = d;
	_next = n;
	_prev = p;
    }

    public void set_data(int d)
    {
	_data = d;
    }

    public void set_next(LLNode next)
    {
	_next = next;
    }
    
    public void set_prev( LLNode prev )
    {
	_prev = prev;
    }

    public void set_links( LLNode prev, LLNode next )
    {
        _prev = prev;
	_next = next;
    }

    public Object get_data()
    {
	return _data;
    }

    public LLNode get_next()
    {
	return _next;
    }
   
    public LLNode get_prev()
    {
	return _prev;
    }

    public String toString()
    {
	return "" + _data.toString();
    }
}