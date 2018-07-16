package zeno.util.tools.patterns.properties;

/**
 * The {@code Approximate} interface defines an object that can be approximated.
 *
 * @author Zeno
 * @since Jul 15, 2018
 * @version 1.0
 * 
 *
 * @param <O>  the type of the object
 */
public interface Approximate<O>
{
	/**
	 * Checks if two objects are approximately equal.
	 * 
	 * @param object  an object to compare
	 * @param ulps  an error margin
	 * @return  {@code true} if the objects are approximately equal
	 */
	public abstract boolean equals(O object, int ulps);
}