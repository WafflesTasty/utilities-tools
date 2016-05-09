package zeno.util.tools.generic;

import java.util.Iterator;

import zeno.util.tools.generic.properties.Copyable;

/**
 * The {@code INode} interface defines objects with a parent-child relationship.
 *
 * @author Zeno
 * @since Mar 5, 2016
 * @see Copyable
 * @see Iterable
 */
public interface INode extends Copyable<INode>, Iterable<INode>
{
	/**
	 * Returns the children of the {@code INode}.
	 * 
	 * @return  the node's children
	 */
	public abstract INode[] getChildren();
	
	/**
	 * Returns the parent of the {@code INode}.
	 * 
	 * @return  the node's parent
	 */
	public abstract <N extends INode> N getParent();
		
	/**
	 * Returns a single child of the {@code INode}.
	 * 
	 * @param i  the child's node index
	 * @return  a child node
	 */
	public default <N extends INode> N getChild(int i)
	{
		INode[] children = getChildren();
		if(children != null 
		&& children.length > i)
		{
			return (N) children[i];
		}
		
		return null;
	}
		
	/**
	 * Returns the root node of the {@code INode}.
	 * 
	 * @return  the root node
	 */
	public default <N extends INode> N getRoot()
	{
		INode parent = getParent();
		if(parent != null)
		{
			return parent.getRoot();
		}
		
		return (N) this;
	}
	
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
		
		INode parent = getParent();
		if(parent == null)
		{
			return false;
		}
		
		return parent.isChildOf(node);
	}
	
	/**
	 * Iterates over the children of the {@code INode}.
	 * 
	 * @return  a node iterator
	 * @see Iterator
	 */
	@Override
	public default Iterator<INode> iterator()
	{
		INode[] children = getChildren();
		return new Iterator<INode>()
		{
			private int index;
			
			@Override
			public boolean hasNext()
			{
				return children != null 
					&& children.length > index;
			}
			
			@Override
			public INode next()
			{
				return children[index++];
			}
		};
	}

	
	/**
	 * Returns the node depth of the {@code INode}.
	 * 
	 * @return  the node's node depth
	 */
	public default int getNodeDepth()
	{
		INode parent = getParent();
		if(parent != null)
		{
			return parent.getNodeDepth() + 1;
		}
		
		return 0;
	}
	
	/**
	 * Returns the child count of the {@code INode}.
	 * 
	 * @return  the node's child count
	 */
	public default int getNodeCount()
	{
		int count = 0;
		
		INode[] children = getChildren();
		if(children != null)
		{
			for(INode child : this)
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
	 * Checks whether this node is a leaf node.
	 * 
	 * @return  {@code true} if the node is a leaf
	 */
	public default boolean isLeaf()
	{
		return getNodeCount() == 0;
	}
	
	/**
	 * Checks whether this node is a root node.
	 * 
	 * @return  {@code true} if the node is a root
	 */
	public default boolean isRoot()
	{
		return getParent() == null;
	}
		
	/**
	 * Returns the index of the {@code INode}.
	 * 
	 * @return  the node's index
	 */
	public default int getIndex()
	{
		int index = 0;
		// Assumes the iterator starts at zero.
		for(INode child : getParent())
		{
			if(child == this)
				return index;
			index++;
		}
		
		return -1;
	}
}