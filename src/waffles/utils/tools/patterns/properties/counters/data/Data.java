package waffles.utils.tools.patterns.properties.counters.data;

/**
 * The {@code Data} interface defines an abstract unit of data.
 *
 * @author Waffles
 * @since 13 Nov 2023
 * @version 1.1
 */
@FunctionalInterface
public interface Data
{
	/**
	 * Returns the size of the {@code Data}.
	 * 
	 * @return  a data size
	 */
	public abstract int DataSize();
}