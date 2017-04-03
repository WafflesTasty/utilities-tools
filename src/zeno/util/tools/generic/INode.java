package zeno.util.tools.generic;

import zeno.util.tools.generic.properties.Copyable;

/**
 * The {@code INode} interface defines objects with a parent-child relationship.
 *
 * @since Mar 5, 2016
 * @author Zeno
 * 
 * @see Copyable
 * @see Iterable
 */
public interface INode extends Copyable<INode>
{	
	/**
	 * Returns the children of the {@code INode}.
	 * 
	 * @return  the node's children
	 */
	public abstract INode[] Children();

	/**
	 * Returns the parent of the {@code INode}.
	 * 
	 * @return  the node's parent
	 */
	public abstract <N extends INode> N Parent();
	
					
	/**
	 * Checks if this node is a child of another node.
	 * 
	 * @param node  a node to check for
	 * @return  {@code true} if this node is a child node
	 */
	public default boolean isChildOf(INode node)
	{
		if(equals(node))
		{
			return true;
		}
		
		INode parent = Parent();
		if(parent == null)
		{
			return false;
		}
		
		return parent.isChildOf(node);
	}
	
	/**
	 * Returns a single child of the {@code INode}.
	 * 
	 * @param i  the child's node index
	 * @return  a child node
	 */
	public default INode Child(int i)
	{
		INode[] children = Children();
		if(children != null 
		&& children.length > i)
		{
			return children[i];
		}
		
		return null;
	}
	
	/**
	 * Returns the root node of the {@code INode}.
	 * 
	 * @return  the root node
	 */
	public default INode Root()
	{
		INode parent = Parent();
		if(parent != null)
		{
			return parent.Root();
		}
		
		return this;
	}
	
				
	/**
	 * Checks whether this {@code INode} is a leaf node.
	 * 
	 * @return  {@code true} if the node is a leaf
	 */
	public default boolean isLeaf()
	{
		return ChildCount() == 0;
	}
	
	/**
	 * Checks whether this {@code INode} is a root node.
	 * 
	 * @return  {@code true} if the node is a root
	 */
	public default boolean isRoot()
	{
		return Parent() == null;
	}
	
	/**
	 * Returns the child count of the {@code INode}.
	 * 
	 * @return  the node's child count
	 */
	public default int ChildCount()
	{
		int count = 0;
		
		INode[] children = Children();
		if(children != null)
		{
			for(INode child : Children())
			{
				if(child != null)
				{
					count++;
				}
			}
		}
		
		return count;
	}
	
	/**
	 * Returns the node depth of the {@code INode}.
	 * 
	 * @return  the node's node depth
	 */
	public default int NodeDepth()
	{
		INode parent = Parent();
		if(parent != null)
		{
			return parent.NodeDepth() + 1;
		}
		
		return 0;
	}
	
	/**
	 * Returns the index of the {@code INode}.
	 * 
	 * @return  the node's index
	 */
	public default int Index()
	{
		int index = 0;
		// Assumes the iterator starts at zero.
		for(INode child : Parent().Children())
		{
			if(child == this)
				return index;
			index++;
		}
		
		return -1;
	}
}