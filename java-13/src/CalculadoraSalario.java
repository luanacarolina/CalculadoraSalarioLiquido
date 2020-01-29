import java.util.Scanner;

public class CalculadoraSalario {

	
	double salarioBruto;
	
	Scanner scan = new Scanner(System.in);
	
	
	
	double calculaSalarioLiquido(double salarioBruto) {
		
		
		
		
		
		return  salarioBruto -calculaIr(salarioBruto) - calculaINSS(salarioBruto) ;
		
		
	}
	
	
	
	
	double calculaINSS(double salarioBruto) {
		double percentualInss = 0;
		if(salarioBruto<=1500) {
			percentualInss=8;
		}else if(salarioBruto>1500.01 && salarioBruto <=4000.00) {
			
			percentualInss =9;
		}else if(salarioBruto>4000.00) {
			percentualInss =11;
		}
		
		double inss = salarioBruto- ((salarioBruto/100)*percentualInss);
		
		System.out.println("O desconto de Inss é "+inss);
		
		return inss;
		
	}
		
		
		double calculaIr(double salarioBruto) {
			
			double percentualIr=0;
			
			
			if(salarioBruto<=3000) {
				
				percentualIr=0;
				System.out.println("Isento");
			}else if(salarioBruto>=3000.01 && salarioBruto<=6000.007) {
				percentualIr =7.5;
				
			}else if(salarioBruto>6000.00) {
				percentualIr = 15;
				
			}
			
			double ir = (salarioBruto/100)*percentualIr;
			
			System.out.println("O desconto de IR é "+ir);

			
			
			return ir;
		}
		
		

}
