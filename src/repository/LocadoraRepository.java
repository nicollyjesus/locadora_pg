package repository;

import model.Filme;

public interface LocadoraRepository {
    void procurarPorId(int id);
    void listarTodos();
    void cadastrar(Filme filme);
    void atualizar(Filme filme);
    void deletar(int id);
}