package PROJETO;

public class Pessoa {
	
	 private String nomepessoa;
	    private int idade;
	    private String sexo;

	    public String getNomepessoa() {
	        return nomepessoa;
	    }

	    public void setNomepessoa(String nomepessoa) {
	        this.nomepessoa = nomepessoa;
	    }

	 

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public String getSexo() {
	        return sexo;
	    }

	    public void setSexo(String sexo) {
	        this.sexo = sexo;
	    }

	    public Pessoa(String nomepessoa, int idade, String sexo) {
	        this.nomepessoa = nomepessoa;
	        this.idade = idade;
	        this.sexo = sexo;
	    }

}
