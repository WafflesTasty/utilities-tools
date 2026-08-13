package waffles.utils.tools.patterns.properties.checks;

/**
 * A {@code Validation} can be validated.
 *
 * @author Waffles
 * @since Aug 11, 2026
 * @version 1.1
 */
@FunctionalInterface
public interface Validation
{
	/**
	 * Validates the {@code Validation}.
	 * 
	 * @return  {@code true} if valid
	 */
	public abstract boolean validate();
}