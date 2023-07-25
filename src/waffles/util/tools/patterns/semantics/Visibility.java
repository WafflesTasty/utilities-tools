package waffles.util.tools.patterns.semantics;

/**
 * The {@code Visibility} interface defines an object with a visibility state.
 *
 * @author Waffles
 * @since Jul 5, 2015
 * @version 1.0
 */
@FunctionalInterface
public interface Visibility
{
	/**
	 * Returns the visibility of the object.
	 * 
	 * @return  a visibility state
	 */
	public abstract boolean isVisible();
}