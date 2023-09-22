package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student extends BaseEntity {

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Embedded
    private IdentityCard identityCard;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public IdentityCard getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(IdentityCard identityCard) {
        this.identityCard = identityCard;
    }
}
