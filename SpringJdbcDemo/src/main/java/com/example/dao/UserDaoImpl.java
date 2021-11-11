package com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.vo.UserVO;

import lombok.extern.java.Log;

@Repository("userDao")
@Log
public class UserDaoImpl implements UserDao {
	@Autowired
	private DataSource dataSource;

	@Override
	public UserVO selectUser(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		UserVO userVo = new UserVO();
		try {
			conn = this.dataSource.getConnection();
			String sql = "SELECT * FROM Users WHERE userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			userVo.setUserid(rs.getString("userid"));
			userVo.setName(rs.getString("name"));
			userVo.setGender(rs.getString("gender"));
			userVo.setCity(rs.getString("city"));
			if(rs != null) rs.close();  if(pstmt != null) pstmt.close(); 	if(conn != null) conn.close();
		}catch(SQLException ex) {
			log.info(ex.toString());
		}
		return userVo;
	}

	@Override
	public List<UserVO> selectUserList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<UserVO> list = new ArrayList<UserVO>();
		try {
			conn = this.dataSource.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Users");
			while(rs.next()) {
				UserVO userVo = new UserVO();
				userVo.setUserid(rs.getString("userid"));
				userVo.setName(rs.getString("name"));
				userVo.setGender(rs.getString("gender"));
				userVo.setCity(rs.getString("city"));
				list.add(userVo);
			}
			if(rs != null) rs.close();  if(stmt != null) stmt.close(); 	if(conn != null) conn.close();
		}catch(SQLException ex) {
			log.info(ex.toString());
		}
		return list;
	}

	@Override
	public int insertUser(UserVO userVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			conn = this.dataSource.getConnection();
			String sql = "INSERT INTO Users VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userVo.getUserid());
			pstmt.setString(2, userVo.getName());
			pstmt.setString(3, userVo.getGender());
			pstmt.setString(4, userVo.getCity());
			
			count = pstmt.executeUpdate();
			if(pstmt != null) pstmt.close(); 	if(conn != null) conn.close();
		}catch(SQLException ex) {
			log.info(ex.toString());
		}
		return count;
	}

	@Override
	public int updateUser(UserVO userVo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			conn = this.dataSource.getConnection();
			String sql = "UPDATE Users Set name = ?, gender = ?, city = ? WHERE userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userVo.getName());
			pstmt.setString(2, userVo.getGender());
			pstmt.setString(3, userVo.getCity());
			pstmt.setString(4, userVo.getUserid());
			
			count = pstmt.executeUpdate();
			if(pstmt != null) pstmt.close(); 	if(conn != null) conn.close();
		}catch(SQLException ex) {
			log.info(ex.toString());
		}
		return count;
	}

	@Override
	public int deleteUser(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count = 0;
		try {
			conn = this.dataSource.getConnection();
			String sql = "DELETE FROM Users WHERE userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			
			count = pstmt.executeUpdate();
			if(pstmt != null) pstmt.close(); 	if(conn != null) conn.close();
		}catch(SQLException ex) {
			log.info(ex.toString());
		}
		return count;
	}

}
