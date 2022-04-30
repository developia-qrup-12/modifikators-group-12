package main;

public interface UserInterface {

	 String lastname(String name,String surname); // public
	 
	 public  String lastname2(String name,String surname); 
	 
//	 protected String lastname3(String name,String surname); 
	 
	 private  String lastname3(String name,String surname) {
		 return "";
	 }

	 default  void helloInterface() {
		 System.out.println("Hello Interface");
	 }
}
