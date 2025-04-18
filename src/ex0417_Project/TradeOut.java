package ex0417_Project;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TradeOut {

	private String p_code;
	private String c_code;
	private String o_date;
	private int out_qty;
	private int out_cost;
	private String s_code;
//	private int o_seq; 시퀀스 
}
