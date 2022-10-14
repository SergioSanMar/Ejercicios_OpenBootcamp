public class Main {
    public static void main(String[] args) {

        int resultado = suma(3,5,7);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.aumentaPuertas();
        System.out.println(miCoche.numPuertas);
    }

    public static int suma (int num1, int num2, int num3){
        return num1+num2+num3;
    }

    static class Coche{
        public int numPuertas = 0;

        public void aumentaPuertas() {
            this.numPuertas++;
        }
    }
}