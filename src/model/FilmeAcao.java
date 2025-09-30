package model;

public class FilmeAcao extends Filme {
    private String classificacao;

    public FilmeAcao(int id, String titulo, String genero, double preco, String classificacao) {
        super(id, titulo, genero, preco);
        this.classificacao = classificacao;
    }

    public String getClassificacao() { return classificacao; }
    public void setClassificacao(String classificacao) { this.classificacao = classificacao; }

    @Override
    public void visualizar() {
        System.out.println("ID: " + getId()
                + " | Título: " + getTitulo()
                + " | Gênero: " + getGenero()
                + " | Preço: R$ " + getPreco()
                + " | Classificação: " + classificacao);
    }
}
