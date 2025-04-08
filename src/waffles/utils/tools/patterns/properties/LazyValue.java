package waffles.utils.tools.patterns.properties;

import waffles.utils.tools.patterns.semantics.Computable;
import waffles.utils.tools.primitives.Array;

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
 * @see Computable
 */
public class LazyValue<I,O> implements Computable<I,O>
{
	private I input;
	private O output;
	
	private boolean hasChanged;
	private LazyValue<?,?>[] handlers;
	private Computable<I,O> cmp;
	
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
		handlers = new LazyValue<?,?>[0];
		hasChanged = true;
		cmp = c;
	}
	
	/**
	 * Creates a new {@code LazyValue}.
	 */
	public LazyValue()
	{
		this(null);
	}
	
		
	/**
	 * Outputs a value according to a give input.
	 * If the {@code LazyValue} has not been flagged
	 * as changed, it returns the previous output.
	 * 
	 * @param input  an input parameter
	 * @return  an output value
	 */
	public O Value(I input)
	{
		if(this.input != input)
		{
			this.input = input;
			setChanged();
		}
		
		if(hasChanged)
		{
			output = compute(input);
			hasChanged = false;
		}
		
		return output;
	}
	
	/**
	 * Adds a handler to the {@code LazyValue}.
	 * Handlers are always updated along
	 * with the main value.
	 * 
	 * @param v  a lazy value
	 */
	public void add(LazyValue<?,?> v)
	{
		handlers = Array.add.to(handlers, v);
	}
	
	/**
	 * Forces the {@code LazyValue} to recompute.
	 */
	public void setChanged()
	{
		hasChanged = true;
		for(LazyValue<?,?> v : handlers)
		{
			v.setChanged();
		}
	}

		
	@Override
	public O compute(I input)
	{
		if(cmp != null)
		{
			return cmp.compute(input);
		}
		
		return null;
	}

	protected O LastOutput()
	{
		return output;
	}
	
	protected I LastInput()
	{
		return input;
	}
}