package zeno.util.tools.patterns.properties.nodes;

import zeno.util.tools.helper.Array;
import zeno.util.tools.helper.Iterables;

/**
 * The {@code Node} class defines a basic {@code INode} implementation.
 * 
 * @author Zeno
 * @since Mar 5, 2016
 * @version 1.0
 * 
 * 
 * @see INode
 */
public class Node implements INode
{
	private Node parent;
	private Node[] children;
	
	/**
	 * Adds a child to the {@code Node}.
	 * 
	 * @param child  a child to add
	 */
	public void addChild(Node child)
	{
		child.setParent(this);
		if(children == null)
		{
			children = new Node[1];
			children[0] = child;
			return;
		}
		
		for(int i = 0; i < children.length; i++)
		{
			if(children[i] == null)
			{
				children[i] = child;
				return;
			}
		}
		
		children = Array.add.to(children, child);
	}
	
	/**
	 * Removes a child in the {@code Node}.
	 * 
	 * @param child  a child to remove
	 */
	public void removeChild(Node child)
	{
		if(children == null)
		{
			return;
		}
		
		for(int i = 0; i < children.length; i++)
		{
			if(children[i] == child)
			{
				children[i] = null;
				return;
			}
		}
	}
	
	/**
	 * Changes a child in the {@code Node}.
	 * 
	 * @param i  the child's index
	 * @param child  a new child
	 */
	public void setChild(int i, Node child)
	{
		if(children == null)
		{
			children = new Node[i + 1];
		}
		
		if(children.length <= i)
		{
			children = Array.copy.of(children, i + 1);
		}
		
		children[i] = child;
		if(child != null)
		{
			child.setParent(this);
		}
	}
	
	/**
	 * Changes the parent of the {@code Node}.
	 * 
	 * @param parent  a new parent
	 * @see Node
	 */
	public void setParent(Node parent)
	{
		this.parent = parent;
	}
		
	/**
	 * Clears the children of the {@code Node}.
	 */
	public void clearChildren()
	{
		children = null;
	}
	
	
	/**
	 * Returns a child of the {@code Node}.
	 * 
	 * @param i  the child's node index
	 * @return  a child node
	 */
	public Node Child(int i)
	{
		if(children != null 
		&& children.length > i)
		{
			return children[i];
		}
		
		return null;
	}
	
	/**
	 * Returns the child count of the {@code Node}.
	 * <br> This only counts direct descendants of this node.
	 * 
	 * @return  the node's child count
	 */
	public int ChildCount()
	{
		int count = 0;
		
		if(children != null)
		{
			for(INode child : children)
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
	 * Returns the index of the {@code Node}.
	 * 
	 * @return  the node's index
	 */
	public int Index()
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
	
		
	@Override
	public <N extends INode> Iterable<N> Children()
	{
		return Iterables.of(children);
	}
	
	@Override
	public Node Parent()
	{
		return parent;
	}
}