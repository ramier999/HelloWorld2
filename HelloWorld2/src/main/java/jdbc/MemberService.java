package jdbc;

import java.util.Scanner;

public class MemberService {
	
	public static Member memberInfo = null;
	Scanner scn = new Scanner(System.in);
	
	public MemberService() {
		
	}
	
	

	// 로그인
	public void doLogin() {
		
		Member member = new Member();
		
		System.out.print("ID >> ");
		String id = scn.nextLine();
		System.out.print("PW >> ");
		String pw = scn.nextLine();
		
		member = MemberManage.getInstance().loginInfo(id);
		
		if(member.getMemberPw().equals(pw)) { // 같을 경우 로그인
			memberInfo = member;
		} else {
			System.out.println("로그인 실패!");
		}
	}
	
	// 로그아웃
	public void logout() {
		if(memberInfo!=null) {
			memberInfo=null;
		}
	}
	
	// 고객등록
	public void registerCustomer() {
		Member member = new Member();
		System.out.print("고객 ID >> ");
		String id = scn.nextLine();
		System.out.print("고객 PW >> ");
		String pw = scn.nextLine();
		System.out.print("고객 이름 >> ");
		String name = scn.nextLine();
		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberName(name);
		member.setRole("0");
		int result = MemberManage.getInstance().registCustomer(member);
		if(result==1) {
			System.out.println("고객 정보 등록 성공!");
		} else {
			System.out.println("고객 정보 등록 실패!");
		}
	}
}
