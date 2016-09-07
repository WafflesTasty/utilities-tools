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
	 * Creates a new instance of this class.
	 * 
	 * @return  a new instance
	 */
	public abstract O instance();
	
	/**
	 * Copies the object.
	 * 
	 * @return  a copy
	 */
	public default O copy()
	{
		return instance();
	}
}