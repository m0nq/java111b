import java.util.*;

class MyCircleTester {
	public static void main(String[] args) {

		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();

		MyCircle c1 = new MyCircle(rand1.nextInt(9) + 1, rand1.nextInt(9) + 1, rand1.nextInt(9) + 1);
		MyCircle c2 = new MyCircle(rand2.nextInt(9) + 1, rand2.nextInt(9) + 1, rand2.nextInt(9) + 1);
		MyCircle c3 = new MyCircle(rand3.nextInt(9) + 1, rand3.nextInt(9) + 1, rand3.nextInt(9) + 1);
		
		System.out.printf("The area for circle 1 is %.2f.\n", c1.getArea());
		System.out.printf("The area for circle 2 is %.2f.\n", c2.getArea());
		System.out.printf("The area for circle 3 is %.2f.\n", c3.getArea());

		if (c2.doesOverlap(c3)) {

			System.out.println("Circle 1 and Circle 2 overlap.");
			
		} else if (c1.doesOverlap(c3)) {

			System.out.println("Circle 1 and Circle 3 overlap.");

		} else if (c1.doesOverlap(c2)) {

			System.out.println("Circle 2 and Circle 3 overlap.");
			
		}
	}
}