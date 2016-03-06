import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		ArrayList<Integer> save  = new ArrayList<Integer>();
		boolean check ;
		
		//creat a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is "+number1+"+"+number2+"?");
		
		int answer = input.nextInt();

		
		while(number1 + number2 != answer){
			System.out.println("Wrong answer.Try again.What is "+number1+"+"+number2+"?");
			answer = input.nextInt();
			save.add(answer);
			check = save.contains(answer);
			while (check=true) {
				System.out.println("You already entered.");
				break;
			}
		}
		System.out.println("You got it!");
	}

}
