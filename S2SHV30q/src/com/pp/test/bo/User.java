package com.pp.test.bo;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTimetag() {
		return timetag;
	}
	public void setTimetag(String timetag) {
		this.timetag = timetag;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getReadname() {
		return readname;
	}
	public void setReadname(String readname) {
		this.readname = readname;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String username;
	private String password;
	private String timetag;
	private String power;
	private String readname;
	private String team;
	private String clientid;
	private String local;
}
