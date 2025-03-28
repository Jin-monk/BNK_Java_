package vo;
//Student2, Student2Test, Bus
public class Bus {

	int busNum ;
	int passenger ; 
	int totalMoney ;
	
	public Bus (int busNum){
		this.busNum = busNum ; 
		
	}
	public int getBusNum() {
		return busNum;
	}

	public void setBusNum(int busNum) {
		this.busNum = busNum;
	}

	public  int getPassenger() {
		return passenger;
	}

	public  void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	
	public void take (Student2 i) {
		i.takeBus();
		totalMoney = totalMoney + i.fee ;
		passenger ++ ;
	}
	
	public String toString() {
		return "버스번호:"+busNum + 
				" 승객 수:"+passenger+
				" 총 요금:"+ totalMoney; 
	}
}
