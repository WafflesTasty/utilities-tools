package zeno.util.tools.patterns;

/**
 * The {@code Properties} interface defines a set of values tied to class keys.
 *
 * @author Waffles
 * @since 14 May 2022
 * @version 1.0
 */
public interface Properties
{
	/**
	 * Changes a value in the {@code Properties}.
	 * 
	 * @param <O>  a key type class
	 * @param <P>  a property class
	 * @param type  a property type
	 * @param prop  an entity property
	 * 
	 * 
	 * @see Class
	 */
	public abstract <O, P> void setProperty(Class<O> type, P prop);

	/**
	 * Returns a value in the {@code Properties}.
	 * 
	 * @param <O>  a key type class
	 * @param <P>  a property class
	 * @param type  a property type
	 * @return  an entity property
	 * 
	 * 
	 * @see Class
	 */
	public abstract <O, P> P getProperty(Class<O> type);
}