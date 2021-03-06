package composition_and_Inheritance;

import java.util.Enumeration;
import java.util.Vector;

public class Person {
	private Vector roles = new Vector();
	private String name;
	private String id;
	
	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void addRole(PersonRole aRole) {
		this.roles.addElement(aRole);
	}

	public void removeRole(PersonRole aRole) {
		this.roles.removeElement(aRole);
	}

	public Enumeration geRoles() {
		return this.roles.elements();
	}
}
