package zeno.util.tools.patterns;

/**
 * The {@code Decorator} interface defines the basic decorator pattern.
 * 
 * @author Zeno 
 * @since Nov 27, 2014
 * @version 1.0
 * 
 * 
 * @param <O> an object type to decorate
 */
public interface Decorator<O>
{
	/**
	 * Returns the delegate object of the {@code Decorator}.
	 * 
	 * @return  a delegate object
	 */
	public abstract O Delegate();
}