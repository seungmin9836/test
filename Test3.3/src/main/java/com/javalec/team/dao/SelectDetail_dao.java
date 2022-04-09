package com.javalec.team.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.team.dto.ProductDetail_dto;
import com.javalec.team.dto.ProductReview_dto;
import com.javalec.team.dto.ReviewDetail_dto;

public class SelectDetail_dao {

	DataSource dataSource;
	
	
	
	public SelectDetail_dao() {
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/1teamp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ProductDetail_dto all (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				String pPrice = resultSet.getString("pPrice");
				
				dto = new ProductDetail_dto (pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	public ArrayList<ReviewDetail_dto> allreview (String spCode){
		ArrayList<ReviewDetail_dto> dtos = new ArrayList<ReviewDetail_dto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select r.rTitle, r.user_uId, r.rDate, r.rImg, r.rContent "
					+ "from user as u, ordering as o, product as p, review as r "
					+ "where u.uID = r.user_uId and o.oCode = r.order_oCode and p.pCode = r.product_pCode";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				String rTitle = resultSet.getString("rTitle");
				String user_uId = resultSet.getString("user_uId");
				String rDate = resultSet.getString("rDate");
				String rImg = resultSet.getString("rImg");
				String rContent = resultSet.getString("rContent");
				
				ReviewDetail_dto dto = new ReviewDetail_dto(rTitle, user_uId, rDate, rImg, rContent);
				
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �뵠 湲� �뵠  �뿳椰�   毓얍쳞  簾ル뗀�걟�뵳   �젟�뵳 	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	} //list end
	
	
	public ProductDetail_dto student (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				String pPrice = resultSet.getString("pPrice");
				
				dto = new ProductDetail_dto(pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	
	
	
	public ProductDetail_dto interior (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				String pPrice = resultSet.getString("pPrice");
				
				dto = new ProductDetail_dto(pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	
	
	
	public ProductDetail_dto office (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				String pPrice = resultSet.getString("pPrice");
				
				dto = new ProductDetail_dto(pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	
	
	
	public ProductDetail_dto stool (String spCode) {
		ProductDetail_dto dto = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice from product where pCode = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, spCode);
			resultSet = preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				String pCode = resultSet.getString("pCode");
				String pImg_detail = resultSet.getString("pImg_detail");
				String pImg_main = resultSet.getString("pImg_main");
				String pName = resultSet.getString("pName");
				String pQuantity = resultSet.getString("pQuantity");
				String pPrice = resultSet.getString("pPrice");
				
				dto = new ProductDetail_dto(pCode, pImg_detail, pImg_main, pName, pQuantity, pPrice);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//	
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dto;
	}//
	
	
	///////////////////////////////////////////////////////
}