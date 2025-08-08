package waffles.utils.tools.patterns.properties;

/**
 * A {@code Gateway} decides whether objects of a type are allowed somewhere.
 *
 * @author Waffles
 * @since 13 Dec 2023
 * @version 1.1
 *
 *
 * @param <O>  an object type
 */
@FunctionalInterface
public interface Gateway<O>
{
	/**
	 * Creates a new {@code Gateway} as a sequence of gates.
	 * 
	 * @param <O>  an object type
	 * @param set  a gateway set
	 * @return  a sequence gateway
	 */
	public static <O> Gateway<O> sequence(Gateway<O>... set)
	{
		return obj ->
		{
			for(Gateway<O> g : set)
			{
				if(!g.allows(obj))
				{
					return false;
				}
			}
			
			return true;
		};
	}
	
	
	/**
	 * Checks if an object is allowed in the {@code Gateway}.
	 * 
	 * @param obj  a target object
	 * @return  {@code true} if the object is allowed
	 */
	public abstract boolean allows(O obj);
}