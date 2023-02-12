import java.util.Objects;

public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void criarRaiz(int valor) {

        if (Objects.isNull(raiz)) {

            raiz = new No(valor);
            System.out.println("Raiz criada com sucesso.");
        } else {
            System.out.println("Raiz já existente.");
        }
    }
    
    public boolean adicionar(int valor) {

        if (Objects.isNull(raiz)) {

            raiz = new No(valor);
            return true;
        } else {
            return raiz.insert(valor);
        }
    }

    public boolean remover(int valor) {

        if (Objects.isNull(raiz)) {
            return false;
        } else {

            No removido = raiz;

            if (valor != raiz.getDado()) {
                removido = raiz.delete(valor, null);
            } else {

                if (Objects.isNull(raiz.getFilhoEsquerdo()) && Objects.isNull(raiz.getFilhoDireito())) {
                    raiz = null;
                } else if (!Objects.isNull(raiz.getFilhoEsquerdo()) && Objects.isNull(raiz.getFilhoDireito())) {
                    raiz = raiz.getFilhoEsquerdo();
                } else if (Objects.isNull(raiz.getFilhoEsquerdo()) && !Objects.isNull(raiz.getFilhoDireito())) {
                    raiz = raiz.getFilhoDireito();
                } else if (!Objects.isNull(raiz.getFilhoEsquerdo()) && !Objects.isNull(raiz.getFilhoDireito())) {

                    raiz.setDado(raiz.getFilhoDireito().menorValor());
                    removido = raiz.getFilhoDireito().delete(raiz.getDado(), raiz);
                }
            }

            if (removido != null) {

                removido.setFilhoEsquerdo(null);
                removido.setFilhoDireito(null);
                return true;
            } else
                return false;
        }
    }

    public boolean pesquisar(int valor) {

        if (Objects.isNull(raiz)) {
            return false;
        } else {
            return raiz.search(valor);
        }
    }

    public void exibir(String opcao) {

        switch (opcao.toLowerCase()) {
        case "pre":
            raiz.exibirPreOrdem();
            break;

        case "em":
            raiz.exibirEmOrdem();
            break;

        case "pos":
            raiz.exibirPosOrdem();
            break;
        default:
            throw new IllegalArgumentException("Opção de navegação desconhecida");
        }
    }
}