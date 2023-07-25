package waffles.util.tools.patterns.semantics;

/**
 * The {@code Copyable} interface defines an object which can be copied.
 * </br> This is preferred over Java's internal {@link Object#clone()} method as it is very unwieldy.
 *
 * @author Waffles
 * @since Dec 12, 2014
 * @version 1.0
 * 
 * 
 * @param <O>  a copy type
 */
public interface Copyable<O>
{
	/**
	 * Creates a new instance of the {@code Copyable}.
	 * 
	 * @return  a new object instance
	 */
	public abstract O instance();
	
	/**
	 * Creates a copy of the {@code Copyable}.
	 * 
	 * @return  a new object copy
	 */
	public default O copy()
	{
		return instance();
	}
}