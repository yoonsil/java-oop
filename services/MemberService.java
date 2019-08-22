package com.bitcamp.services;
import com.bitcamp.domains.MemberBean;
public class MemberService { //고객정보를 저장하는 곳.
	private MemberBean[] members; //변수선언
	private int count;
	//------------------------
	/*요구사항(기능정의)
	 * <사용자기능>
	 * 1.회원가입
	 * 2.마이페이지
	 * 3.비번수정
	 * 4.회원탈퇴
	 * ***************
	 * <관리자기능>
	 * 5.회원목록
	 * 6.아이디검색
	 * */
	//0. 서버구축	
	public MemberService() {
		members= new MemberBean[3]; //변수 초기화
		count =0; //멤버수 카운트하기 위해서
	}
	//1.회원가입
	public String createAccount(MemberBean param) {
		String msg="회원가입 성공";
		members[count] = param;
		count++;
		return msg;
	}
	
	//2.마이페이지
	public String seeMypage(MemberBean param) {
		return param.toString();
	}
	
	//3.비번수정
	public String changePw(MemberBean param) {
		String msg ="비밀번호 바꾸기";
		return msg;
	}
	
	//4.회원탈퇴
	public String deleteAccount(MemberBean param) {
		String msg ="회원탈퇴";
		return msg;
	}
	
	//5.회원목록
	public String list() {
		String msg ="";
		for(int i=0; i<count; i++) {
			msg += members[i].toString()+", \n";
		}
		return msg;
	}
	//6. 아이디검색
	public MemberBean findById(String id) { //여기 id는 보완의 가치가 없기때문에 param을 줄 필요가 없다. 
		MemberBean member = new MemberBean();
		String msg ="";
		for(int i=0; i<count; i++) {
			if(id.equals(members[i].getId())) {
				member = members[i]; //사본주는것과 같음
				//msg=String.format("찾으시는 아이디는 %s입니다.", members[i].getId());
			}
		}
		
		return member;
	}
}
