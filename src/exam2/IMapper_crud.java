package exam2;

import java.util.List;

public interface IMapper_crud {
	
	void create(Member member);
	
	List<Member> readAll();
	
	void read(Member member);
	
}
