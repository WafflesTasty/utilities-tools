package zeno.util.tools.generic.properties;

/**
 * The {@code Parsable} interface defines an object that can be parsed to a string.
 *
 * @author Zeno
 * @since Jul 23, 2015
 */
@FunctionalInterface
public interface Parsable
{
	/**
	 * Parses the {@code Object} to a string.
	 * 
	 * @return  a parsed string
	 */
	public abstract String parse();
}