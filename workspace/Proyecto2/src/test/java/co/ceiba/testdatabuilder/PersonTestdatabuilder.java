package co.ceiba.testdatabuilder;



import co.ceiba.dominio.Person;

import static org.junit.Assert.*;

public class PersonTestdatabuilder {
   
	  private String name;
	  private String lastname;
	
	  
	  public PersonTestdatabuilder() {
		  this.name="Ceiba";
		  this.lastname="Software house";
		  
	  }
	
	  public PersonTestdatabuilder withname(String name) {
		  this.name=name;
		  return this;
	  }  
		  
	  public PersonTestdatabuilder withlastname(String lastname) {
		  
		  this.lastname= lastname;
		  return this;
	  }
		  
		  
	  public Person build() {
		  
		  return new Person(this.name,this.lastname);
	  }
	  
}
