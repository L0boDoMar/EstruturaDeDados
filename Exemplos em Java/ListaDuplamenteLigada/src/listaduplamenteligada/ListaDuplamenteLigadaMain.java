package listaduplamenteligada;

public class ListaDuplamenteLigadaMain {

    public static void main(String[] args) {

        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        lista.inserirNoInicio("BACON");
        lista.inserirNoInicio("PIZZA");
        lista.inserirNoInicio("LASANHA");
        lista.inserirNoInicio("PÃO");
        lista.inserirNoInicio("BIFE");
        lista.inserirNoInicio("CENOURA");
        lista.imprimir();
        ListaDuplamenteLigada lista2 = new ListaDuplamenteLigada();
        lista2.inserirEmOrdem("A");
        lista2.inserirEmOrdem("F");
        lista2.inserirEmOrdem("Q");
        lista2.inserirEmOrdem("C");
        lista2.imprimir();
        Celula p = lista2.buscar("Q");
        lista2.excluir(p);
        lista2.imprimir();
    }

}
