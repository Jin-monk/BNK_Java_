package ex0417;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TradeIn {
	
	private String p_code;
	private String i_date;
	private int i_qty;
	private int i_cost;
//	private int i_seq; 시퀀스 
}
