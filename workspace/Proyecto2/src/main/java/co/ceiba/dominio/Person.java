package co.ceiba.dominio;



public class Person {
    private String name;
    private String lastname;

    public Person(String name,String lastname) {
        this.name = name;
        this.lastname =lastname;
    }

    public String getName() {
        return name;
    }
    
    public String getLastname(){
    	
    	return lastname;
    }
}
