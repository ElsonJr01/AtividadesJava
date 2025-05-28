package ListadeComprasPOO;

import java.util.Scanner;

public class InterfaceUsuario {
        private Scanner scanner;
        private ListaDeCompras lista;

        public InterfaceUsuario(Scanner scanner, ListaDeCompras lista) {
            this. lista = lista;
            this.scanner = scanner;
        }
        public void executar() {
            int opcao;
            do {
                exibirMenu();
                opcao = lerInteiro("Escolha uma opcao: ");
                scanner.nextLine();
                switch (opcao) {
                    case 1 -> adicionar();
                        case 2 -> remover();
                            case 3 -> lista.exibirItens();
                                case 4 -> verificar();
                                    case 5 -> lista.limparLista();
                                        case 0 -> System.out.println("Encerrando a aplicação");
                                            default -> {
                                                System.out.println("Opcao invalida!");
                                            }
                }
            }while(opcao == 0);
        }

    private int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Tente novamente.");
            scanner.next(); // Consome a entrada inválida
            System.out.print(mensagem);
        }
        return scanner.nextInt();
    }

    private void adicionar() {
            System.out.println("Digite o item para adicionar: ");
            lista.adicionarItem(scanner.nextLine());
        }
        private void exibirMenu() {
            System.out.println("Digite a opcao desejada: ");
            System.out.println("1 - Adicionar Item");
            System.out.println("2 - Remover Item");
            System.out.println("3 - Listar Items");
            System.out.println("4 - Verificar");
            System.out.println("5 - Limpar Lista");
            System.out.println("0 - Sair");
        }
        private void remover() {
            System.out.println("Digite a opcao desejada: ");
            lista.removerItem(scanner.nextLine());
        }
        private void verificar() {
            System.out.println("Digite a opcao desejada para verificar: ");
            String item = scanner.nextLine();

            if(lista.contemItem(item)){
                System.out.println(item + " esta na lista");
            }
            else{
                System.out.println("item não esta na lista");
            }
        }

}