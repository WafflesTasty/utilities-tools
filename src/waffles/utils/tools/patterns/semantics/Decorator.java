package waffles.utils.tools.patterns.semantics;

/**
 * The {@code Decorator} interface defines a basic decorator object.
 * </br> Each decorator defines and manages a {@link #Delegate()} object.
 * 
 * @author Waffles
 * @since Nov 27, 2014
 * @version 1.0
 * 
 * 
 * @param <O> a delegate type
 */
public interface Decorator<O>
{
	/**
	 * Returns the delegate of the {@code Decorator}.
	 * 
	 * @return  a delegate object
	 */
	public abstract O Delegate();
}