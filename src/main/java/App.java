import entities.IdentityCard;
import entities.Student;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence_normal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Student student = entityManager.find(Student.class, 1);
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        student.setStudentName("Abedalrazzzaq");
        entityManager.persist(student);
        entityTransaction.commit();


    }


}
