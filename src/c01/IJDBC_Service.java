package c01;

import java.util.ArrayList;

public interface IJDBC_Service<T> {

	ArrayList<T> insert();
	ArrayList<T> update();
	ArrayList<T> delete();
	ArrayList<T> select();
	
}
