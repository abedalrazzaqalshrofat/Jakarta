package entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
@Access(AccessType.PROPERTY)
public class Student extends BaseEntity {


    private String studentName;
    private List<IdentityCard> identityCard;



    @Column(name = "student_name", nullable = false)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "student_identity",joinColumns = @JoinColumn(name = "student_id"))
    public List<IdentityCard> getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(List<IdentityCard> identityCard) {
        this.identityCard = identityCard;
    }



}
