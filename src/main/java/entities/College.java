package entities;

import jakarta.persistence.*;

//@Entity
public class College extends BaseEntity {

    @Column(name = "college_name")
    private String collegeName;

    @Column(name = "college_major")
    private String collegeMajor;


    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private University university;

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeMajor() {
        return collegeMajor;
    }

    public void setCollegeMajor(String collegeMajor) {
        this.collegeMajor = collegeMajor;
    }
}
