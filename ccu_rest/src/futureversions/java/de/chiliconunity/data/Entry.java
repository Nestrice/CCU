package de.chiliconunity.data;

import de.chiliconunity.app.User;

public abstract class Entry {

	public enum EntryState {
		created, approved, purchasing, bought, consumed, expired
	}
	
	EntryState status;
	Ingredient ingredient;
	User author;
	
	
}
