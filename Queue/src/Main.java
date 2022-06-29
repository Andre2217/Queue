import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Queue queue = new Queue();
		Scanner input = new Scanner(System.in);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.show();
		queue.dequeue();
		queue.show();
		queue.enqueue(50);
		queue.enqueue(40);
		queue.enqueue(90);
		queue.show();
		
		int choice, number;
		do {
			System.out.println("1 - enqueue");
			System.out.println("2 - dequeue");
			System.out.println("3 - Show the queue");
			System.out.println("0 - exit");
			System.out.println("pick an option");
			choice = input.nextInt();
			if(choice < 0 || choice > 3) {
				System.out.println("invalid option");
			}else {
				switch(choice){
					case 1:
						System.out.println("What number to enqueue?");
						number = input.nextInt();
						queue.enqueue(number);
						break;
					case 2:
						queue.dequeue();
						break;
					case 3:
						if(queue.first == null) {
							System.out.println("The queue is empty");
						}else {
							queue.show();
						}
						break;
				}
			}
			
		}while(choice != 0);
	}
}
