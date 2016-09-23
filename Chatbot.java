import java.util.Scanner;
/**
* this class represents a basic AI that will chat with the user

* @author Graham Matthews
* @version0.1

*/

public class Chatbot{
public static void main (String[] args){

System.out.println("Hi, I'm chatbot, what's your name?");

Scanner keyboard = new Scanner(System.in);

String name = keyboard.nextLine();

System.out.println("Hi "+ name + "! How are you?");

keyboard.nextLine();

System.out.println("I'm sorry your human life is so fragile");

System.out.println("How old are you?");
int age = keyboard.nextInt();
System.out.println(age + "? You're really old! I was created when you started this program");

if (age>32){
	System.out.println("Only "+ (1024-age) + " years until you are 2^10 years old!");
	System.out.println("Good luck");
}

else{
	System.out.println("How many months until you turn " + (++age) + "?");	
	int months = keyboard.nextInt();
}
String answer="";
answer=keyboard.nextLine();
System.out.println("Do you have any hobbies? (or bye to leave)");
answer = keyboard.nextLine();
String correct = "Bye";
String correct2 = "bye";
while (!(answer.equals(correct) || answer.equals(correct2))){
	System.out.println("That's nice");
	System.out.println("Do you have any other hobbies? (or bye to leave)");
	answer=keyboard.nextLine();
}

}
}