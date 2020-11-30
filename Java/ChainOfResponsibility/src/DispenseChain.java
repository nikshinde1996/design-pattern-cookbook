
// Handler
public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	void dispense(Currency currency);
}

class Dollor50Dispensor implements DispenseChain {
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 50) {
			int num = currency.getAmount() / 50;
			int remainder = currency.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ notes.");
			
			if(remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(currency);
		}
	}
};

class Dollor20Dispensor implements DispenseChain {
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 20) {
			int num = currency.getAmount() / 20;
			int remainder = currency.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20$ notes.");
			
			if(remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(currency);
		}
	}
};

class Dollor10Dispensor implements DispenseChain {
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		chain = nextChain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 10) {
			int num = currency.getAmount() / 10;
			int remainder = currency.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10$ notes.");
			
			if(remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(currency);
		}
	}
};