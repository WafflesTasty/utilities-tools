package waffles.utils.tools.patterns.properties.counters.data;

/**
 * A {@code Persistible} object defines a set of raw data.
 *
 * @author Waffles
 * @since 18 Nov 2023
 * @version 1.1
 *
 *
 * @param <D>  a data type
 * @see Data
 */
public interface Persistible<D extends Data>
{
	/**
	 * Returns the data of the {@code Persistible}.
	 * 
	 * @return  a data set
	 */
	public abstract D Data();
}