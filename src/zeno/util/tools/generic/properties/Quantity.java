package zeno.util.tools.generic.properties;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The {@code Quantity} interface defines a value that can be expressed in units.
 * 
 * @author Zeno
 * @since Oct 1, 2016
 * @version 1.0
 */
@FunctionalInterface
public interface Quantity
{
	/**
	 * The {@code Unit} interface defines a unit of measurement.
	 * 
	 * @author Zeno
	 * @since Oct 1, 2016
	 * @version 1.0
	 * 
	 * 
	 * @see Quantity
	 */
	public static interface Unit
	{
		/**
		 * Returns the value of a quantity as this {@code Unit}.
		 * <br> This is effectively an inverse operation
		 * to {@link #valueOf(BigDecimal)}.
		 * 
		 * @param qt  a unit value
		 * @return  a quantity value
		 * @see BigDecimal
		 */
		public abstract BigDecimal valueAs(BigDecimal qt);
		
		/**
		 * Returns the value of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit value
		 * @see BigDecimal
		 */
		public abstract BigDecimal valueOf(BigDecimal qt);
		
		/**
		 * Returns the residu of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit residu
		 * @see BigDecimal
		 */
		public default BigDecimal residuOf(BigDecimal qt)
		{
			return valueOf(qt).subtract(wholeOf(qt));
		}
				
		/**
		 * Returns the whole of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit whole
		 * @see BigDecimal
		 */
		public default BigDecimal wholeOf(BigDecimal qt)
		{
			return valueOf(qt).setScale(0, RoundingMode.DOWN);
		}
	
		
		/**
		 * Returns the value of a quantity as this {@code Unit}.
		 * 
		 * @param qt  a unit value
		 * @return  a quantity value
		 */
		public default double valueAs(double qt)
		{
			return valueAs(new BigDecimal(qt)).longValue();
		}
		
		/**
		 * Returns the value of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit value
		 */
		public default double valueOf(double qt)
		{
			return valueOf(new BigDecimal(qt)).longValue();
		}
		
		/**
		 * Returns the residu of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit residu
		 */
		public default double residuOf(double qt)
		{
			return residuOf(new BigDecimal(qt)).longValue();
		}
		
		/**
		 * Returns the whole of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit whole
		 */
		public default double wholeOf(double qt)
		{
			return wholeOf(new BigDecimal(qt)).longValue();
		}
		
		
		/**
		 * Returns the value of a quantity as this {@code Unit}.
		 * 
		 * @param qt  a unit value
		 * @return  a quantity value
		 */
		public default long valueAs(long qt)
		{
			return valueAs(new BigDecimal(qt)).longValue();
		}
		
		/**
		 * Returns the value of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit value
		 */
		public default long valueOf(long qt)
		{
			return valueOf(new BigDecimal(qt)).longValue();
		}
		
		/**
		 * Returns the residu of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit residu
		 */
		public default long residuOf(long qt)
		{
			return residuOf(new BigDecimal(qt)).longValue();
		}
		
		/**
		 * Returns the whole of a quantity in this {@code Unit}.
		 * 
		 * @param qt  a quantity value
		 * @return  a unit whole
		 */
		public default long wholeOf(long qt)
		{
			return wholeOf(new BigDecimal(qt)).longValue();
		}
	}


	/**
	 * Returns the unit values of a quantity.
	 * 
	 * @param qt  a quantity to use
	 * @param units  a sequence of units
	 * @return  a sequence of values
	 * 
	 * 
	 * @see BigDecimal
	 * @see Unit
	 */
	public static BigDecimal[] as(BigDecimal qt, Unit... units)
	{
		int count = units.length;
		
		BigDecimal residu = qt;
		BigDecimal[] values = new BigDecimal[count + 1];
		for(int i = 0; i < count; i++)
		{
			values[i] = units[i].wholeOf(residu);
			residu = units[i].residuOf(residu);
		}
		values[count] = residu;
		
		return values;
	}
	
	/**
	 * Returns the unit values of a quantity.
	 * 
	 * @param qt  a quantity to use
	 * @param units  a sequence of units
	 * @return  a sequence of values
	 * 
	 * 
	 * @see BigDecimal
	 * @see Unit
	 */
	public static BigDecimal[] as(double qt, Unit... units)
	{
		int count = units.length;
		
		BigDecimal residu = new BigDecimal(qt);
		BigDecimal[] values = new BigDecimal[count + 1];
		for(int i = 0; i < count; i++)
		{
			values[i] = units[i].wholeOf(residu);
			residu = units[i].residuOf(residu);
		}
		values[count] = residu;
		
		return values;
	}
	
	/**
	 * Returns the unit values of a quantity.
	 * 
	 * @param qt  a quantity to use
	 * @param units  a sequence of units
	 * @return  a sequence of values
	 * 
	 * 
	 * @see BigDecimal
	 * @see Unit
	 */
	public static BigDecimal[] as(long qt, Unit... units)
	{
		int count = units.length;
		
		BigDecimal residu = new BigDecimal(qt);
		BigDecimal[] values = new BigDecimal[count + 1];
		for(int i = 0; i < count; i++)
		{
			values[i] = units[i].wholeOf(residu);
			residu = units[i].residuOf(residu);
		}
		values[count] = residu;
		
		return values;
	}
	
	
	/**
	 * Returns the unit values of the {@code Quantity}.
	 * 
	 * @param units  a sequence of units
	 * @return  a sequence of values
	 * 
	 * 
	 * @see BigDecimal
	 * @see Unit
	 */
	public default BigDecimal[] as(Unit... units)
	{
		return Quantity.as(value(), units);
	}

	/**
	 * Returns the value of the {@code Quantity}.
	 * 
	 * @return  a total value
	 * 
	 * 
	 * @see BigDecimal
	 */
	public abstract BigDecimal value();
}