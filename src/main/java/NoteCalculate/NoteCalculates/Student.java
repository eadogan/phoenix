package NoteCalculate.NoteCalculates;

import java.math.BigDecimal;

public class Student {
	
	private String firstName;
	private String secondName;
	private String lesson;
	private BigDecimal note;
	
	public Student() {
		super();
	}
	
	public Student(String firstName, String secondName, String lesson, BigDecimal note) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.lesson = lesson;
		this.note = note;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getLesson() {
		return lesson;
	}

	public void setLesson(String lesson) {
		this.lesson = lesson;
	}

	public BigDecimal getNote() {
		return note;
	}

	public void setNote(BigDecimal note) {
		this.note = note;
	}
	
}
