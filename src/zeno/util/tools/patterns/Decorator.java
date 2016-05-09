package zeno.util.tools.patterns;

/**
 * The {@code Decorator} class defines the basic decorator pattern.
 *
 * @author Zeno
 * @since Nov 27, 2014
 * @param <O> the object type to decorate
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