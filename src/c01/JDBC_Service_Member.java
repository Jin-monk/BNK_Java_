package c01;

import java.util.ArrayList;

public class JDBC_Service_Member implements IJDBC_Service<Member>{
	ArrayList<Member> list = new ArrayList<>();

	
	public ArrayList<Member> insert() {
		
		return list;
	}

	public ArrayList<Member> update() {
		//DB에 접속 (Connection) 
		
		//DB에 쿼리 실행 (Statement)
		String query = "SELECT * FROM TBL_MEMBER";
		//DB로부터 데이터 받기
		
		//결과 보여주기
		return list;
	}
	@Override
	public ArrayList<Member> select() {
		
		return list;
	}

	public ArrayList<Member> delete() {
		return list;

	}
}
