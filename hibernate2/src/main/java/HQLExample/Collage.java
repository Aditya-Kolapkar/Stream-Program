package HQLExample;


import jakarta.persistence.*;
import org.example.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Entity
    @Table(name = "collage")
    public class Collage {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "collage_id")
        private int collageId;

        @Column(name = "name")
        private String name;

        @Column(name = "city")
        private String city;

        @OneToMany(mappedBy = "collage", cascade = CascadeType.ALL , fetch = FetchType.LAZY)
        private List<Student1> students = new ArrayList<>();

        // Getters and setters

        public int getCollageId() {
            return collageId;
        }

        public void setCollageId(int collageId) {
            this.collageId = collageId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public List<Student1> getStudents() {
            return students;
        }

        public void setStudents(List<Student1> students) {
            this.students = students;
        }
    }

