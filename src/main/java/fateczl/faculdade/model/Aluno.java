package fateczl.faculdade.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String ra;
    @Column
    private double grade1;
    @Column
    private double grade2;
    @Column
    private double finalGrade;
    @Column
    private String status;
    @Column
    private int numberOfAbsences;
   
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public double getGrade1() {
        return grade1;
    }
    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }
    public double getGrade2() {
        return grade2;
    }
    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }
    public double getFinalGrade() {
        return finalGrade;
    }
    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getNumberOfAbsences() {
        return numberOfAbsences;
    }
    public void setNumberOfAbsences(int numberOfAbsences) {
        this.numberOfAbsences = numberOfAbsences;
    }


    // getters e setters

}