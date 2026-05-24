package hmk;

public class TaiKhoan {
	private String name;
    private double money;

    public TaiKhoan(String name, double money) {
        this.name = name;
        this.money = money;
    }

	public TaiKhoan() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	    
}
