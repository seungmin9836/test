package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.team.dao.MPdelete_dao;

public class MPdelete_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String uId = request.getParameter("uId");
		
		
		MPdelete_dao dao = new MPdelete_dao();
		dao.delete(uId);
		
		HttpSession session = request.getSession();
		
		session.invalidate();
	}

}
