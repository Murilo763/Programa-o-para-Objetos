package PROJETO;

public class Evento {
	
	private String nome;
    private int duracao;
    private String tema;
    private String data;
    private String horario;
    private Palestrante palestrante;

   
               
            
    public Evento(String nome, int duracao, String tema, String data, String horario, Palestrante palestrante) {
		super();
		this.nome = nome;
		this.duracao = duracao;
		this.tema = tema;
		this.data = data;
		this.horario = horario;
		this.palestrante = palestrante;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }


	public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
   

}
