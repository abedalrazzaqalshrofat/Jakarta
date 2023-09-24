package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ministries")
public class Ministry extends BaseEntity {

    @Column(name = "ministry_branch")
    private String ministryBranch;

    @Enumerated(EnumType.STRING)
    @Column(name = "ministry_type")
    private MinistryType ministryType;



    public String getMinistryBranch() {
        return ministryBranch;
    }

    public void setMinistryBranch(String ministryBranch) {
        this.ministryBranch = ministryBranch;
    }

    public MinistryType getMinistryType() {
        return ministryType;
    }

    public void setMinistryType(MinistryType ministryType) {
        this.ministryType = ministryType;
    }
}
