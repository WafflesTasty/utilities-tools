package waffles.util.tools.patterns.semantics;

/**
 * The {@code Handler} interface defines an object with a pointer.
 * </br> This pointer is usually a long value which references a memory address.
 *
 * @author Waffles
 * @since 17 Jul 2020
 * @version 1.1
 */
public interface Handler
{
	/**
	 * Returns the pointer of the {@code Handler}.
	 * 
	 * @return  a long pointer
	 */
	public abstract long Pointer();
}