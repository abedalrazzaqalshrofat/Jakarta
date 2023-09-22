import entities.IdentityCard;
import entities.Student;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence_normal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Student student = new Student();
        List<IdentityCard> identityCards = new ArrayList<>();
        identityCards.add(new IdentityCard("Jordan","1997xf",LocalDate.of(1997,Month.MARCH,27)));
        identityCards.add(new IdentityCard("Jordan","fs7ssg",LocalDate.of(1997,Month.MARCH,27)));
        identityCards.add(new IdentityCard("Jordan","fs7sxh",LocalDate.of(1997,Month.MARCH,27)));
        student.setStudentName("Abedalrazaq hassan");

        student.setIdentityCard(identityCards);

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(student);
        transaction.commit();
    }


}
