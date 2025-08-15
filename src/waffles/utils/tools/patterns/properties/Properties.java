package waffles.utils.tools.patterns.properties;

/**
 * The {@code Properties} interface defines a class-object mapping.
 *
 * @author Waffles
 * @since 14 May 2022
 * @version 1.0
 */
public interface Properties
{
	/**
	 * A {@code Properties.Owner} defines a set of properties.
	 *
	 * @author Waffles
	 * @since 15 Aug 2025
	 * @version 1.1
	 */
	@FunctionalInterface
	public static interface Owner
	{
		/**
		 * Returns the properties of the {@code Owner}.
		 * 
		 * @return  a properties object
		 * 
		 * 
		 * @see Properties
		 */
		public abstract Properties Properties();
	}
	
	
	/**
	 * Changes a value in the {@code Properties}.
	 * 
	 * @param t  a property type
	 * @param v  a property value
	 * 
	 * 
	 * @see Class
	 */
	public abstract void set(Class<?> t, Object v);

	/**
	 * Returns a value in the {@code Properties}.
	 * 
	 * @param <V>  a value type
	 * @param t  a property type
	 * @return  a property value
	 * 
	 * 
	 * @see Class
	 */
	public abstract <V> V get(Class<?> t);
}