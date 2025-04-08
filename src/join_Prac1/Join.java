package join_Prac1;

public class Join {

	private String inputJoinId ;
	private String inputJoinPw ;
	
	
	public Join(String inputJoinId, String inputJoinPw) {
		this.inputJoinId = inputJoinId;
		this.inputJoinPw = inputJoinPw;
	}
	
	public String getInputJoinId() {
		return inputJoinId;
	}
	public void setInputJoinId(String inputJoinId) {
		this.inputJoinId = inputJoinId;
	}
	public String getInputJoinPw() {
		return inputJoinPw;
	}
	public void setInputJoinPw(String inputJoinPw) {
		this.inputJoinPw = inputJoinPw;
	}

	@Override
	public String toString() {
		return "Join [inputJoinId=" + inputJoinId + ", inputJoinPw=" + inputJoinPw + "]";
	}
	
	
}
