package waffles.utils.tools.patterns.properties.values;

/**
 * A {@code Sourced} defines a generic source object.
 *
 * @author Waffles
 * @since 12 Oct 2025
 * @version 1.1
 *
 *
 * @param <O>  a source type
 */
public interface Sourced<O>
{
	/**
	 * Returns the source of the {@code Sourced}.
	 * 
	 * @return  a data source
	 */
	public abstract O Source();
}