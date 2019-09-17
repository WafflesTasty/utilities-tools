package zeno.util.tools.patterns.properties.node;

import zeno.util.tools.Integers;
import zeno.util.tools.patterns.properties.Copyable;

/**
 * The {@code INode} interface defines objects with a parent-child relationship.
 *
 * @author Zeno
 * @since Mar 5, 2016
 * @version 1.0
 * 
 * 
 * @see Copyable
 */
public interface INode extends Copyable<INode>
{		
	/**
	 * Returns the parent of the {@code INode}.
	 * 
	 * @return  the node's parent
	 */
	public abstract INode Parent();
	
	/**
	 * Returns the children of the {@code INode}.
	 * 
	 * @return  the node's children
	 * 
	 * 
	 * @see Iterable
	 */
	public abstract <N extends INode> Iterable<N> Children();
	
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
		for(INode child : Children())
		{
			if(child != null)
			{
				return false;
			}
		}
		
		return true;
	}

	/**
	 * Checks if this node is a descendant of another node.
	 * 
	 * @param node  a node to check for
	 * @return  {@code true} if this node is a descendant
	 */
	public default boolean isInside(INode node)
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
		
		return parent.isInside(node);
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
	 * Returns the node height of the {@code INode}.
	 * <br> This indicates the relative depth of the deepest child node.
	 * 
	 * @return  the node's height
	 */
	public default int NodeHeight()
	{
		if(!isLeaf())
		{
			int max = 0;
			for(INode child : Children())
			{
				max = Integers.max(max, child.NodeHeight());
			}
			
			return 1 + max;
		}
		
		return 0;
	}
	
	/**
	 * Returns the node count of the {@code INode}.
	 * <br> This indicates the amount of nodes under this node plus one.
	 * 
	 * @return  the node's count
	 */
	public default int NodeCount()
	{
		int count = 1;
		for(INode child : Children())
		{
			if(child != null)
			{
				count += child.NodeCount();
			}
		}
		
		return count;
	}
	
	/**
	 * Returns the node depth of the {@code INode}.
	 * <br> This indicates the height of the highest parent node.
	 * 
	 * @return  the node's depth
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
}