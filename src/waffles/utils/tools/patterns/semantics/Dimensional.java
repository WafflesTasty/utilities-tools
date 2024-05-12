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
	
	
	/**
	 * Returns the order of the {@code Dimensional}.
	 * The order represents how many indices are needed
	 * to define a single value in its dimensions.
	 * 
	 * @return  a dimension order
	 */
	@Override
	public default int Order()
	{
		return Dimensions().length;
	}
}