package waffles.utils.tools.patterns.properties.values;

/**
 * A {@code Labelled} object defines a label string.
 *
 * @author Waffles
 * @since 10 Jun 2025
 * @version 1.1
 */
@FunctionalInterface
public interface Labelled
{
	/**
	 * Returns the label of the {@code Labelled}.
	 * 
	 * @return  a label string
	 */
	public abstract String Label();
}