package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.vo.UserVO;

import lombok.extern.java.Log;

@Repository("userDaoJdbcTemplate")
@Log
public class UserDaoImplJdbcTemplate implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private class MyMapper implements RowMapper<UserVO>{
		@Override
		public UserVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserVO userVo = new UserVO();
			userVo.setUserid(rs.getString("userid"));
			userVo.setName(rs.getString("name"));
			userVo.setGender(rs.getString("gender"));
			userVo.setCity(rs.getString("city"));
			return userVo;
		}
	}
	
	@Override
	public UserVO selectUser(String userid) {
		return this.jdbcTemplate.queryForObject("SELECT * FROM Users WHERE userid = ?", 
				new MyMapper(), userid);
	}

	@Override
	public List<UserVO> selectUserList() {
		return this.jdbcTemplate.query("SELECT * FROM Users", new MyMapper());
	}

	@Override
	public int insertUser(UserVO userVo) {
		return this.jdbcTemplate.update("INSERT INTO Users VALUES(?,?,?,?)", 
				userVo.getUserid(), userVo.getName(), userVo.getGender(), userVo.getCity());
	}

	@Override
	public int updateUser(UserVO userVo) {
		String sql = "UPDATE Users SET name= ?, gender= ?, city= ? WHERE userid= ?";
		return this.jdbcTemplate.update(sql, userVo.getName(), userVo.getGender(), 
				userVo.getCity(), userVo.getUserid());
	}

	@Override
	public int deleteUser(String userid) {
		return this.jdbcTemplate.update("DELETE FROM Users WHERE userid = ?", userid);
	}

}
