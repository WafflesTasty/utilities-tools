package zeno.util.tools.generic.properties;

/**
 * The {@code Parsable} interface defines an object that can be parsed to a string.
 *
 * @since Jul 23, 2015
 * @author Zeno
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