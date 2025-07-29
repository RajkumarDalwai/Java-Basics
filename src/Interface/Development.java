package Interface;

public class Development implements BankingClient, DomainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Development d = new Development();

		d.Login();
		d.checkingbalance();
		d.paycreditcard();
		d.Investments();
		d.transferbalance();

		BankingClient bc = new Development(); // Runtime polymorphism

		bc.checkingbalance();

		DomainClient dc = new Development(); // Runtime polymorphism

		dc.Investments();

	}

	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Login");
	}

	@Override
	public void Investments() {
		// TODO Auto-generated method stub
		System.out.println("Investments done");
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("paycreditcard done");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transferbalance done");
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingbalance done");
	}

}
