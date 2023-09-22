package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student")
public class Student extends BaseEntity {

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @ElementCollection
    @CollectionTable(name = "student_identity",joinColumns = @JoinColumn(name = "student_id"))
    private List<IdentityCard> identityCard;



    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<IdentityCard> getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(List<IdentityCard> identityCard) {
        this.identityCard = identityCard;
    }
}
