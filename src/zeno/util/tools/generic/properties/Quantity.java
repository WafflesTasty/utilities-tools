package zeno.util.tools.generic.properties;

import java.math.BigDecimal;

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
		public abstract BigDecimal residuOf(BigDecimal qt);
		
		/**
		 * Returns the value of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit value
		 */
		public abstract BigDecimal valueOf(BigDecimal qt);
		
		/**
		 * Returns the whole of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit whole
		 */
		public abstract BigDecimal wholeOf(BigDecimal qt);
	}

	
	/**
	 * Returns the value of the {@code Quantity}.
	 * 
	 * @return  a total value
	 * @see Long
	 */
	public abstract BigDecimal value();

	/**
	 * Returns the unit values of the {@code Quantity}.
	 * 
	 * @param units  a sequence of units
	 * @return  a sequence of values
	 * @see BigDecimal
	 */
	public default BigDecimal[] as(Unit... units)
	{
		int count = units.length;
		
		BigDecimal residu = value();
		BigDecimal[] values = new BigDecimal[count + 1];
		for(int i = 0; i < count; i++)
		{
			values[i] = units[i].wholeOf(residu);
			residu = units[i].residuOf(residu);
		}
		values[count] = residu;
		
		return values;
	}
}