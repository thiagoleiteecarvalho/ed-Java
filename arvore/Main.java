public class Main {

    public static void main(String[] args) {

        ArvoreBinaria arvore = new ArvoreBinaria();
        LeitoraDados leitoraDados = new LeitoraDados();

        System.out.print("Exemplo de Árvore Binária Ordenada");

        String opcao = "";

        while (!opcao.equals("22")) {

            System.out.println("\n");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Criar raiz");
            System.out.println("2 - INSERT");
            System.out.println("3 - DELETE");
            System.out.println("4 - SEARCH");
            System.out.println("5 - Exibir Pré-ordem");
            System.out.println("6 - Exibir Em-ordem");
            System.out.println("7 - Exibir Pós-ordem");
            System.out.println("8 - Sair");

            opcao = leitoraDados.lerTexto();

            switch (opcao) {
            case "1":

                System.out.println("Digite o valor(numérico e inteiro) da raiz:");
                String raiz = leitoraDados.lerTexto();
                arvore.criarRaiz(Integer.parseInt(raiz));
                break;
            case "2":
                System.out.println("Digite o valor(numérico e inteiro) a ser inserido:");
                String novoValor = leitoraDados.lerTexto();
                arvore.adicionar(Integer.parseInt(novoValor));
                break;
            case "3":
                System.out.println("Digite o valor(numérico e inteiro) a ser pesquisado:");
                String valorPesquisado = leitoraDados.lerTexto();
                boolean resultadoPesqusa = arvore.search(Integer.parseInt(valorPesquisado));
                if (resultadoPesqusa) {
                    System.out.println("O valor pertence a árvore.");
                } else {
                    System.out.println("O valor não pertence a árvore.");
                }
                break;
            case "4":
                System.out.println("Digite o valor(numérico e inteiro) a ser excluido:");
                String valorPesquisa = leitoraDados.lerTexto();
                No resultadoDelete = arvore.remover(Integer.parseInt(valorPesquisa));
                if (resultadoDelete == null) {
                    System.out.println("O valor não pertence a árvore.");
                } else {
                    System.out.println("O valor excluido da árvore.");
                }
                break;
            case "5":
                System.out.println("Exibindo Pré-ordem");
                arvore.exibir("Pre");
                break;
            case "6":
                System.out.println("Exibindo Em-ordem");
                arvore.exibir("Em");
                break;
            case "7":
                System.out.println("Exibindo Pós-ordem");
                arvore.exibir("Pos");
                break;
            case "8":
                System.out.println("Volte sempre e bons estudos!");
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("Opção desconhecida");
            }

        }
    }
}
