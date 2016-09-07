package zeno.util.tools.patterns;

/**
 * The {@code Decorator} class defines the basic decorator pattern.
 * 
 * @param <O> an object type to decorate
 * 
 * @since Nov 27, 2014
 * @author Zeno 
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