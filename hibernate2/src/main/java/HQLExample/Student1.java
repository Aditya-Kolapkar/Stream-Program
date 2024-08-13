package HQLExample;


import jakarta.persistence.*;

@Entity
    @Table(name = "student")
    public class Student1 {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        @Column(name = "student_id")
        private int studentId;

        @Column(name = "name")
        private String name;

        @Column(name = "city")
        private String city;

        @ManyToOne
        @JoinColumn(name = "collage_id")
        private Collage collage;

        // Getters and setters

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
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

        public Collage getCollage() {
            return collage;
        }

        public void setCollage(Collage collage) {
            this.collage = collage;
        }
    }

