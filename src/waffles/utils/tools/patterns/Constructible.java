package waffles.utils.tools.patterns;

/**
 * The {@code Constructible} interface defines a construction {@link #Factory()}.
 *
 * @author Waffles
 * @since 21 Jan 2026
 * @version 1.1
 */
@FunctionalInterface
public interface Constructible
{
	/**
	 * A {@code Workshop} creates {@code Constructible} objects.
	 *
	 * @author Waffles
	 * @since 21 Jan 2026
	 * @version 1.1
	 *
	 *
	 * @param <P>  a parameter type
	 */
	@FunctionalInterface
	public static interface Workshop<P>
	{
		/**
		 * Creates a new {@code Constructible}.
		 * 
		 * @param p  a factory parameter
		 * @return   a constructed object
		 * 
		 * 
		 * @see Constructible
		 */
		public abstract Constructible create(P p);
	}
	
	/**
	 * Returns a factory for the {@code Constructible}.
	 * 
	 * @return  a constructible factory
	 * 
	 * 
	 * @see Workshop
	 */
	public abstract Workshop<?> Factory();
}