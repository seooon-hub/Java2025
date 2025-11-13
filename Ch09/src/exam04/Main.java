package exam04;

public class Main {

	public static void main(String[] args) {
		Person walker = new Person() {
			void Wake() {
				System.out.println("Wake up at 9");
				Work();
			}
			
			void Work() {
				System.out.println("GO to walk");
			}
		};
//		
//		// class Worker extends Person()
		walker.Wake();
//		// worker.work();
		
		NPCGenerater npc = new NPCGenerater();
//		npc.walker.Wake();
//		npc.GeneraterWalker();
		npc.GeneraterPerson(
				new Person() {
					void Wake() {
						System.out.println("Wake up at 7");
						System.out.println("Go to work");
					}
				}
			);
		
	}

}
