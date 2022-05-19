package listaligada;

public class ListaLigadaMain {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.inserirNoInicio("KISS");
        lista.inserirNoInicio("IRON MAIDEN");
        lista.inserirNoInicio("PINK FLOYD");
        lista.inserirNoInicio("AC/DC");
        lista.inserirNoInicio("MOTORHEAD");
        lista.imprimir();
        System.out.println("Tamanho da lista = " + lista.tamanho());
        Celula p = lista.buscar("AC/DC");
        System.out.println(lista.altura(p));
        p = lista.buscar("PINK FLOYD");
        System.out.println(lista.profundidade(p));
        lista.inserirNaFrete(p, "RAMMSTEIN");
        lista.imprimir();
        lista.excluirProximo(p);
        lista.imprimir();
        lista.inverter();
        lista.imprimir();
    }
}
