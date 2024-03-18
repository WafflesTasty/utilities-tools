package waffles.utils.tools.patterns.semantics;

/**
 * The {@code Inaccurate} interface defines an object that is approximate.
 * </br> This interface can be used to compare numeric data to within an error margin.
 *
 * @author Waffles
 * @since Jul 15, 2018
 * @version 1.0
 * 
 *
 * @param <O>  an object type
 */
@FunctionalInterface
public interface Inaccurate<O>
{
	/**
	 * Checks if two objects are approximately equal.
	 * 
	 * @param obj   an object to compare
	 * @param ulps  an error margin
	 * @return  {@code true} if the objects are equal within the margin of error
	 */
	public abstract Boolean equals(O obj, int ulps);
}