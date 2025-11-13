package exam04;

public class NPCGenerater {
	Person worker = new Person() {
		void Wake() {
			System.out.println("Wake up at 6");
			Work();
		}
	
		void Work() {
			System.out.println("GO to walk");
		}
	};
	
	void GeneraterPerson(Person person) {
		person.Wake();
	}
}
