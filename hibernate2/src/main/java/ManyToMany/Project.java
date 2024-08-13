package ManyToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity

public class Project {

    @Id
    private int ProId;
    private String ProName;

    @ManyToMany(mappedBy = "project")
    private List<Employee> Emp;

    public int getProId() {
        return ProId;
    }

    public void setProId(int proId) {
        ProId = proId;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String proName) {
        ProName = proName;
    }

    public List<Employee> getEmp() {
        return Emp;
    }

    public void setEmp(List<Employee> emp) {
        Emp = emp;
    }

    public Project(int proId, String proName, List<Employee> emp) {
        ProId = proId;
        ProName = proName;
        Emp = emp;
    }

    public Project() {
    }
}
