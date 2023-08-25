package com.codingbox.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.codingbox.web.dto.TblMemberDTO;

public class TblMemberDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	
	//회원가입 
	public boolean join(TblMemberDTO member) {
		String sql = "INSERT INTO tbl_member VALUES(?,?,?,?,?)";
		boolean result =false;
		
		int rNum=0;
		
		try {
			conn = DBconnection.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, member.getUserid());
			pstm.setString(2, member.getUserpw());
			pstm.setString(3, member.getUsername());
			pstm.setString(4, member.getUsergender());
			pstm.setString(5, member.getUserphone());
			
			//executeUpdate :1. DML 문의 행의 숫자가 리턴
			//				 2. 0이 리턴이 됐으면 아무일도 일어나지 않음
			rNum = pstm.executeUpdate();
			if(rNum != 0) {
				result = true;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public TblMemberDTO login(String userid,String userpw) {
		TblMemberDTO member = null;
		String sql = "SELECT * FROM tbl_member WHERE USERID = ? AND USERPW = ?";
		
		try {
			conn = DBconnection.getConnection();
			pstm =conn.prepareStatement(sql);
			pstm.setString(1,userid);
			pstm.setString(2, userpw);

			rs =pstm.executeQuery();
			
			if(rs.next()) {
				member = new TblMemberDTO();
				member.setUserid(rs.getString(1));
				member.setUserpw(rs.getString(2));
				member.setUsername(rs.getString(3));
				member.setUsergender(rs.getString(4));
				member.setUserphone(rs.getString(5));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return member;
	}
/*	public boolean login(String userid,String userpw) {
		
		boolean result = false;
		String sql = "SELECT * FROM tbl_member WHERE USERID = ? AND USERPW = ?";
	
		try {
			conn =DBconnection.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			
			rs = pstm.executeQuery();
			if(rs.next()) {
				result = true;
				return result;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return result;
			
	}
	*/
}
