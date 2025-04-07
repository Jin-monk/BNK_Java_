package integer_Prac;

public class InfinityObjectArray {

	private Object[] objs;
	
	public InfinityObjectArray() {
		objs = new Object[3];
	}

	public Object[] getObjs() {
		return objs;
	}

	public void setObjs(Object[] objs) {
		this.objs = objs;
	}

	// objs 배열에 데이터를 추가하는 기능의 메소드
	int idx = 0;

	public void add(String s) {
		//배열의 물리적 크기의 끝에 도달하면 에러가 남. 
		// 물리적 크기의 끝에 도달했을 때 새로운 배열을 만들어서 그 배열에 넣어볼까? 
		// 만약 현재 인덱스 값이 배열의 크기(3)와 동일하다면 ? 
		// i 값이 3과 같아 ? 그러면 새 배열을 만들어라 . 
		if ( idx == objs.length ) {
			Object[] temp = new Object[objs.length+1];
			for ( int i = 0 ; i < objs.length; i++) {
				temp [i] = objs[i] ; 
			}
			objs = temp ;  
		}
		objs[idx] = s;
		idx++;
		// 해당 변수의 범위를 따져봐라.
		// 인덱스용 변수 i 의 범위는 ? 0 ~ 2까지 .
		
	}

	public void showArray() {
		for (int i = 0; i < idx ; i++) {
			System.out.println(objs[i]);
		}
	}

}
