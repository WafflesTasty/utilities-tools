package waffles.utils.tools.patterns.semantics;

/**
 * The {@code Coordinated} interface defines an object with coordinates.
 *
 * @author Waffles
 * @since 12 May 2024
 * @version 1.1
 *
 * 
 * @see Ordered
 */
public interface Coordinated extends Ordered
{
	/**
	 * Returns the coordinates of the {@code Coordinated}.
	 * 
	 * @return  a coordinate set
	 */
	public abstract int[] Coordinates();
	
	
	@Override
	public default int Order()
	{
		return Coordinates().length;
	}
}