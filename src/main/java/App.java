import entities.University;
import jakarta.persistence.*;


public class App {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence_normal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        University university = new University();
        university.setUniversityBranch("Aqaba");
        university.setUniversityName("Al-Balqaa Applied");
        university.setInfo("Universities created at 1995");
        entityManager.persist(university);
        transaction.commit();


    }


}
