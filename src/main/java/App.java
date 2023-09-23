import entities.Course;
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

        Course course = entityManager.find(Course.class,2);

        course.getStudents().forEach(System.out::println);

        transaction.commit();


    }


}
