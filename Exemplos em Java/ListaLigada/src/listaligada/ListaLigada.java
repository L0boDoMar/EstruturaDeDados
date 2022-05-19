package listaligada;

public class ListaLigada {

    Celula inicio;

    public void inserirNoInicio(String dado) {

//        Esse algoritmo é O(1), ou seja, é executado em tempo constante. 
//        Independe do tamanho da lista
        Celula p = new Celula(); // 1º Cria nova celula
        p.dado = dado; // 2ºarmazena o dado
        p.prox = inicio; // 3º a proxima celula corresponde ao inicio
        inicio = p; // 4º O inicio passa a ser a nova célula

    }

    public void inserirNaFrete(Celula p, String dado) {

        //Esse algoritmo é O(1), ou seja, é executado em tempo constante. 
        Celula q = new Celula(); // 1º Criar nova célula
        q.dado = dado; // 2º Armazenar o dado
        q.prox = p.prox; // 3º q.prox = p.prox
        p.prox = q; // 4º O proximo de p é a célula nova

    }

    public void excluirProximo(Celula p) {

        //Esse algoritmo é O(1), ou seja, é executado em tempo constante.
        if (p.prox != null) {
            p.prox = p.prox.prox;
        }

    }

    public int altura(Celula p) {

        int cont = 0;

        while (p.prox != null) {
            cont++;
            p = p.prox;
        }
        return cont;
    }

    public void inverter() {

        Celula p, q, r;

        p = inicio;
        q = p.prox;

        if (q != null) {
            r = q.prox;
            p.prox=null;
            while (q != null) {
                q.prox = p;
                p = q;
                q = r;
                if (r != null) {
                    r = r.prox;
                }
            }
            inicio = p;
        }

    }

    public int profundidade(Celula p) {

        Celula q = inicio;
        int cont = 0;
        while (q != p) {
            cont++;
            q = q.prox;
        }

        return cont;
    }

    public void imprimir() {

        System.out.print("[");
        for (Celula p = inicio; p != null; p = p.prox) {
            System.out.print(p.dado + " ");
        }
        System.out.println("]");

    }

    public Celula buscar(String dado) { //busca de um elemento -> O(n)

        for (Celula p = inicio; p != null; p = p.prox) {
            if (p.dado.equals(dado)) {
                return p;
            }
        }
        return null;
    }

    public int tamanho() {

        int cont = 0;

        for (Celula p = inicio; p != null; p = p.prox) {
            cont++;
        }
        return cont;
    }

}
