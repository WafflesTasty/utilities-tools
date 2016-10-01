package zeno.util.tools.enums;

import java.math.BigDecimal;

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
	public static final Metric EXA   = new Metric(-18, "E");
	/**
	 * The {@code peta-} unit.
	 */
	public static final Metric PETA  = new Metric(-15, "P");
	/**
	 * The {@code tera-} unit.
	 */
	public static final Metric TERA  = new Metric(-12, "T");
	/**
	 * The {@code giga-} unit.
	 */
	public static final Metric GIGA  = new Metric( -9, "G");
	/**
	 * The {@code mega-} unit.
	 */
	public static final Metric MEGA  = new Metric( -6, "M");
	/**
	 * The {@code kilo-} unit.
	 */
	public static final Metric KILO  = new Metric( -3, "k");
	/**
	 * The {@code hecto-} unit.
	 */
	public static final Metric HECTO = new Metric( -2, "h");
	/**
	 * The {@code deca-} unit.
	 */
	public static final Metric DECA  = new Metric( -1, "da");
	/**
	 * The base metric unit.
	 */
	public static final Metric NONE  = new Metric(  0, "");
	/**
	 * The {@code deci-} unit.
	 */
	public static final Metric DECI  = new Metric(  1, "d");
	/**
	 * The {@code centi-} unit.
	 */
	public static final Metric CENTI = new Metric(  2, "c");
	/**
	 * The {@code milli-} unit.
	 */
	public static final Metric MILLI = new Metric(  3, "m");
	/**
	 * The {@code micro-} unit.
	 */
	public static final Metric MICRO = new Metric(  6, "\u00B5");
	/**
	 * The {@code nano-} unit.
	 */
	public static final Metric NANO  = new Metric(  9, "n");
	/**
	 * The {@code pico-} unit.
	 */
	public static final Metric PICO  = new Metric( 12, "p");
	/**
	 * The {@code femto-} unit.
	 */
	public static final Metric FEMTO = new Metric( 15, "f");
	/**
	 * The {@code atto-} unit.
	 */
	public static final Metric ATTO  = new Metric( 18, "a");
	
	
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
	 * @param src  a source metric
	 * @return  a relative metric
	 */
	public Metric from(Metric src)
	{
		if(src != NONE)
		{
			return new Metric(exp - src.exp, prefix);
		}
		
		return this;
	}
	
	/**
	 * Returns this {@code Metric} relative to another.
	 * 
	 * @param tgt  a target metric
	 * @return  a relative metric
	 */
	public Metric to(Metric tgt)
	{
		return tgt.from(this);
	}
	
	/**
	 * Returns the inverse of the {@code Metric}.
	 * 
	 * @return  an inverse metric
	 * @see Metric
	 */
	public Metric inverse()
	{
		return to(Metric.NONE);
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
	public BigDecimal valueAs(BigDecimal qt)
	{
		return qt.scaleByPowerOfTen(- exp);
	}
	
	@Override
	public BigDecimal valueOf(BigDecimal qt)
	{
		return qt.scaleByPowerOfTen(exp);
	}
	
	@Override
	public String toString()
	{
		return prefix();
	}
}