package waffles.utils.tools.patterns.semantics;

/**
 * A {@code Permeable} object can be transparent depending on conditions.
 *
 * @author Waffles
 * @since 05 Apr 2025
 * @version 1.1
 */
@FunctionalInterface
public interface Permeable
{
	/**
	 * Returns the transparency of the {@code Permeable}.
	 * 
	 * @return  a transparency state
	 */
	public abstract boolean isTransparent();
}