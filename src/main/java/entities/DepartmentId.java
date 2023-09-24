package entities;

import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;


public class DepartmentId implements Serializable {


    private String departmentName;

    private String departmentField;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepartmentId)) return false;
        DepartmentId that = (DepartmentId) o;
        return Objects.equals(departmentName, that.departmentName) && Objects.equals(departmentField, that.departmentField);
    }



    @Override
    public int hashCode() {
        return Objects.hash(departmentName, departmentField);
    }
}
