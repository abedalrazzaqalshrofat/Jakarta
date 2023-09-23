package entities;

import jakarta.persistence.*;
import java.util.List;

/*
    When use Access Type property will access the getter and setter
    When use Access Type filed will access the filed directly
    Any way If you specified access type at the entity it will apply for all property/fields
    and when you want to specify the access type for a specific property/field you can add @Access(AccessType) at it

 */


@Entity
@Table(name = "student")
@Access(AccessType.PROPERTY)
public class Student extends BaseEntity {

    private String studentName;
    private List<IdentityCard> identityCard;


    private List<Course> courses;

    @Column(name = "student_name", nullable = false, columnDefinition = "VARCHAR(255) DEFAULT 'unknown' ")
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "student_identity",joinColumns = @JoinColumn(name = "student_id"))
    @Access(AccessType.PROPERTY)
    public List<IdentityCard> getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(List<IdentityCard> identityCard) {
        this.identityCard = identityCard;
    }

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "student_courses",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")}
    )
    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", identityCard=" + identityCard +
                ", super " +super.toString()+
                "courses " + courses+'}';
    }
}
