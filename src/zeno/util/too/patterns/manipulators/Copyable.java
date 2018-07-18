package zeno.util.too.patterns.manipulators;

/**
 * The {@code Copyable} interface defines an object which can be copied.
 *
 * @author Zeno
 * @since Dec 12, 2014
 * @version 1.0
 * 
 * 
 * @param <O>  the type of copy to create
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