package zeno.util.tools.generic.properties;

/**
 * The {@code Quantity} interface defines a value that can be expressed in units.
 * 
 * @since Oct 1, 2016
 * @author Zeno
 */
public interface Quantity
{
	/**
	 * The {@code Unit} interface defines a unit of measurement.
	 * 
	 * @since Oct 1, 2016
	 * @author Zeno
	 * 
	 * @see Quantity
	 */
	public static interface Unit extends Quantity
	{
		/**
		 * Calculates the residu of a value in this {@code Unit}.
		 * 
		 * @param value  a value to use
		 * @return  a value residu
		 * @see Long
		 */
		public default long residu(long value)
		{
			Unit p = parent();
			if(p != null)
			{
				return p.residu(value) % p.value();
			}
			
			return value;
		}
		
		/**
		 * Returns the parent of the {@code Unit}.
		 * 
		 * @return  a parent unit
		 * @see Unit
		 */
		public abstract Unit parent();
	}
	
	
	/**
	 * Converts the {@code Quantity} to a {@code Unit}.
	 * 
	 * @param unit  a unit to use
	 * @return  the quantity expressed through a unit
	 * @see Unit
	 */
	public default long convert(Unit unit)
	{
		return unit.residu(value()) / unit.value();
	}
	
	/**
	 * Returns the value of the {@code Quantity}.
	 * 
	 * @return  a total value
	 * @see Long
	 */
	public abstract long value();
}