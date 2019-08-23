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
	 * 5.아이디 존재 체크
	 * 6.로그인
	 * ***************
	 * <관리자기능>
	 * 1.회원목록
	 * 2.아이디검색
	 * 3.이름검색
	 * */
	//0. 서버구축	
	public MemberService() {
		members= new MemberBean[3]; //변수 초기화
		count =0; //멤버수 카운트하기 위해서
	}
	//--------------------------------------------------------
	//사용자기능
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
	
	//3.비번수정: 아이디  옛날비번 로그인 /신규비번 입력받은 후/ 옛날비번을 체크 후 일치하면/ 신규비번으로 변경
	//비번 변경후 로그인을 실행해서 새로 바뀐 비번이 로그인 성공, 옛날비번 로그인 실패
	/***
	 * 
	 */
	public String changePw(MemberBean param) {
		//--------------------------------------
		String msg ="비밀번호 바꾸기";
		String id= param.getId();
		String pw = param.getPw();
		String[] pws = pw.split(",");
		String currPw = pws[0];
		String newPw = pws[1];
		//----------------------------------------
		for(int i=0; i<count; i++) {
			if(param.getId().equals(members[i].getId())&&
					(param.getPw().equals(members[i].getPw()))) {
				members[i].setPw(newPw);
				//msg="로그인성공";
		//----------------------------------------
				//if(param.getPw().equals(members[i].getId())) {
				//	msg="새로운 비밀번호 입력";
				//	MemberBean[] temp = new MemberBean[i];
					//temp[i] = members[i];
					//members[i]=param;
					break;
				}
			}
		return msg;
		}
	
	//4.회원탈퇴
	public String deleteAccount(MemberBean param) {
		String msg ="회원탈퇴";
		return msg;
	}
	//5.아이디체크
	public String existId(String id) {
		String msg ="가입 가능한 아이디 입니다.";
		//가입가능한 아이디 입니다. 
		for(int i=0; i<count; i++) {
			if(id.equals(members[count].getId())) {
			msg = "이미존재하는 아이디 입니다.";
			break;
			}
		}
		return msg;
	}
	//6.로그인 : 파라미터로ID, pw만 입력받은 상태(search임) if문안에는 무조건 break
	public String login(MemberBean param) {
		String msg="로그인 실패";
		for(int i=0; i<count; i++) {
			if(param.getId().equals(members[i].getId())&&
					param.getPw().equals(members[i].getPw())) {
				msg = "로그인 성공";
			break;
			}
		}
		return msg;
		
	}
	//--------------------------------------------------------
	//관리자
	//1.회원목록
	public String list() {
		String msg ="";
		for(int i=0; i<count; i++) {
			msg += members[i].toString()+", \n";
		}
		return msg;
	}
	//2. 아이디검색
	public MemberBean findById(String id) { //여기 id는 보완의 가치가 없기때문에 param을 줄 필요가 없다. 
		MemberBean member = new MemberBean();
		for(int i=0; i<count; i++) {
			if(id.equals(members[i].getId())) {//equals는 요소의 접근
				member = members[i]; //사본주는것과 같음
				break;
			}
		}
		
		return member;
	}
	
	//3.이름검색
	public MemberBean[] findByname(String name) {
		int num =0;
		for(int i=0; i<count; i++) {
			if(name.equals(this.members[i].getName())) {
				num ++;
			}
		}
		MemberBean[] members = new MemberBean[num];
		//------------------------------------------
		num =0;
		for(int i=0; i<count; i++) {
			if(name.equals(this.members[i].getName())) {
				members[i] = this.members[i];
				num++;
				if(num==members.length) {
					break;
					}
				}
			}
		return members; 
	}
	//4.전체회원수
	public String countAll() {
		return "총회원수:"+count;
	}
	
}
