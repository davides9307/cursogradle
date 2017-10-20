package co.ceiba.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import co.ceiba.dominio.Person;
import co.ceiba.servicio.Emailservice;
import co.ceiba.servicio.Notifypersonservice;
import co.ceiba.testdatabuilder.PersonTestdatabuilder;

public class notifypersonservicetest {

	
	private Notifypersonservice notifypersonservice;
	private Emailservice emailservice;



@Before 
public void setup() {
	Emailservice emailservic=Mockito.mock(Emailservice.class);
	Mockito.when(emailservic.sendmail(Mockito.anyString())).thenReturn("Hola Mundo");
	notifypersonservice= new Notifypersonservice(emailservic);
	
	
	}


@Test
public void notifytest() {
	
	//Arrange
	
	Person person= new PersonTestdatabuilder().build();
	
	//Act
	String message =notifypersonservice.notify(person);
	
	//Assert
	Assert.assertNull(message);
	System.out.println(message);
	
}


}