package zeno.util.tools.patterns.properties;

/**
 * The {@code Handler} interface defines an object with a pointer.
 *
 * @author Zeno
 * @since 17 Jul 2020
 * @version 1.1
 */
public interface Handler
{
	/**
	 * Returns the pointer of the {@code Handler}.
	 * 
	 * @return  a pointer
	 */
	public abstract long Pointer();
}