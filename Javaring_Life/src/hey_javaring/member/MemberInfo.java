package hey_javaring.member;

public class MemberInfo {

	public static void main(String[] args) {

		// Member 객체 생성 - 기본 생성자
		Member member = new Member();
		
		member.setMemberId("mint1573");
		member.setMemberName("위서연");
		member.setMemberEmail("weesy44@naver.com");
		member.setMemberGender("여성");
		member.setMemberPhone("010-1234-5678");
		
		System.out.println(member.getMemberId());
		System.out.println(member.getMemberName());
		System.out.println(member.getMemberEmail());
		System.out.println(member.getMemberGender());
		System.out.println(member.getMemberPhone());


		// Member(String, String) - 회원 아이디와 이름으로 구성된 생성자
        Member mem1 = new Member();
        Member mem2 = new Member();
        Member mem3 = new Member();
        Member mem4 = new Member();
        Member mem5 = new Member();
        
        System.out.println("[회원1]" + mem1.getMemberId() + " :: " + mem1.getMemberName());
        System.out.println("[회원2]" + mem2.getMemberId() + " :: " + mem2.getMemberName());
        System.out.println("[회원3]" + mem3.getMemberId() + " :: " + mem3.getMemberName());
        System.out.println("[회원4]" + mem4.getMemberId() + " :: " + mem4.getMemberName());
        System.out.println("[회원5]" + mem5.getMemberId() + " :: " + mem5.getMemberName());

		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)


	}

}