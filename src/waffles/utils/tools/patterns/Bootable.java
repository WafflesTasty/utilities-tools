package waffles.utils.tools.patterns;

/**
 * A {@code Bootable} can boot using a config file.
 *
 * @author Waffles
 * @since Aug 10, 2026
 * @version 1.1
 *
 *
 * @param <C>  a config type
 */
public interface Bootable<C>
{	
	/**
	 * Shuts down the {@code Bootable}.
	 * 
	 * @param cfg  a configuration
	 */
	public abstract void shutdown(C cfg);
	
	/**
	 * Boots the {@code Bootable}.
	 * 
	 * @param cfg  a configuration
	 */
	public abstract void boot(C cfg);
}