package com.bitcamp.controllers;
import javax.swing.JOptionPane;
import com.bitcamp.domains.MemberBean;
import com.bitcamp.services.MemberService;
public class AdminController {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원목록\n"
					+ "2.아이디검색\n" 
					+ "3.이름검색\n"
					+ "4.전체회원수")) {
			case "1": 
				JOptionPane.showMessageDialog(null, service.toString());
				break;
			
			
			}
		}
	}
}
