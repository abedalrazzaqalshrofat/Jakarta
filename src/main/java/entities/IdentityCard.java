package entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

/*
All such classes in the entity hierarchy whose access type is defaulted in this way must be consistent in
their placement of annotations on either fields or properties, such that a single, consistent default
access type applies within the hierarchy. Any embeddable classes used by such classes will have the
same access type as the default access type of the hierarchy unless the Access annotation is specified as
defined below

An embeddable class (including an embeddable class within another embeddable class) that is
contained within an element collection must not contain an element collection, nor may it contain a
relationship to an entity other than a many-to-one or one-to-one relationship. The embeddable class
must be on the owning side of such a relationship and the relationship must be mapped by a foreign
key mapping.

 */

@Embeddable
@Access(AccessType.FIELD)
public class IdentityCard {

    public IdentityCard(String nationality, String nationalId, LocalDate dateOfBirth) {
        this.nationality = nationality;
        this.nationalId = nationalId;
        this.dateOfBirth = dateOfBirth;
    }

    @Column(name = "nationality", nullable = false)
    private String nationality;

    @Column(name = "national_id", nullable = false, unique = true)
    private String nationalId;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Ministry ministry;


    public IdentityCard() {

    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Ministry getMinistry() {
        return ministry;
    }

    public void setMinistry(Ministry ministry) {
        this.ministry = ministry;
    }

    @Override
    public String toString() {
        return "IdentityCard{" +
                "nationality='" + nationality + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
