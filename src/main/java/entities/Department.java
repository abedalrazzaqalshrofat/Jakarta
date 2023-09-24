package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
@IdClass(DepartmentId.class)
public class Department {

    @Id
    @Column(name = "department_name")
    private String departmentName;

    @Id
    @Column(name = "department_field")
    private String departmentField;

    @ManyToOne
    @JoinColumn(name = "university_name", referencedColumnName = "university_name")
    @JoinColumn(name = "university_branch", referencedColumnName = "university_branch")
    private University university;


    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentField() {
        return departmentField;
    }

    public void setDepartmentField(String departmentField) {
        this.departmentField = departmentField;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }
}
