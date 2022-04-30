package main;

public class User implements UserInterface{
	String name;
	String surname;

	@Override
	public String lastname(String name, String surname) {
		return name+" "+surname;
	}

	@Override
	public String lastname2(String name, String surname) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
