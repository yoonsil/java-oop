package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.domains.*;
import com.bitcamp.services.*;

public class MemberController {
	public static void main(String[] args) {
		/*/*요구사항(기능정의)
		 * <사용자기능>
		 * 1.회원가입
		 * 2.마이페이지
		 * 3.비번수정
		 * 4.회원탈퇴
		 * 5.아이디 존재 체크
		 * 6.로그인
		 * ***************
		 * <관리자기능>
		 * 5.회원목록
		 * 6.아이디검색
		 * 7.이름검색
		 * */
		MemberBean member = null; //초기화(initializing)
		MemberService service = new MemberService();
		String[] arr = null;
		String temp ="";
		// ------------------------------------
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.마이페이지\n" 
					+ "3.비번수정\n"
					+ "4.회원탈퇴\n"
					+ "5.아이디체크\n"
					+ "6.로그인\n"
					+ "7.목록보기\n"
					+ "8.아이디검색\n"
					+ "9.이름검색\n"
					+ "10.로그인")) {
			case "0":
				return;
			case "1":
				temp = JOptionPane.showInputDialog("이름,ID,PW,주민번호,혈액형,키,몸무게");
				arr = temp.split(",");
				member = new MemberBean();
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				member.setBlood(arr[4]);
				member.setHeight(Double.parseDouble(arr[5]));
				member.setWeight(Double.parseDouble(arr[6]));
				JOptionPane.showMessageDialog(null,service.createAccount(member));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.seeMypage(member));
				break;
			case "3"://비번수정
				temp = JOptionPane.showInputDialog("아이디,현재비번,새로운 비번 입력");
				arr = temp.split(",");
				member = new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]+","+arr[2]);
				JOptionPane.showMessageDialog(null, service.changePw(member));
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			case "6":
				
				break;
			case "7":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "8":
				temp =JOptionPane.showInputDialog("검색ID");
				member = service.findById(temp);
				JOptionPane.showMessageDialog(null,member.toString());
				break;
			case "9":
				temp = JOptionPane.showInputDialog("이름입력");
				break;
			case "10"://login
				temp = JOptionPane.showInputDialog("ID,PW 입력");
				arr = temp.split(",");
				String loginId = arr[0];
				String loginPw = arr[1];
				member = new MemberBean();
				member.setId(arr[0]);
				member.setPw(arr[1]);
				String msg = service.login(member);
				JOptionPane.showMessageDialog(null, msg);
				break;
			default:
				break;
			}
		}

	}
}
