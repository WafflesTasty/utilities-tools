package zeno.util.tools.patterns.properties;

/**
 * The {@code Generator} interface defines an object capable of generating specific objects.
 * 
 * @author Zeno
 * @since Oct 16, 2104
 * @version 1.0
 * 
 * 
 * @param <O> the type of objects to generate
 */
@FunctionalInterface
public interface Generator<O>
{	
	/**
	 * Generates an object from the generator.
	 * 
	 * @return a generated object
	 */
	public abstract O generate();
}