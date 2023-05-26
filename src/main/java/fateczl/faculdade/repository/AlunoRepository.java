package fateczl.faculdade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fateczl.faculdade.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}