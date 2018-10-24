package devopstest.devopstest;

/**
 * Hello world!
 *
 */
public class Personne
{
	private String m_name ; 
	private int age ; 
    
	public Personne(String nom, int m_age) {
    	this.m_name = nom; 
    	this.age = m_age ; 
    }
	
	public boolean estMajeur() {
		return this.age >= 18 ; 
	}
	
	public String getName() {
		return this.m_name;
	}
	
	public int getAge() {
		return this.age; 
	}
	
	
	
	
}
