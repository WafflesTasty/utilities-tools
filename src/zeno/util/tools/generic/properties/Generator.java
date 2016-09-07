package zeno.util.tools.generic.properties;

/**
 * The {@code Generator} interface defines an object capable of generating specific objects.
 * 
 * @param <O> the type of objects to generate
 * 
 * @since Oct 16, 2104
 * @author Zeno
 */
@FunctionalInterface
public interface Generator<O extends Object>
{	
	/**
	 * Generates an object from the generator.
	 * 
	 * @return a generated object
	 */
	public abstract O generate();
}