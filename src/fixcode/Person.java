package fixcode;

/**
 * A simple model for a person with a name.
 * @author Supisara
 */

public class Person {
	/** the person's full name. */
	public String name;

	/**
	 * Initialize a new Person object.
	 * @param name of this person.
	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * Get the person's name.
	 * @return the name of that person.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set or change the person's name.
	 * @param newName is the name that want to change to.
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Compare person's by name.
	 * They are equal if the name matches.
	 * They are not equal if the object is null and the class is not match.
	 * @param obj is any Object that want to check that it equal or not.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Object obj) {		
		//1. vertify that obj is not null
		if(obj == null){
			return false;
		}
		//2. test that obj is the same class as "this" object
		if(obj.getClass() != this.getClass()){
			return false;
		}
		//3. cast obj to this class's type
		Person other = (Person) obj; 
		//4. Compare whatever values determine "equal"
		if(name.equalsIgnoreCase(other.name)){
			return true;
		}
		return false;
	}

	/**
	 * Get a string representation of this Person.
	 * @return the name of this person
	 */
	public String toString() {
		return "Person " + name;
	}
}
