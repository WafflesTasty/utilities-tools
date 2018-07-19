package zeno.util.tools.patterns.properties.operator;

/**
 * The {@code Operation} interface defines an abstract operation.
 * By using interfaces to delegate operations, different object types
 * can implement different optimizations for operations.
 * 
 * @author Zeno
 * @since Jul 13, 2018
 * @version 1.0
 * 
 * 
 * @param <O>  the type of the result
 * @see Operable
 * @see Operator
 */
public interface Operation<O>
{		
	/**
	 * Returns the result of the {@code Operation}.
	 * 
	 * @return  the operation result
	 */
	public abstract O result();

	/**
	 * Returns the cost of the {@code Operation}.
	 * 
	 * @return  the operation cost
	 */
	public abstract int cost();
}