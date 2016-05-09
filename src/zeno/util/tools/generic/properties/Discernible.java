package zeno.util.tools.generic.properties;

/**
 * The {@code Discernible} interface defines an object with a unique identifier.
 *
 * @author Zeno
 * @since Jul 23, 2015
 */
@FunctionalInterface
public interface Discernible
{
	/**
	 * Returns the identity of the {@code Object}.
	 * 
	 * @return  the object's identity
	 */
	public abstract int getID();
}