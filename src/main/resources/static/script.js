const studentForm = document.getElementById("alunosForm");
const studentsTable = document.getElementById("alunosTable");

studentForm.addEventListener("submit", (e) => {
    e.preventDefault();

    const name = document.getElementById("name").value;
    const ra = document.getElementById("ra").value;
    const grade1 = parseFloat(document.getElementById("grade1").value);
    const grade2 = parseFloat(document.getElementById("grade2").value);

    const aluno = {
        name: name,
        ra: ra,
        grade1: grade1,
        grade2: grade2
    };

    fetch("localhost:8080/alunos", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(aluno)
    })
    .then((response) => response.json())
    .then((createdAluno) => {
        displayStudent(createdAluno);
        alunoForm.reset();
    })
    .catch((error) => console.log(error));
});

function displayAluno(aluno) {
    const row = alunosTable.insertRow();

    const nameCell = row.insertCell();
    nameCell.textContent = aluno.name;

    const raCell = row.insertCell();
    raCell.textContent = aluno.ra;

    const grade1Cell = row.insertCell();
    grade1Cell.textContent = aluno.grade1;

    const grade2Cell = row.insertCell();
    grade2Cell.textContent = aluno.grade2;

    const finalGradeCell = row.insertCell();
    finalGradeCell.textContent = aluno.finalGrade;

    const statusCell = row.insertCell();
    statusCell.textContent = aluno.status;
}