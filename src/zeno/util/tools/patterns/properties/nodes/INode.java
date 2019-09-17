package zeno.util.tools.patterns.properties.nodes;

import zeno.util.tools.Integers;
import zeno.util.tools.patterns.properties.IRelatable;

/**
 * The {@code INode} interface defines objects with a parent-child relationship.
 *
 * @author Zeno
 * @since Mar 5, 2016
 * @version 1.0
 */
public interface INode extends IRelatable
{			
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
	 * Checks whether this {@code INode} is a leaf.
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
}