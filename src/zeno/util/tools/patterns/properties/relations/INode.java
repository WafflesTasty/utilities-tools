package zeno.util.tools.patterns.properties.relations;

import zeno.util.tools.patterns.properties.IRelatable;

/**
 * The {@code INode} interface defines a relatable object with parent-child behavior.
 *
 * @author Zeno
 * @since Sep 22, 2019
 * @version 1.0
 * 
 * 
 * @see IRelatable
 */
public interface INode extends IRelatable
{
	@Override
	public abstract INodal Relations();
}