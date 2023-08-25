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
	
	
	public boolean join(TblMemberDTO member) {
			String sql ="INSERT INTO HNSB_MEMBER VALUES(?,?,?,?)";
			
			boolean result =false;
			
			int rNum = 0;
			
			try {
				conn =DBconnection.getConnection();
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, member.getUserid());
				pstm.setString(2, member.getUserpw());
				pstm.setString(3, member.getUsername());
				pstm.setString(4, member.getUsergender());
				
				rNum = pstm.executeUpdate();
				if(rNum != 0) {
					result = true;
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
			return result;
		}
	public TblMemberDTO login(String userid,String userpw) {
		
		String sql = "SELECT * FROM HNSB_MEMBER WHERE USERID =? AND USERPW = ?";
		
		try {
			conn=DBconnection.getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			TblMemberDTO member = new TblMemberDTO();
			
			
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				member.setUserid(rs.getString("USERID"));
				member.setUserpw(rs.getString("USERPW"));
				return member;
			}
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
		return null;
	}
}
