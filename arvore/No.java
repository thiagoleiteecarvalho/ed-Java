public class No {

    private int dado;
    private No filhoEsquerdo;
    private No filhoDireito;

    public No(int valor) {

        dado = valor;
        filhoEsquerdo = null;
        filhoDireito = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(No filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public No getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(No filhoDireito) {
        this.filhoDireito = filhoDireito;
    }

    public boolean insert(int valor) {

        if (valor == dado) {
            return false;
        } else if (valor < dado) {
            if (filhoEsquerdo == null) {
                filhoEsquerdo = new No(valor);
                return true;
            } else {
                return filhoEsquerdo.insert(valor);
            }
        } else if (valor > dado) {
            if (filhoDireito == null) {
                filhoDireito = new No(valor);
                return true;
            } else {
                return filhoDireito.insert(valor);
            }
        }

        return false;
    }

    public No delete(int valor, No pai) {

        if (valor == dado) {
            if (filhoEsquerdo == null && filhoDireito == null) {
                if (this == pai.filhoEsquerdo) {
                    pai.filhoEsquerdo = null;
                } else {
                    pai.filhoDireito = null;
                    return this;
                }
            } else if (filhoEsquerdo != null && filhoDireito == null) {
                if (this == pai.filhoEsquerdo) {
                    pai.filhoEsquerdo = filhoEsquerdo;
                } else {
                    pai.filhoDireito = filhoEsquerdo;
                    return this;
                }
            } else if (filhoEsquerdo == null && filhoDireito != null) {
                if (this == pai.filhoEsquerdo) {
                    pai.filhoEsquerdo = filhoDireito;
                } else {
                    pai.filhoDireito = filhoDireito;
                    return this;
                }
            } else if (filhoEsquerdo != null && filhoDireito != null) {
                dado = filhoDireito.menorValor();
                return filhoDireito.delete(dado, this);
            }
        } else if (valor < dado) {
            if (filhoEsquerdo != null) {
                return filhoEsquerdo.delete(valor, this);
            } else {
                return null;
            }
        } else if (valor > dado) {
            if (filhoDireito != null) {
                return filhoDireito.delete(valor, this);
            } else {
                return null;
            }
        }
        return null;
    }

    public int menorValor() {

        if (filhoEsquerdo == null)
            return dado;
        else
            return filhoEsquerdo.menorValor();
    }

    public boolean search(int valor) {

        if (valor == dado) {
            return true;
        } else if (valor < dado) {
            if (filhoEsquerdo == null) {
                return false;
            } else {
                return filhoEsquerdo.search(valor);
            }
        } else if (valor > dado) {
            if (filhoDireito == null) {
                return false;
            } else {
                return filhoDireito.search(valor);
            }
        }
        return false;
    }

    public void exibirPreOrdem() {

        System.out.print(dado + " ");

        if (filhoEsquerdo != null) {
            filhoEsquerdo.exibirPreOrdem();
        }

        if (filhoDireito != null) {
            filhoDireito.exibirPreOrdem();
        }
    }

    public void exibirEmOrdem() {

        if (filhoEsquerdo != null) {
            filhoEsquerdo.exibirEmOrdem();
        }

        System.out.print(dado + " ");

        if (filhoDireito != null) {
            filhoDireito.exibirEmOrdem();
        }
    }

    public void exibirPosOrdem() {

        if (filhoEsquerdo != null) {
            filhoEsquerdo.exibirPosOrdem();
        }

        if (filhoDireito != null) {
            filhoDireito.exibirPosOrdem();
        }

        System.out.print(dado + " ");
    }

}