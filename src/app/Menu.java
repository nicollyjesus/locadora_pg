package app;

import java.util.Scanner;
import controller.LocadoraController;
import model.FilmeAcao;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocadoraController controller = new LocadoraController();
        int opcao;

        do {
            System.out.println("\n=== LOCADORA - MENU ===");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Atualizar filme");
            System.out.println("4 - Remover filme");
            System.out.println("5 - Sobre");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Filme ---");
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // limpar buffer
                    System.out.print("Classificação: ");
                    String classificacao = scanner.nextLine();

                    int id = controller.getListaFilmes().size() + 1;
                    FilmeAcao filme = new FilmeAcao(id, titulo, genero, preco, classificacao);
                    controller.cadastrar(filme);
                    break;

                case 2:
                    System.out.println("\n--- Lista de Filmes ---");
                    controller.listarTodos();
                    break;

                case 3:
                    System.out.println("\n--- Atualizar Filme ---");
                    System.out.print("ID do filme: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); // limpar buffer
                    System.out.print("Novo título: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Novo gênero: ");
                    String novoGenero = scanner.nextLine();
                    System.out.print("Novo preço: ");
                    double novoPreco = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Nova classificação: ");
                    String novaClassificacao = scanner.nextLine();

                    FilmeAcao filmeAtualizado = new FilmeAcao(idAtualizar, novoTitulo, novoGenero, novoPreco, novaClassificacao);
                    controller.atualizar(filmeAtualizado);
                    break;

                case 4:
                    System.out.print("\nID do filme para remover: ");
                    int idRemover = scanner.nextInt();
                    scanner.nextLine();
                    controller.deletar(idRemover);
                    break;

                case 5:
                    System.out.println("\nSistema Locadora_PG - Projeto Bloco 01");
                    System.out.println("Desenvolvido em Java com POO, Controller e CRUD");
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
