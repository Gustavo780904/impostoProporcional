import java.util.Locale;
import java.util.Scanner;

public class impostoProporcional {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double renda, servico, capital, medico, educacional;
			
			System.out.print("Renda anual com sal�rio: ");
			renda = sc.nextDouble();
			System.out.print("Renda anual com presta��o de servi�o: ");
			servico = sc.nextDouble();
			System.out.print("Renda anual com sal�rio: ");
			capital = sc.nextDouble();
			System.out.print("Gastos m�dicos: ");
			medico = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			educacional = sc.nextDouble();
			
			
			
			
		sc.close();
	}

}
