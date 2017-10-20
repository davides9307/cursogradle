package co.ceiba.servicio;

import co.ceiba.dominio.Person;
import co.ceiba.servicio.Emailservice;

public class Notifypersonservice {

	
	private Emailservice emailservice;
	
	
	public Notifypersonservice(Emailservice emailservice) {
		
		this.emailservice=emailservice;
		
	}
	
	public String notify(Person person) {
		String message = "welcome" + person.getName();
		return emailservice.sendmail(message);
		
		
	}
}
