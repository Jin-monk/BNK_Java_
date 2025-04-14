package c02;

import java.util.Objects;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Member {

	private int mno;
	private String name;
	private String phone;

	//인스턴스를 비교할 때는 equals 메서드와 hashcode 메서드를 동시에 오버라이딩을 해줘야만 한다.
	@Override
	public boolean equals(Object obj) {
		Member temp = (Member)obj;
		
//		if ( this.mno == temp.mno && 
//				this.name == temp.name && 
//				this.phone == temp.phone) {
//			return true;
//		}
		
		if (this == obj) return true;
		if ( obj == null || getClass() != obj.getClass()) return false;
		
		Member target = (Member)obj;
		
		return mno == target.mno && name.equals(target.name) && phone.equals(target.phone);
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(mno,name,phone);
	}
	
	

}
