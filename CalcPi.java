// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int number = Integer.parseInt(args[0]);
		double sum = 0; 

		for (int i = 0; i < number; i++){
			double term = Math.pow(-1, i) / (2 * i + 1);
			sum = sum + term;
		}

		sum = sum * 4;
			
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum);
	
	}
}