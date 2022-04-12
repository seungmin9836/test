package com.javalec.team.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.team.dao.MPchange_dao;
import com.javalec.team.dao.Updatecart_dao;

public class Updatecart_Command implements PCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String cQuantity = request.getParameter("N1");
		String product_pCode = request.getParameter("product_pCode");
		System.out.println(cQuantity);
		System.out.println(product_pCode);
		Updatecart_dao dao = new Updatecart_dao();
		dao.modify(cQuantity,  product_pCode);
	}

}
