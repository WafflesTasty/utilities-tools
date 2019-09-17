package zeno.util.tools.patterns.properties;

/**
 * The {@code IRelatable} interface defines an object which can be related to a parent.
 *
 * @author Zeno
 * @since Mar 5, 2016
 * @version 1.0
 */
public interface IRelatable
{		
	/**
	 * Returns the parent of the {@code IRelatable}.
	 * 
	 * @return  the object's parent
	 */
	public abstract IRelatable Parent();
	
	/**
	 * Returns the root of the {@code IRelatable}.
	 * 
	 * @return  the root object
	 */
	public default IRelatable Root()
	{
		IRelatable parent = Parent();
		if(parent != null)
		{
			return parent.Root();
		}
		
		return this;
	}
	
	
	/**
	 * Checks whether this {@code IRelatable} is a root.
	 * 
	 * @return  {@code true} if the node is a root
	 */
	public default boolean isRoot()
	{
		return Parent() == null;
	}

	/**
	 * Checks if this {@code IRelatable} is a node's descendant.
	 * 
	 * @param node  a node to check for
	 * @return  {@code true} if this node is a descendant
	 */
	public default boolean isInside(IRelatable node)
	{
		if(equals(node))
		{
			return true;
		}
		
		IRelatable parent = Parent();
		if(parent == null)
		{
			return false;
		}
		
		return parent.isInside(node);
	}
		
	/**
	 * Returns the depth of the {@code IRelatable}.
	 * <br> This indicates the height of the highest parent object.
	 * 
	 * @return  the object's depth
	 */
	public default int NodeDepth()
	{
		IRelatable parent = Parent();
		if(parent != null)
		{
			return parent.NodeDepth() + 1;
		}
		
		return 0;
	}
}