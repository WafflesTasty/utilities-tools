package waffles.utils.tools.patterns.basic.errors;

import waffles.utils.tools.patterns.BugFix;

/**
 * A {@code NotImplementedError} is defined as a {@code RuntimeException}
 * which can be thrown in methods that still require implementation.
 *
 * @author Waffles
 * @since 17 Apr 2024
 * @version 1.1
 * 
 * 
 * @see RuntimeException
 * @see BugFix
 */
@Deprecated
public class NotImplementedError extends RuntimeException implements BugFix
{
	private static final long serialVersionUID = -3471529381563386480L;
}