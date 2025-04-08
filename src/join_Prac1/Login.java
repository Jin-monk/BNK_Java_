package join_Prac1;

public class Login {
	
	private String inputLoginId;
	private String inputLoginPw;
	
	
	
	public Login() {}
	
	public Login(String inputLoginId, String inputLoginPw) {
		this.inputLoginId = inputLoginId;
		this.inputLoginPw = inputLoginPw;
	}
	
	public String getInputLoginId() {
		return inputLoginId;
	}
	public void setInputLoginId(String inputLoginId) {
		this.inputLoginId = inputLoginId;
	}
	public String getInputLoginPw() {
		return inputLoginPw;
	}
	public void setInputLoginPw(String inputLoginPw) {
		this.inputLoginPw = inputLoginPw;
	}
	
	@Override
	public String toString() {
		return "Login [inputLoginId=" + inputLoginId + ", inputLoginPw=" + inputLoginPw + "]";
	}
	
	

}
