package out;

public class GeneratedCode {
    public static void main(String[] args) {
        main();
}

    public static float calcularInvestimento(float valorInicial , float taxaJuros , int anos , float aporteMensal ) {
        float valorFinal = valorInicial;
        int i = 0;
        float taxaAux = taxaJuros / 100;
        float taxaMensal = taxaAux / 12;
        float multiplicador = 1;
        int meses = anos * 12;
        while (i < meses ) {
            multiplicador = 1 + taxaMensal;
            valorFinal = valorFinal * multiplicador + aporteMensal;
            i = i + 1;
        } 
        return valorFinal;
    }
    public static void main() {
        float valorInicial = 1000;
        float taxaJuros = 5;
        int anos = 10;
        float aporteMensal = 100;
        float valorFinal = calcularInvestimento(valorInicial, taxaJuros, anos, aporteMensal);
        System.out.println(valorFinal);
    }
}

