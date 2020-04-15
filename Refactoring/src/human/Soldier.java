package human;

public class Soldier extends Human {
	private int bloodType;
	
    public Soldier(String name ,int age,int bloodType) {
		super(name, age);
		this.bloodType = bloodType;
	}

	public void setBloodType(int code) {
        bloodType = code;
    }

    public int getBloodType() {
        return bloodType;
    }
    public void live() {
        
        fight();
}

    public void fight() {
}
}
