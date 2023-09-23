import entities.IdentityCard;
import entities.Student;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class App {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence_normal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Student student = new Student();
        student.setStudentName("Abdalrazaq");
        student.setIdentityCard(List.of(new IdentityCard("Jor","9971015142", LocalDate.of(1997, Month.MARCH,27))));
        entityManager.persist(student);



        transaction.commit();


    }


}
