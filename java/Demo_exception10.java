/**
 * 
 */
package com.ust.examples;

/**
 * @author ustjava18
 *
 */
class StudentNotFoundException extends Exception {
	 
    public StudentNotFoundException(String message) {
        super(message);
    }
}
class StudentManager {
	 
    public Student11 find(String studentID) throws StudentNotFoundException {
        if (studentID.equals("123456")) {
            return (Student11) new Student11();
        } else {
            throw new StudentNotFoundException(
                "Could not find student with ID " + studentID);
        }
    }
}
 class Demo_exception10 {

	
	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
		 
        try {
 
            Student11 student = manager.find("0000001");
 
        } catch (StudentNotFoundException ex) {
            System.err.print(ex);
        }
	}
}