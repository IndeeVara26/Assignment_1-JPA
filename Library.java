package Assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.Person;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonPU");
		EntityManager entitymanager = emf.createEntityManager();
		Person obj = new Person();
		obj.setPersonName("Indee Vara");
		obj.setPersonEmail("indulalam@gmail.com");
		obj.setPersonPhone(937407524);
		
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(obj);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
	}
}
