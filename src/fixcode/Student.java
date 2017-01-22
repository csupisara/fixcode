package fixcode;

/**
 * A student with a name that extends from a Person and a id.
 * @author Supisara
 */

public class Student extends Person {
	private long id;

	/**
	 * Name is managed by Person class.
	 * Initialize a id.
	 * @param name of this student and a id.
	 */
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/** 
	 *@return a string representation of this Student. 
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compare student by name.
	 * They are equal if the name matches.
	 * They are not equal if the object is null and the class is not match.
	 * @param obj is any Object that want to check that it equal or not.
	 * @return true if name and id are the same, false otherwise.
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
		Student other = (Student) obj; 
		//4. Compare whatever values determine "equal"
		if(name.equalsIgnoreCase(other.name) && this.id == other.id){
			return true;
		}
		return false;
	}

	/**
	 * Get the student's id.
	 * @return id of this student.
	 */
	public long getId() {
		return id;
	}

	/**
	 * Set or change the student's id.
	 * @param id is a id of this student.
	 */
	public void setId(long id) {
		this.id = id;
	}
}

