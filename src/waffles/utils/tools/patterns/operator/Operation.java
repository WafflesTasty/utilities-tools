package waffles.utils.tools.patterns.operator;

import waffles.utils.tools.patterns.properties.counters.Accountable;

/**
 * The {@code Operation} interface defines an abstract resource-intensive operation.
 * As part of the {@link Operable}-{@link Operator} design pattern, different implementations
 * of the same operation can be used to ensure optimizations under varying circumstances.
 * Each {@code Operation} can compute its own {@link #cost()} which can be used
 * to estimate the efficiency of operations at run-time.
 * 
 * @author Waffles
 * @since Jul 13, 2018
 * @version 1.0
 * 
 * 
 * @param <O>  a result type
 * @see Accountable
 */
public interface Operation<O> extends Accountable
{		
	/**
	 * Returns the result of the {@code Operation}.
	 * 
	 * @return  an operation result
	 */
	public abstract O result();
}