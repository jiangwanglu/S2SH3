package com.pp.test.service;
import com.myapp.common.service.BaseServiceImpl;
import com.pp.test.dao.UserDao;
public class LoadDataServiceImpl extends BaseServiceImpl implements LoadDataService{
	private UserDao userdao;
	public UserDao getUserdao() {
		return userdao;
	}
	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}         
	
	
	public Object loadUser(String user, String paw) {
		return this.userdao.loadUser(user, paw);
	}
}