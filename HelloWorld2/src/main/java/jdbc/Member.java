package jdbc;

public class Member {
	
	private String memberId;
	private String memberPw;
	private String memberName;
	private String accountId;
	private String role; // 권한 : 은행원 - 1 / 사용자 - 0
	
	public String getMemberId() {
		return memberId;
	}
	
	public String getMemberPw() {
		return memberPw;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public String getAccountId() {
		return accountId;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
}
