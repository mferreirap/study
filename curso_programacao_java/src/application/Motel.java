package application;

import java.util.Scanner;

import entities.Person;
import entities.Rooms;

public class Motel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// fazer validação entre 1 e 10 estudantes

		int numberOfRooms = 10;
		Rooms[] rooms = new Rooms[numberOfRooms];
		for (int i = 0; i < rooms.length; i++) {
			int numberRoom = i + 1;
			char empty = 'Y';
			rooms[i] = new Rooms(numberRoom, empty);

		}

		System.out.println("Please, inform the number of students: ");

		int n = sc.nextInt();
		// if (n > 0 && n <= 10) {

		Person[] student = new Person[n];

		for (int i = 0; i < student.length; i++) {
			System.out.println("Declare the name of student: ");
			String name = sc.nextLine();
			sc.nextLine();
			String email = name + "@hotmail.com";
			System.out.println("Declare the room of student: ");
			int roomChoice = sc.nextInt();
			/*
			 * for (int j = 0; j < rooms.length; j++) { if (roomChoice ==
			 * rooms[j].getNumber() && rooms[j].getEmpty() == 'Y') { rooms[j].setEmpty('N');
			 * System.out.println("Student allocated."); } else {
			 * System.out.println("The room is not empty, please select another one: ");
			 * roomChoice = sc.nextInt(); }
			 */
			student[i] = new Person(name, email, roomChoice);

		}

		// }
		// }

		System.out.println(rooms.toString());
		System.out.println(student.toString());

		sc.close();

	}

}
