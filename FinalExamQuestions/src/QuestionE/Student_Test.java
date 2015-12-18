package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Bruce", "Cole", "Smith", dBirthDate, "215 Labrador Lane", "302-893-4235", "bsmith@udel.edu","MIS");
		Student stu3 = new Student("Steven", "Nick", "McDonald", dBirthDate, "216 Labrador Lane", "302-893-7876", "snm@udel.edu","MIS");
		Student stu4 = new Student("Jeremy", "Quincy", "Adams", dBirthDate, "217 Labrador Lane", "302-893-1111", "jquincy@udel.edu","MIS");
		Student stu5 = new Student("Terrence", "Terry", "Turing", dBirthDate, "218 Labrador Lane", "302-893-2590", "ttt@udel.edu","MIS");
		
		HashMap<UUID, Student> studentMap = new HashMap<UUID, Student>();
		studentMap.put(stu1.getPersonID(), stu1);
		studentMap.put(stu2.getPersonID(), stu2);
		studentMap.put(stu3.getPersonID(), stu3);
		studentMap.put(stu4.getPersonID(), stu4);
		studentMap.put(stu5.getPersonID(), stu5);

		assertTrue(studentMap.size() == 5);
		
	}

}
