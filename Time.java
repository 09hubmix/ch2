public class Time {
	public static void main (String[] args) {

	//variable declarations 
	String message1 = "number of seconds since midnight: ";
	String message2 = "number of seconds remaining in the day: ";
	String message3 = "percentage of the day that has passed: ";
	String message4 = "elapsed time since I started working on this exercise in seconds: ";
	int hour = 12;
	int minute = 45;
	int second = 32;
	int hour2 = 13;
	int minute2 = 12;
	int second2 = 26;
	double seconds = hour * 3600 + minute * 60 + second;
	int seconds2 = hour2 * 3600 + minute2 * 60 + second2;
	//Messages
	System.out.print(message1);
	System.out.println(seconds);
	System.out.print(message2);
	System.out.println(86400 - 45932);
	System.out.print(message3);
	System.out.println(seconds/86400 * 100);
	System.out.print(message4);
	System.out.println(seconds2);
		}
}
