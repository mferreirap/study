package entities;

public class Person {

	public Person(String name, String studentEmail, int roomChoice) {
		super();
		this.name = name;
		this.studentEmail = studentEmail;
		this.roomChoice = roomChoice;
	}

	public Person(String name, String studentEmail) {
		super();
		this.name = name;
		this.studentEmail = studentEmail;
	}

	private String name;
	private String studentEmail;
	private int roomChoice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public int getRoomChoice() {
		return roomChoice;
	}

	public void setRoomChoice(int roomChoice) {
		this.roomChoice = roomChoice;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", studentEmail=" + studentEmail + ", roomChoice=" + roomChoice + "]";
	}

}
