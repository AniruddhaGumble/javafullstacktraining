package com.training.assign1c;

public class EmpHashDuplicate {
	private String name;

	public EmpHashDuplicate(String name) {
	    this.name = name;
	}
	public void setName(String name) {
	    this.name = name;
	}

	public String getName() {
	    return this.name;
	}

	public String toString() {
	    return "Employee[ id=" + name + "]";
	}
}
