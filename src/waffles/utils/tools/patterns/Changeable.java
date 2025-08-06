package waffles.utils.tools.patterns;

import waffles.utils.tools.primitives.Array;

/**
 * A {@code Changeable} keeps track of its change state. Additional
 * {@code Changeable} objects can be added as handlers, allowing them
 * to be updated automatically along with their parent object.
 *
 * @author Waffles
 * @since 11 Sep 2023
 * @version 1.1
 */
public class Changeable
{
	private boolean hasChanged;
	private Changeable[] handlers;
	
	/**
	 * Creates a new {@code Changeable}.
	 */
	public Changeable()
	{
		handlers = new Changeable[0];
		hasChanged = true;
	}

	/**
	 * Changes the {@code Changeable} state.
	 */
	public void setChanged()
	{
		setChanged(true);
		for(Changeable h : handlers)
		{
			h.setChanged();
		}
	}
	
	/**
	 * Adds a {@code Changeable} subhandler.
	 * Handlers are always updated along
	 * with the main object.
	 * 
	 * @param c  a changeable
	 */
	public void add(Changeable c)
	{
		handlers = Array.add.to(handlers, c);
	}
	
	/**
	 * Changes the {@code Changeable} state.
	 * 
	 * @param c  a changeable state
	 */
	public void setChanged(boolean c)
	{
		hasChanged = c;
	}
		
	/**
	 * Returns the {@code Changeable} state.
	 * 
	 * @return  a changed state
	 */
	public boolean hasChanged()
	{
		return hasChanged;
	}
}