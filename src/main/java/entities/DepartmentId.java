package entities;

import java.io.Serializable;


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
}
