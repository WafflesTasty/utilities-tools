package zeno.util.tools.enums;

import java.math.BigDecimal;
import java.math.RoundingMode;

import zeno.util.tools.generic.properties.Quantity;

/**
 * The {@code Metric} class defines quantity units according to the metric system.
 * 
 * @since Oct 1, 2016
 * @author Zeno
 * 
 * @see Quantity
 */
public class Metric implements Quantity.Unit
{
	/**
	 * The {@code exa-} unit.
	 */
	public static Metric EXA   = new Metric(-18, "E");
	/**
	 * The {@code peta-} unit.
	 */
	public static Metric PETA  = new Metric(-15, "P");
	/**
	 * The {@code tera-} unit.
	 */
	public static Metric TERA  = new Metric(-12, "T");
	/**
	 * The {@code giga-} unit.
	 */
	public static Metric GIGA  = new Metric( -9, "G");
	/**
	 * The {@code mega-} unit.
	 */
	public static Metric MEGA  = new Metric( -6, "M");
	/**
	 * The {@code kilo-} unit.
	 */
	public static Metric KILO  = new Metric( -3, "k");
	/**
	 * The {@code hecto-} unit.
	 */
	public static Metric HECTO = new Metric( -2, "h");
	/**
	 * The {@code deca-} unit.
	 */
	public static Metric DECA  = new Metric( -1, "da");
	/**
	 * The base metric unit.
	 */
	public static Metric NONE  = new Metric(  0, "");
	/**
	 * The {@code deci-} unit.
	 */
	public static Metric DECI  = new Metric(  1, "d");
	/**
	 * The {@code centi-} unit.
	 */
	public static Metric CENTI = new Metric(  2, "c");
	/**
	 * The {@code milli-} unit.
	 */
	public static Metric MILLI = new Metric(  3, "m");
	/**
	 * The {@code micro-} unit.
	 */
	public static Metric MICRO = new Metric(  6, "\u00B5");
	/**
	 * The {@code nano-} unit.
	 */
	public static Metric NANO  = new Metric(  9, "n");
	/**
	 * The {@code pico-} unit.
	 */
	public static Metric PICO  = new Metric( 12, "p");
	/**
	 * The {@code femto-} unit.
	 */
	public static Metric FEMTO = new Metric( 15, "f");
	/**
	 * The {@code atto-} unit.
	 */
	public static Metric ATTO  = new Metric( 18, "a");
	
	
	private int exp;
	private String prefix;
	
	private Metric(int exp, String prefix)
	{
		this.prefix = prefix;
		this.exp = exp;
	}

	
	/**
	 * Returns this {@code Metric} relative to another.
	 * 
	 * @param tgt  a target metric
	 * @return  a relative metric
	 */
	public Metric to(Metric tgt)
	{
		return new Metric(tgt.exp - exp, tgt.prefix);
	}
	
	/**
	 * Returns the prefix of the {@code Metric}.
	 * 
	 * @return  a metric prefix
	 * @see String
	 */
	public String prefix()
	{
		return prefix;
	}
	
	
	@Override
	public BigDecimal valueOf(BigDecimal qt)
	{
		return qt.scaleByPowerOfTen(exp);
	}
	
	@Override
	public BigDecimal residuOf(BigDecimal qt)
	{
		return valueOf(qt).subtract(wholeOf(qt));
	}
	
	@Override
	public BigDecimal wholeOf(BigDecimal qt)
	{
		return valueOf(qt).setScale(0, RoundingMode.DOWN);
	}
	
	@Override
	public String toString()
	{
		return prefix();
	}
}