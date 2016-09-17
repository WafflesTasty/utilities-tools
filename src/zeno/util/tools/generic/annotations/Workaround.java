package zeno.util.tools.generic.annotations;

import java.lang.annotation.Documented;

/**
 * The {@code Workaround} annotation represents a piece of code that
 * contains a temporary fix as a result of external driver bugs.
 * 
 * @since Sep 17, 2016
 * @author Zeno
 */
@Documented
public @interface Workaround
{
	/**
	 * Defines the description of the {@code Workaround}.
	 * 
	 * @return  a description string
	 * @see String
	 */
	public String Description();
}