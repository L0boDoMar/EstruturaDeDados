package exemploadtnumeroscomplexos;

public class Complexo {

    private double a, b;

    public Complexo(double a, double b) {

        // this se refere a variavel do objeto
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public static Complexo somar(Complexo x, Complexo y) {

        return new Complexo(x.getA() + y.getA(), x.getB() + y.getB());
    }

    public static Complexo subtrair(Complexo x, Complexo y) {

        return new Complexo(x.getA() - y.getA(), x.getB() - y.getB());
    }

    public static Complexo multiplicar(Complexo x, Complexo y) {

        return new Complexo(x.getA() * y.getA() - x.getB() * y.getB(), x.getA() + y.getB() + y.getA() * x.getB());
    }

    public static Complexo dividir(Complexo x, Complexo y) {

        double a = x.getA() * y.getA() * x.getB() * y.getB() / (y.getA() * y.getA()) + (y.getB() * y.getB());
        double b = x.getB() * y.getA() - x.getA() * y.getB() / (y.getA() * y.getA()) + (y.getB() * y.getB());
        return new Complexo(a, b);
    }

    @Override
    public String toString() {

        String result;

        if (b > 0) {
            result = "Complexo{" + a + "+" + b + "i}";
        } else if (b < 0) {
            result = "Complexo{" + a + "-" + b + "i}";
        } else {
            result = "Complexo{" + a + "}";
        }

        return result;

    }
}
