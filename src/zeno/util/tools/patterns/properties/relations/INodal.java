package zeno.util.tools.patterns.properties.relations;

import zeno.util.tools.Integers;
import zeno.util.tools.patterns.properties.IRelations;

/**
 * The {@code INodal} interface defines relations of an {@code INode}.
 *
 * @author Zeno
 * @since Sep 22, 2019
 * @version 1.0
 * 
 * 
 * @see IRelations
 */
public interface INodal extends IRelations
{
	/**
	 * Returns the children of the {@code INodal}.
	 * 
	 * @return  a set of child nodes
	 * 
	 * 
	 * @see Iterable
	 * @see INode
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
	 * Returns the descendant count of the {@code INode}.
	 * <br> This indicates the amount of nodes under this node plus one.
	 * 
	 * @return  a node descendant count
	 */
	public default int Descendants()
	{
		int count = 1;
		for(INode child : Children())
		{
			if(child != null)
			{
				count += child.Relations().Descendants();
			}
		}
		
		return count;
	}

	/**
	 * Returns the node height of the {@code INode}.
	 * <br> This indicates the relative depth of the deepest child node.
	 * 
	 * @return  a node height
	 */
	public default int Height()
	{
		if(!isLeaf())
		{
			int max = 0;
			for(INode child : Children())
			{
				max = Integers.max(max, child.Relations().Height());
			}
			
			return 1 + max;
		}
		
		return 0;
	}
}