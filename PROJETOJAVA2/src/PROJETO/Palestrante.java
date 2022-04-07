package PROJETO;

public class Palestrante extends Pessoa{
	
	private String formacao;
	   private String atuacao;

	    public Palestrante(String formacao, String atuacao, String nomepessoa, int idade, String sexo) {
	        super(nomepessoa, idade, sexo);
	        this.formacao = formacao;
	        this.atuacao = atuacao;
	    } 
	    public String getFormacao() {
	        return formacao;
	    }

	    public void setFormacao(String formacao) {
	        this.formacao = formacao;
	    }

	    public String getAtuacao() {
	        return atuacao;
	    }

	    public void setAtuacao(String atuacao) {
	        this.atuacao = atuacao;
	    }
	

}
