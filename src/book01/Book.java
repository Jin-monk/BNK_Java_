package book01;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Data
public class Book {

	
	private String bk_no;
	private String bk_name;
	private String bk_writer;
	private String bk_publisher;
	private String bk_price;
	
	
}
