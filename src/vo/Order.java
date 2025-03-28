package vo;
//Order, OrderTest, Member
public class Order {

	private Long orderNO;
	private String orderDate;
	private String orderObject;
	private Member member;

	public Order() {
	}

	public Order(Long orderNO, String orderDate, String orderObject, Member member) {
		this.orderNO = orderNO;
		this.orderDate = orderDate;
		this.orderObject = orderObject;
		this.member = member;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Long getOrder() {
		return orderNO;
	}

	public void setOrder(Long order) {
		this.orderNO = order;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderObject() {
		return orderObject;
	}

	public void setOrderObject(String orderObject) {
		this.orderObject = orderObject;
	}

	public String toString() {
		return "주문번호: " + orderNO + "\n주문자 아이디: " + member.getMemberId() + "\n주문 날짜: " + orderDate + "\n주문자 이름: "
				+ member.getMemberName() + "\n주문 상품 번호: " + orderObject + "\n배송 주소: " + member.getMemberAddress();
	}
}
