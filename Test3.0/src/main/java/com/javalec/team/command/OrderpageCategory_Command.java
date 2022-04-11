package com.javalec.team.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.team.dao.OrderpageCategory_dao;
import com.javalec.team.dto.OrderpageCategory_dto;

public class OrderpageCategory_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String uid =(String)session.getAttribute("uId");
		//값 받아와야함
		OrderpageCategory_dao dao = new OrderpageCategory_dao();
		ArrayList<OrderpageCategory_dto>dtos = dao.list(uid);//내가넣음!!!!!
		
		request.setAttribute("list", dtos);
		
		
	}

}
