package waffles.utils.tools.patterns.semantics;

/**
 * The {@code Computable} interface defines an object which computes output based on input.
 *
 * @author Waffles
 * @since 11 Sep 2023
 * @version 1.1
 *
 *
 * @param <I>  an input type
 * @param <O>  an output type
 */
@FunctionalInterface
public interface Computable<I,O>
{
	/**
	 * Computes a new output according to an input.
	 * 
	 * @param input  an input parameter
	 * @return  an output value
	 */
	public abstract O compute(I input);
}