public class Time {
	public static void main (String[] args) {

	//variable declarations 
	String message1 = "number of seconds since midnight: ";
	String message2 = "number of seconds remaining in the day: ";
	String message3 = "percentage of the day that has passed: ";
	String message4 = "elapsed time since I started working on this exercise: ";
	int hour = 12;
	int minute = 45;
	int second = 32;
	double wasd;
	int seconds = hour * 3600 + minute * 60 + second;
	
	//Messages
	System.out.print(message1);
	System.out.println(seconds);
	System.out.print(message2);
	System.out.println(86400 - 45932);
	System.out.print(message3);
	System.out.println(seconds/86400 * 100);
		}
}
