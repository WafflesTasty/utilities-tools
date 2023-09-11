package waffles.utils.tools.patterns.properties;

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
 */
public abstract class LazyValue<I,O>
{
	private I input;
	private O output;
	
	private boolean hasChanged;
	
	/**
	 * Creates a new {@code LazyValue}.
	 */
	public LazyValue()
	{
		hasChanged = true;
	}
	
	
	/**
	 * Computes a new output according to an input.
	 * 
	 * @param input  an input parameter
	 * @return  an output value
	 */
	public abstract O compute(I input);
	
	/**
	 * Outputs a value according to a give input.
	 * If the {@code LazyValue} has not been flagged
	 * as changed, it returns the previous output.
	 * 
	 * @param input  an input parameter
	 * @return  an output value
	 */
	public final O Value(I input)
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
	 * Forces the {@code LazyValue} to recompute.
	 */
	public void setChanged()
	{
		hasChanged = true;
	}
}