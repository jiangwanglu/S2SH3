package com.pp.test.dao;

import com.myapp.common.dao.BaseDaoImpl;
import com.pp.test.bo.User;

public class UserDaoImpl extends BaseDaoImpl<User,Integer> implements UserDao {

	public int loadUser(String user, String paw) {
		String team = "a";
		String sql = "select * from user where username = ? and password = ? and team = ?";
		try {
			return this.queryForInt(sql, new String[]{user,paw,team});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
