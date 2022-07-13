
public class SimpleLambda {

	public static void main(String[] args) {
		AnimalSoundFunction lionRoar = (s) -> s + "!!!";	
		AnimalSoundFunction catMrrr  = (s) -> s + " *uWu*";

		System.out.println(lionRoar.say("Arrr"));
		System.out.println(catMrrr.say("Mrrr"));
		System.out.println("passed");
	}
}

interface AnimalSoundFunction {
	String say(String line);
}
