import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] ages = new int[n];
		double[] heights = new double[n];		
		
		
		for(int i = 0; i < names.length; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			sc.nextLine();
			names[i] = sc.nextLine();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
			System.out.print("Altura: ");
			heights[i] = sc.nextDouble();			
		}
		
		double sumHeights = 0.0;
		for(int i = 0; i < heights.length; i++) {
			sumHeights += heights[i];
		}
		double averageHeight = sumHeights / heights.length;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", averageHeight);
		
		byte lessThan16YearsOld = 0;
		for(int i = 0; i < ages.length; i++) {
			if(ages[i] < 16) {
				lessThan16YearsOld++;
			}
		}
		double lessThan16YearsOldPercentage = lessThan16YearsOld * 100.0 / ages.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", lessThan16YearsOldPercentage);
		
		for(int i = 0; i < ages.length; i++) {
			if(ages[i] < 16) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();
	}
}
