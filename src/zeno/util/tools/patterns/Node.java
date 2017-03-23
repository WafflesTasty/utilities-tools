package zeno.util.tools.patterns;

import zeno.util.tools.Array;
import zeno.util.tools.generic.INode;

/**
 * The {@code Node} class defines a basic {@code INode} implementation.
 *
 * @since Mar 5, 2016
 * @author Zeno
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
	 * Removes a child from the {@code Node}.
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
	 * Changes a child of the {@code Node}.
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
		
	
	@Override
	public <N extends INode> N Parent()
	{
		return (N) parent;
	}
	
	@Override
	public Node[] Children()
	{
		return children;
	}
	
	@Override
	public Node instance()
	{
		return new Node();
	}
	
	@Override
	public Node copy()
	{
		Node copy = (Node) INode.super.copy();
		
		if(children != null)
		{
			int index = children.length - 1;
			for(int i = index; i >= 0; i--)
			{
				Node child = children[i];
				if(child != null)
				{
					Node ccopy = child.copy();
					copy.setChild(i, ccopy);
				}
			}
		}
		
		return copy;
	}
}