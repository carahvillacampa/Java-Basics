
public class CheckingAccount extends Account11 {
	

	//private double sub;
	

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return super.getBalance();
	}

	@Override
	public double withdraw(double sub) {
		// TODO Auto-generated method stub
		if ( super.withdraw(sub) > getBalance()) 
			System.out.println( "Stop. Account is overdrawn");
		return super.withdraw(sub);
	}





	
	
}
