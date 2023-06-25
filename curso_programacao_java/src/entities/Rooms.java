package entities;

public class Rooms {

	public Rooms(int number, char empty) {
		super();
		this.number = number;
		this.empty = empty;
	}

	private int number;
	private char empty;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public char getEmpty() {
		return empty;
	}

	public void setEmpty(char empty) {
		this.empty = empty;
	}

	@Override
	public String toString() {
		return "Rooms [number=" + number + ", empty=" + empty + ", getEmpty()=" + getEmpty() + "]";
	}

}
