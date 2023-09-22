package another;

import entities.Job;
import entities.Person;
import jakarta.persistence.*;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence_normal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        Job job = new Job();
        job.setJobName("Java developer");

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        final Person person = new Person();
        person.setName("abed");
        person.setLastName("Al-Sharafat");
        person.setJob(job);
        entityManager.persist(person);
        entityTransaction.commit();


    }


}
