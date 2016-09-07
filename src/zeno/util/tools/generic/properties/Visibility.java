package zeno.util.tools.generic.properties;

/**
 * The {@code Visibility} interface defines an object that can toggle its visibility.
 *
 * @since Jul 5, 2015
 * @author Zeno
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