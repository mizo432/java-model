package org.venuspj.models.fundamentals;

public class Name {
	protected String name;

	protected Name(String name) {
		this.name = name;
	}

	public static Name of(String name) {
		return  new Name(name);

	}

}
