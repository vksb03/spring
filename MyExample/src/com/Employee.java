package com;

public class Employee {
	private int id;
	private String name;
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void show()
	{
		System.out.println("id="+id+" "+"name="+name);
	}

}
