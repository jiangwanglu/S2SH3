package com.pp.test.action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;

import org.apache.struts2.interceptor.ServletRequestAware;
import com.pp.test.service.LoadDataService;
public class LoadDataAction  implements ServletRequestAware{
	private LoadDataService loadDataService;
	private HttpServletRequest request;
	private String result;
	private String jsonstr;
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getJsonstr() {
		return jsonstr;
	}

	public void setJsonstr(String jsonstr) {
		this.jsonstr = jsonstr;
	}

	public LoadDataService getLoadDataService() {
		return loadDataService;
	}
	public void setLoadDataService(LoadDataService loadDataService) {
		this.loadDataService = loadDataService;
	}
	
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}
	public String loadUser(){
		String user = request.getParameter("user");
		String paw = request.getParameter("paw");
		int index = (Integer) this.loadDataService.loadUser(user, paw);
		Map<String, Integer> list = new HashMap<String,Integer>();
		list.put("name", index);
		result = JSONArray.fromObject(list).toString();
		return "load_success";
	}
}