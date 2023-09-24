import entities.*;
import jakarta.persistence.*;


public class App {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence_normal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        UniversityId universityId = new UniversityId();
        universityId.setUniversityName("Al-Balqaa Applied");
        universityId.setUniversityBranch("Amman");

        University university = entityManager.find(University.class, universityId);

        System.out.println(university);


        transaction.commit();


    }


}
