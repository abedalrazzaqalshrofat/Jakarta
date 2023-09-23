package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(UniversityId.class)
public class University {

    @Id
    private String universityName;

    @Id
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
}
