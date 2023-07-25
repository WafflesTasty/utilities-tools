package waffles.util.tools.patterns;

import java.util.HashMap;
import java.util.Map;

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
	 * The {@code Properties.Mapper} class stores its fields in a hashmap.
	 *
	 * @author Waffles
	 * @since 25 Jul 2023
	 * @version 1.0
	 * 
	 * 
	 * @see Properties
	 */
	public static class Mapper implements Properties
	{
		private Map<String, Object> props;
		
		/**
		 * Creates a new {@code Mapper}.
		 */
		public Mapper()
		{
			props = new HashMap<>();
		}
		
		
		@Override
		public <O, P> void setProperty(Class<O> type, P prop)
		{
			if(prop != null)
				props.put(type.getName(), prop);
			else
				props.remove(type.getName());
		}
		
		@Override
		public <O, P> P getProperty(Class<O> type)
		{
			return (P) props.get(type.getName());
		}
	}
	
	
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