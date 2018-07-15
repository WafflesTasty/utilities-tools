package zeno.util.tools.generic.properties;

/**
 * The {@code Visibility} interface defines an object that can toggle its visibility.
 *
 * @author Zeno
 * @since Jul 5, 2015
 * @version 1.0
 */
@FunctionalInterface
public interface Visibility
{
	/**
	 * Returns the visibility state of the object.
	 * 
	 * @return  the object's visibility
	 */
	public abstract boolean isVisible();
}