package services;

public class UsaInterestService implements InterestService {
	private double interestRate;

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	public UsaInterestService() {
		// TODO Auto-generated constructor stub
	}

}
