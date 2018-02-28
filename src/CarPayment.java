
public class CarPayment {
private int carCost;
private int interestRate;
private int downPmt;
private int loanLength;
public int MonthlyPmt() {
	return (interestRate*(carCost-downPmt))/(1-(1+interestRate)^(-1*loanLength));
}
public int TotalInterest() {
	return MonthlyPmt()*loanLength-downPmt;
}
}
