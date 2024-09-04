public class Cliente {

	private String nome;
    private String data;
    private String sexo;

    
	public Cliente(String nome, String data, String sexo) {
        this.nome = nome;
        this.data = data;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Informação do cliente [nome=" + nome + ", data=" + data + ", sexo=" + sexo + "]";
    }

    public String getNome() {
		return nome;
	}
    public String getData() {
        return data;
    }
    public String getSexo() {
        return sexo;
    }

}