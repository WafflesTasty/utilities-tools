package waffles.utils.tools.patterns.properties;

import waffles.utils.tools.patterns.Properties;

/**
 * The {@code Dirty} interface defines an object which caches its value as a {@code Property}.
 * A {@code Dirty} object is designed to only update its value when it is flagged as dirty.
 * The {@link #isDirty()} method should be implemented to reflect this state, while the
 * {@link #onRefresh()} method should be implemented to return the most up-to-date value.
 *
 * @author Waffles
 * @since 25 Jul 2023
 * @version 1.0
 *
 *
 * @param <V>  a value type
 * @see Properties
 */
@Deprecated
public interface Dirty<V> extends Properties
{	
	/**
	 * The {@code Value} class is a dummy used as a property key for {@code Dirty} objects.
	 * </br> You can ignore this class entirely as it has no use outside of this interface.
	 *
	 * @author Waffles
	 * @since 25 Jul 2023
	 * @version 1.0
	 * 
	 * 
	 * @see Dirty
	 */
	public static class Value
	{
		// NOT APPLICABLE
	}
	
	
	/**
	 * Returns the value of a {@code Dirty} object.
	 * This method checks if the value is clean, and refreshes it when necessary.
	 * 
	 * @return  a refreshed value
	 */
	public default V Value()
	{
		V value = getProperty(Value.class);
		if(isDirty())
		{
			value = onRefresh();
			setValue(value);
		}
		
		return value;
	}
	
	/**
	 * Changes the value of a {@code Dirty} object.
	 * This method serves as a refresh and will clean the value.
	 * 
	 * @param val  a new value
	 * @return    an old value
	 */
	public default V setValue(V val)
	{
		V value = getProperty(Value.class);
		setProperty(Value.class, val);
		return value;
	}
	
	/**
	 * Checks the value state of a {@code Dirty} object.
	 * 
	 * @return  {@code true} if the object is dirty
	 */
	public abstract boolean isDirty();
	
	/**
	 * Refreshes the value of a {@code Dirty} object.
	 * 
	 * @return  a fresh value
	 */
	public abstract V onRefresh();
}