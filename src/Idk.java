/* nathan mccloud
 * not sure why i'm putting my name on this...
 */

import java.util.concurrent.ThreadLocalRandom;

public class Idk {
	
	private static void hand_Print(String s, boolean newline, int min, int max)
	{
		
		for(int i=0; i<s.length(); i++)
		{
			System.out.print(s.charAt(i));
			System.out.flush();
			try {
				Thread.sleep(500/(2*ThreadLocalRandom.current().nextInt(min, max+1)));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(newline)
			System.out.println();
	}
	
	//what is this i don't even
	private static void printThing(int x)
	{
		Integer i;
		hand_Print("\n /\\(✿^‿^✿)/\\___/\\ ", true, 10, 30);
		for(i=1; i<=x; i++)
		{	
			hand_Print(i.toString()+"desu~", false, 10, 30);
			if(i%2==0)
				hand_Print(" /\\--__--\\/\\ ", true, 10, 30);
			else
				hand_Print("   --__-- ", true, 10, 30);
		}
		i--;
		hand_Print(i.toString()+" desu~'s!\nSO ~KAWAII(0 w 0)DESU~!!",false, 5, 10);
	}

	public static void main(String[] args) {
		printThing(40);

	}


}
