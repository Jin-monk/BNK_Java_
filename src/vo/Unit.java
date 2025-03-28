package vo;
//Unit, UnitTest
public class Unit {
	// 이름 체력 특정대상에게 공격
	// 맞은 대상은 에너지 감소
	// 감소 method
	String name ;
	int energy ; 

	public Unit(String name) {
		this.name = name;
		this.energy = 10 ; 
	}

	// 이름
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 에너지
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	// 공격 하기.
	public void attack(Unit enemy) {
		enemy.decreaseEnergy();
	}

	// 피해 받음.
	public void decreaseEnergy() {
		energy = energy - 1;
	}
	
	//호출 
	@Override
	public String toString() {
		return "Unit [name=" + name + ", energy=" + energy + "]";
	}
	
	
	
}
