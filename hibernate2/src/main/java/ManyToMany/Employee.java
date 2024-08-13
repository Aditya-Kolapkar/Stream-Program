package ManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;
@Entity
public class Employee {

    @Id

    private int EmpId;

    private String name;
@ManyToMany
    private List<Project> project;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProject() {
        return project;
    }

    public void setProject(List<Project> project) {
        this.project = project;
    }

    public Employee(int empId, String name, List<Project> project) {
        EmpId = empId;
        this.name = name;
        this.project = project;
    }

    public Employee() {
    }
}
