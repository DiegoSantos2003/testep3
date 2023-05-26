package fateczl.faculdade.service;



import fateczl.faculdade.model.Aluno;
import fateczl.faculdade.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Aluno saveAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    // Outros métodos conforme necessário
}