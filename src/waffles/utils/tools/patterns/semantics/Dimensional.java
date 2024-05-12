package waffles.utils.tools.patterns.semantics;

/**
 * The {@code Dimensional} interface defines an object with a dimension.
 *
 * @author Waffles
 * @since 12 May 2024
 * @version 1.1
 *
 * 
 * @see Ordered
 */
public interface Dimensional extends Ordered
{
	/**
	 * Returns the dimensions of the {@code Dimensional}.
	 * 
	 * @return  a dimension set
	 */
	public abstract int[] Dimensions();
	
	
	@Override
	public default int Order()
	{
		return Dimensions().length;
	}
}