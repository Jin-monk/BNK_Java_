package interface_Prac;

public class BeanFactory {
	TV result ; 
	
	/*
	 * public TV getBean(int num) {
	 * 
	 * if (num == 1) {// 삼성 result = new SamsungTV(); } else if (num == 2) {// LG
	 * result = new LgTV(); } return result; }
	 */
	
	public TV getBean(String tv) {
		
		if (tv.equals("samsung")) {// 삼성
			return new SamsungTV();
		} else if (tv.equals("lg")) {// LG
			return new LgTV();
		}
		return null;
		
	}
}
