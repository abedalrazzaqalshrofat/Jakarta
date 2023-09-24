import entities.*;
import jakarta.persistence.*;


public class App {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence_normal");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        DepartmentId departmentId = new DepartmentId();
        departmentId.setDepartmentName("IT");
        departmentId.setDepartmentField("Since");

        Department department = new Department();
        department.setDepartmentField(departmentId.getDepartmentField());
        department.setDepartmentName(departmentId.getDepartmentName());

        UniversityId universityId = new UniversityId();
        universityId.setUniversityBranch("Amman");
        universityId.setUniversityName("Al-Balqaa Applied");

        University university = entityManager.find(University.class, universityId);
        department.setUniversity(university);

        entityManager.persist(department);

        transaction.commit();


    }


}
