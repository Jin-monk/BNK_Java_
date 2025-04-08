package ex_data_250408;

public class TypeTest {

	public static void main(String[] args) {
		
		TypeInt ti = new TypeInt();
		TypeFloat tf = new TypeFloat();
		TypeString ts = new TypeString();
		
		DataType[] dtArr = new DataType[3];
		
		dtArr[0] = ti;
		dtArr[1] = tf;
		dtArr[2] = ts;
		
		
		
		f(tf);
		
		TypeObject to = new TypeObject();
		//to.obj = new TypeInt() ;
		to.obj = tf ;
		TypeFloat x = (TypeFloat)to.obj ;
		x.f = 4.3f;
		
		//명시적 형변환이 필요가 없음 .  
		TypeZeneric <String> tzrString = new TypeZeneric (); 
		tzrString.t = "Zeneric 연습";
		System.out.println(tzrString.t);
		
		TypeZeneric <TypeFloat> tzrFloat = new TypeZeneric (); 
		tzrFloat.t = tf; 
		tzrFloat.t.f = 10.7f;
		
		
	}
	public static void f(ISample s) {
		
	}

}
