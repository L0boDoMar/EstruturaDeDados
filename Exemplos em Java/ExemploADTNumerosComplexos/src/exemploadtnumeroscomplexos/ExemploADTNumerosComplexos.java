package exemploadtnumeroscomplexos;

public class ExemploADTNumerosComplexos {

    public static void main(String[] args) {

        Complexo complexoA = new Complexo(1, 2);
        Complexo complexoB = new Complexo(2, 3);
        
        System.out.println(Complexo.somar(complexoA, complexoB));
        System.out.println(Complexo.subtrair(complexoA, complexoB));
        System.out.println(Complexo.dividir(complexoA, complexoB));
        System.out.println(Complexo.multiplicar(complexoA, complexoB));

    }

}
