package entities;

import jakarta.persistence.*;

@Entity
@IdClass(UniversityId.class)
@Access(AccessType.FIELD)
public class University {

    @Id
    @Column(name = "university_name")
    private String universityName;

    @Id
    @Column(name = "university_branch")
    private String universityBranch;

    private String info;

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityBranch() {
        return universityBranch;
    }

    public void setUniversityBranch(String universityBranch) {
        this.universityBranch = universityBranch;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", universityBranch='" + universityBranch + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
