package waffles.utils.tools.patterns.properties.values;

import waffles.utils.tools.patterns.Changeable;
import waffles.utils.tools.patterns.Computable;

/**
 * A {@code LazyValue} keeps track of a value, which can change according to some input.
 * The output value is only recomputed if the {@code LazyValue} has been flagged as
 * changed, or the given input is different from the previous one, making it
 * a useful tool for rare and resource-intensive operations.
 *
 * @author Waffles
 * @since 11 Sep 2023
 * @version 1.1
 *
 *
 * @param <I>  an input type
 * @param <O>  an output type
 * 
 * 
 * @see Changeable
 * @see Computable
 * @see Valuable
 */
public class LazyValue<I,O> extends Changeable implements Computable<I,O>, Valuable<O>
{
	private Computable<I,O> cmp;
	
	private O output;
	private I input; 
	
	/**
	 * Creates a new {@code LazyValue}.
	 */
	public LazyValue()
	{
		this(null);
	}
	
	/**
	 * Creates a new {@code LazyValue}.
	 * 
	 * @param c  a computable
	 * 
	 * 
	 * @see Computable
	 */
	public LazyValue(Computable<I,O> c)
	{
		cmp = c;
	}
		
	/**
	 * Outputs a new {@code LazyValue}.
	 * The value is recomputed whenever it is
	 * flagged as changed, or the input value
	 * differs from the previous input.
	 * 
	 * @param ipt  an input value
	 * @return  an output value
	 */
	public O Value(I ipt)
	{
		if(input != ipt)
		{
			input = ipt;
			setChanged();
		}
		
		return Value();
	}

	
	protected I LastInput()
	{
		return input;
	}
	
	protected O LastOutput()
	{
		return output;
	}
	
	@Override
	public O compute(I ipt)
	{
		if(cmp != null)
		{
			return cmp.compute(ipt);
		}
		
		return null;
	}
	
	@Override
	public O Value()
	{
		if(hasChanged())
		{
			output = compute(input);
			setChanged(false);
		}
		
		return output;
	}
}