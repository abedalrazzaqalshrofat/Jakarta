package entities;

import java.io.Serializable;
import java.util.Objects;

public class UniversityId implements Serializable {

    private String universityName;
    private String universityBranch;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniversityId)) return false;
        UniversityId that = (UniversityId) o;
        return Objects.equals(universityName, that.universityName) &&
                Objects.equals(universityBranch, that.universityBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(universityName, universityBranch);
    }
}
