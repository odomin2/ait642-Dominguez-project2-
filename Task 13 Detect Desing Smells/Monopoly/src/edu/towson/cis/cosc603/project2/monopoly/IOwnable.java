package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOwnable.
 */
public interface IOwnable {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * Gets the theOwner.
	 *
	 * @return the theOwner
	 */
	public abstract Player getTheOwner();

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public abstract int getPrice();

	/**
	 * Play action.
	 * @param msg TODO
	 * @return TODO
	 */
	public abstract Boolean playAction(String msg);

	/**
	 * Sets the theOwner.
	 *
	 * @param owner the new the owner
	 */
	public abstract void setTheOwner(Player owner);

	/**
	 * To string.
	 *
	 * @return the string
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public abstract String toString();

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public abstract boolean isAvailable();

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	public abstract void setAvailable(boolean available);

	public abstract void playerMoved(Player player, int playerIndex,
			GameMaster gameMaster);

}