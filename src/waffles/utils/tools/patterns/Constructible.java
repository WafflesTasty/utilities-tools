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
		 * Constructs an object in the {@code Workshop}.
		 * 
		 * @param data  construction data
		 * @return   a constructed object
		 */
		public abstract Object create(P... data);
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