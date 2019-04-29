import java.util.Scanner;

public class Quadratic {
	int formula1;
	int formula2;
	
	int a,b,c;
	int discriminant;
	
	Quadratic(){
		
		Scanner input= new Scanner (System.in);
		System.out.println("Enter a,b,c: ");
		a= input.nextInt();
		b= input.nextInt();
		c= input.nextInt();
	}
	
	public int calculateDis() {
		discriminant= (int)((Math.pow(b, 2)- (4*a*c)));
		//System.out.println(discriminant);
		return discriminant;
	}
	
	public void formulaCalc() {
		formula1= (-b+discriminant)/2*a;
		formula2=(-b-discriminant)/2*a;
		//System.out.println(formula1+" "+ formula2);
	}
	
	public void bool() {
		if (discriminant > 0) {
			System.out.println("The equation has two roots:"+ formula1+" and "+formula2);
		}
		else if(discriminant == 0) {
			System.out.println("The equation has one root: "+ formula1);
			
		}
		else {
			System.out.println("The equation has no real roots");
		}
	}

	public static void main(String[] args) {
		Quadratic input1= new Quadratic();
		input1.calculateDis();
		input1.formulaCalc();
		input1.bool();

	}

}
