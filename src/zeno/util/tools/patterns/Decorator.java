package zeno.util.tools.patterns;

/**
 * The {@code Decorator} class defines the basic decorator pattern.
 * 
 * @author Zeno 
 * @since Nov 27, 2014
 * @version 1.0
 * 
 * 
 * @param <O> an object type to decorate
 */
public class Decorator<O>
{
	private O delegate;
	
	protected Decorator(O delegate)
	{
	    this.delegate = delegate;
	}
	
	protected O delegate()
	{
		return delegate;
	}
}