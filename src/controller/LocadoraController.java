package controller;

import java.util.ArrayList;
import model.Filme;
import repository.LocadoraRepository;

public class LocadoraController implements LocadoraRepository {

    private ArrayList<Filme> listaFilmes = new ArrayList<>();

    public ArrayList<Filme> getListaFilmes() {
        return listaFilmes;
    }

    @Override
    public void procurarPorId(int id) {
        Filme filme = buscarNaCollection(id);
        if (filme != null) {
            filme.visualizar();
        } else {
            System.out.println("⚠️ Filme não encontrado!");
        }
    }

    @Override
    public void listarTodos() {
        if (listaFilmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
        } else {
            for (Filme filme : listaFilmes) {
                filme.visualizar();
            }
        }
    }

    @Override
    public void cadastrar(Filme filme) {
        listaFilmes.add(filme);
        System.out.println("✅ Filme cadastrado com sucesso!");
    }

    @Override
    public void atualizar(Filme filme) {
        Filme busca = buscarNaCollection(filme.getId());
        if (busca != null) {
            int index = listaFilmes.indexOf(busca);
            listaFilmes.set(index, filme);
            System.out.println("🔄 Filme atualizado com sucesso!");
        } else {
            System.out.println("⚠️ Filme não encontrado!");
        }
    }

    @Override
    public void deletar(int id) {
        Filme filme = buscarNaCollection(id);
        if (filme != null) {
            listaFilmes.remove(filme);
            System.out.println("🗑️ Filme removido com sucesso!");
        } else {
            System.out.println("⚠️ Filme não encontrado!");
        }
    }

    private Filme buscarNaCollection(int id) {
        for (Filme filme : listaFilmes) {
            if (filme.getId() == id) {
                return filme;
            }
        }
        return null;
    }
}
