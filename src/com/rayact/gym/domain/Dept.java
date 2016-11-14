package com.rayact.gym.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * 部门实体
 * @author dominc
 *
 */
public class Dept {
	private Integer did;
	private String dname;
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	private String dinfo;
	
	private Set<Emp> emps = new HashSet<Emp>();
	
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDinfo() {
		return dinfo;
	}
	public void setDinfo(String dinfo) {
		this.dinfo = dinfo;
	}
	
	
}
