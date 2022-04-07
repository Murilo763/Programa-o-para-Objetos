package PROJETO;

public class Aluno extends Pessoa{
	
	private String matricula;
    private String turma;
    private int semestre;
    


	public Aluno(String nomepessoa, int idade, String sexo, String matricula, String turma, int semestre) {
		super(nomepessoa, idade, sexo);
		this.matricula = matricula;
		this.turma = turma;
		this.semestre = semestre;
	}


	public String getMatricula() {
        return matricula;
    }


	public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }


	


	

    
    

}
