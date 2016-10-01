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
	public static interface Unit
	{
		/**
		 * Returns the residu of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit residu
		 */
		public abstract long residuOf(long qt);
		
		/**
		 * Returns the value of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit value
		 */
		public abstract long valueOf(long qt);
	}
	
	
	/**
	 * Returns the unit values of the {@code Quantity}.
	 * 
	 * @param units  a sequence of units
	 * @return  a sequence of values
	 * @see Unit
	 */
	public default long[] as(Unit... units)
	{
		int count = units.length;
		
		long residu = value();
		long[] values = new long[count];
		for(int i = 0; i < count; i++)
		{
			values[i] = units[i].valueOf(residu);
			residu = units[i].residuOf(residu);
		}
		
		return values;
	}
	
	/**
	 * Returns the unit value of the {@code Quantity}.
	 * 
	 * @param unit  a quantity unit
	 * @return  a unit value
	 * @see Unit
	 */
	public default long as(Unit unit)
	{
		return unit.valueOf(value());
	}
	
	/**
	 * Returns the value of the {@code Quantity}.
	 * 
	 * @return  a total value
	 * @see Long
	 */
	public abstract long value();
}