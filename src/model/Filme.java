package model;

public abstract class Filme {
    private int id;
    private String titulo;
    private String genero;
    private double preco;

    public Filme(int id, String titulo, String genero, double preco) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.preco = preco;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public double getPreco() { return preco; }

    public void setId(int id) { this.id = id; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setPreco(double preco) { this.preco = preco; }

    // Método abstrato
    public abstract void visualizar();
}
