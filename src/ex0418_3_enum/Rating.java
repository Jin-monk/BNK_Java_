package ex0418_3_enum;

public enum Rating {
	GOLD("골드", 10),SILVER("실버", 5),BRONZE("브론즈", 2);
	
	String korName;
	double discountRate;
	
	Rating(String korName, double discountRate){
		this.korName = korName;
		this.discountRate = discountRate;
		
	}
	
//	public int calculateDiscount(int price) {
//		
//		if(Rating.values().equals(GOLD)) {
//			int result =  (int) ((int)price*(GOLD.discountRate*(1/100)));
//			return result;
//		}else if (Rating.values().equals(SILVER)) {
//			int result = (int) ((int)price*(SILVER.discountRate*(1/100)));
//			return result;
//		}else if (Rating.values().equals(BRONZE)) {
//			int result = (int) ((int)price*(BRONZE.discountRate*(1/100)));
//			return result;
//		}
//		return (Integer) null;
//	}
	
	public int calculateDiscount(int price) {
		return (int) (price * (discountRate / 100.0));
	}
}
