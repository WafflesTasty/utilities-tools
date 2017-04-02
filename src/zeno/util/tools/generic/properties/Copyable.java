package zeno.util.tools.generic.properties;

/**
 * The {@code Copyable} interface defines an object which can be copied.
 *
 * @param <O>  the type of copy to create
 *
 * @since Dec 12, 2014
 * @author Zeno
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