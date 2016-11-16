import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.pruden
 *
 */
public class SpaceWeight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		double userWeight;
		double spaceWeight = 0;
		String planet;
		
		System.out.println("What is your weight?");
		userWeight = userInput.nextDouble();
		
		System.out.println("What planet do you want to travel to?");
		planet = userInput.next();
		
		if(planet.equalsIgnoreCase("Mercury")){
			spaceWeight = userWeight*0.38;
		}
		
		if(planet.equalsIgnoreCase("Venus")){
			spaceWeight = userWeight*0.91;
		}
		if(planet.equalsIgnoreCase("Earth")){
			spaceWeight = userWeight*0.1;
		}
		if(planet.equalsIgnoreCase("Moon")){
			spaceWeight = userWeight*0.165;
		}
		if(planet.equalsIgnoreCase("Mars")){
			spaceWeight = userWeight*0.38;
		}
		if(planet.equalsIgnoreCase("Jupiter")){
			spaceWeight = userWeight*2.34;
		}
		if(planet.equalsIgnoreCase("Saturn")){
			spaceWeight = userWeight*1.06;
		}
		if(planet.equalsIgnoreCase("Uranus")){
			spaceWeight = userWeight*0.92;
		}	
		if(planet.equalsIgnoreCase("Neptune")){
			spaceWeight = userWeight*1.19;
		}
		if(planet.equalsIgnoreCase("Pluto")){
			spaceWeight = userWeight*0.06;
		}
		
		System.out.println("Your weight on " + planet + " is " + spaceWeight);
		userInput.close();
	}

}
