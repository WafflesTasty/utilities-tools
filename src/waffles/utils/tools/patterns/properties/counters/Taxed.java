package waffles.utils.tools.patterns.properties.counters;

/**
 * The {@code Taxed} interface defines an object with a cost.
 *
 * @author Waffles
 * @since Jul 23, 2015
 * @version 1.0
 */
@FunctionalInterface
public interface Taxed
{
	/**
	 * Returns the cost of the {@code Taxed}.
	 * 
	 * @return  a cost value
	 */
	public abstract int cost();
}