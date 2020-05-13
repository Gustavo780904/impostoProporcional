import java.util.Locale;
import java.util.Scanner;

public class impostoProporcional {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double renda, servico, capital, medico, educacional, impostoBruto, impostoSal, impostoServ, impostoGc, impostoDevido, deducao, maxDeducao, gastosDedutiveis;
			
			System.out.print("Renda anual com salário: ");
			renda = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			servico = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			capital = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			medico = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			educacional = sc.nextDouble();
			System.out.println();
			System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
			System.out.println();
			
			
			if (renda >= 36000.00 && renda <= 60000.00) {
				impostoSal = (renda - 36000.00) * 0.1;
			}
			else if (renda > 60.000) {
				impostoSal = (renda * 0.2) + 2400.00;
			}
			else {
				impostoSal = 0.0;
			}
			impostoServ = servico * 0.15;
			impostoGc = capital * 0.20;
			
			System.out.println();
			System.out.println("CONSOLIDADO DE RENDA:");
			System.out.println("Imposto sobre salário: " + impostoSal);
			System.out.println("Imposto sobre serviços: " + impostoServ);
			System.out.println("Imposto ganho de capital: " + impostoGc);
		sc.close();
	}

}
