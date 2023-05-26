package fateczl.faculdade.udf;
import fateczl.faculdade.model.Aluno;
import fateczl.faculdade.service.AlunoService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlunoUDF {
    @PersistenceContext
    private EntityManager entityManager;

    private final AlunoService alunoService;

    @Autowired
    public AlunoUDF(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public List<Aluno> getAlunoGrades() {
      List<Aluno> alunos = alunoService.getAllAlunos();
        List<Aluno> gradesList = new ArrayList<>();

        for (Aluno aluno : alunos) {
          double finalGrade = (aluno.getGrade1() + aluno.getGrade2()) / 2;
            String status = finalGrade >= 6 ? "Aprovado" : "Reprovado";

            Aluno grade = new Aluno();
            grade.setName(aluno.getName());
            grade.setRa(aluno.getRa());
            grade.setGrade1(aluno.getGrade1());
            grade.setGrade2(aluno.getGrade2());
            grade.setFinalGrade(finalGrade);
            grade.setStatus(status);

       gradesList.add(grade);
      }

       return gradesList;
    }
}