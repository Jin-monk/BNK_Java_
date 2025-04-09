package exam2;

import java.util.List;

public class Mapper_Maria implements IMapper_crud{

	@Override
	public void create(Member member) {
		System.out.println("마리아 멤버 등록");
	}

	@Override
	public List<Member> readAll() {
		System.out.println("멤버 전체 조회");
		return null ;
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

}
