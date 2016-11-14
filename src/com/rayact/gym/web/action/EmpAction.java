package com.rayact.gym.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.rayact.gym.domain.Emp;

public class EmpAction extends ActionSupport implements ModelDriven<Emp> {

	private Emp emp = new Emp();
	@Override
	public Emp getModel() {
		return emp;
	}
	
	/**
	 * Ìø×ªµ½×¢²áÒ³Ãæ£ºregistUI
	 */
	public String registUI() {
		return "registUI";
	}
}
