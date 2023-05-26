package fateczl.faculdade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fateczl.faculdade.model.Aluno;
import fateczl.faculdade.service.AlunoService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping
    public ResponseEntity<Aluno> createStudent(@RequestBody Aluno aluno) {
        Aluno createdAluno = alunoService.saveAluno(aluno);
        return new ResponseEntity<>(createdAluno, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Aluno>> getAllAlunos() {
        List<Aluno> alunos = alunoService.getAllAlunos();
        return new ResponseEntity<>(alunos, HttpStatus.OK);
    }

    // Outros metodos se precisar
}