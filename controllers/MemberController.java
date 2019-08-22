package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.domains.*;
import com.bitcamp.services.*;

public class MemberController {
	public static void main(String[] args) {
		/*
		 * name, id, pw, ssn, blood; height, weight;
		 */
		MemberBean member = null; //초기화(initializing)
		MemberService service = new MemberService();
		// ------------------------------------
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.마이페이지\n" 
					+ "3.비번수정\n"
					+ "4.회원탈퇴\n"
					+ "5.목록보기\n"
					+ "6.아이디검색")) {
			case "0":
				return;
			case "1":
				String spec = JOptionPane.showInputDialog("이름,ID,PW,주민번호,혈액형,키,몸무게");
				String[] arr = spec.split(",");
				member = new MemberBean();
				member.SetName(arr[0]);
				member.SetId(arr[1]);
				member.SetPw(arr[2]);
				member.SetSsn(arr[3]);
				member.SetBlood(arr[4]);
				member.SetHeight(Double.parseDouble(arr[5]));
				member.SetWeight(Double.parseDouble(arr[6]));
				JOptionPane.showMessageDialog(null,service.createAccount(member));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.seeMypage(member));
				break;
			case "3":

				break;
			case "4":
				
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "6":
				String searchId =JOptionPane.showInputDialog("검색ID");
				member = service.findById(searchId);
				JOptionPane.showMessageDialog(null,member.toString());
				break;
			}
		}

	}
}
