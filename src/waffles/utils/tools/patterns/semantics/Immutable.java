package waffles.utils.tools.patterns.semantics;

/**
 * An {@code Immutable} object cannot change its own values.
 * The Immutable-Mutable pattern defines getters and optional setters
 * in two different hierarchies. The {@link #Mutator()} method can
 * be used to check whether an object is mutable.
 *
 * @author Waffles
 * @since 30 Oct 2023
 * @version 1.1
 */
public interface Immutable
{
	/**
	 * A {@code Mutable} object can change its own values.
	 *
	 * @author Waffles
	 * @since 16 Oct 2023
	 * @version 1.0
	 * 
	 * 
	 * @see Immutable
	 */
	public static interface Mutable extends Immutable
	{
		@Override
		public default <M extends Mutable> M Mutator()
		{
			return (M) this;
		}
	}
	
	/**
	 * Returns a mutable {@code Mutator}.
	 * If the object is mutable, it will be returned
	 * as mutable. Otherwise this returns null.
	 * 
	 * @return  a mutable object
	 * 
	 * 
	 * @see Mutable
	 */
	public default <M extends Mutable> M Mutator()
	{
		return null;
	}
}