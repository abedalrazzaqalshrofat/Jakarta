import entities.College;
import entities.University;
import entities.UniversityId;
import jakarta.persistence.*;


public class App {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence_normal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        UniversityId universityId = new UniversityId();

        universityId.setUniversityBranch("Amman");
        universityId.setUniversityName("Al-Balqaa Applied");

        University university = entityManager.find(University.class, universityId);

        College college = new College();
        college.setCollegeMajor("Since");
        college.setCollegeName("Abdullah II IT");
        college.setUniversity(university);
        entityManager.persist(college);
        transaction.commit();


    }


}
