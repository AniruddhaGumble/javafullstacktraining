package com.training.assign1b;

public class Employee {                       
	
	    int eid;
	    String ename;

	 

	    public int getEmpid() {
	        return eid;
	    }

	 

	    public void setEmpid(int eid) {
	        this.eid = eid;
	    }

	 

	    public String getEmpname() {
	        return ename;
	    }

	 

	    public void setEmpname(String ename) {
	        this.ename = ename;
	    }

	 

	    public Employee(int eid, String ename) {
	        super();
	        this.eid = eid;
	        this.ename = ename;
	    }
	}
	
