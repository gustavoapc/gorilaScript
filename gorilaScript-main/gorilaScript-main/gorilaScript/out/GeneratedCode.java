public class GeneratedCode {
    public static void main(String[] args) {
        main();
}

    public static int calcularFatorial(int n ) {
        int resultado = 1;
        while (n > 1 ) {
            resultado = resultado * n;
            n = n - 1;
        } 
        return resultado;
    }
    public static void main() {
        int numero = 10;
        int fatorial = calcularFatorial(numero);
        System.out.println(fatorial);
    }
}

