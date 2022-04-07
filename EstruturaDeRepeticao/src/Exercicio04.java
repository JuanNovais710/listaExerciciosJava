public class Exercicio04 {
    public static void main(String[] args) {
        double populacaoPaisA = 80000;
        double populacaoPaisB = 200000;
        float taxaCrescimentoPaisA = 0.03f;
        float taxaCrescimentoPaisB = 0.015f;
        int tempoNecessario = 0;

        while (populacaoPaisA <= populacaoPaisB) {
            tempoNecessario ++;
            populacaoPaisA = populacaoPaisA + (populacaoPaisA * taxaCrescimentoPaisA);
            populacaoPaisB = populacaoPaisB + (populacaoPaisB * taxaCrescimentoPaisB);
        }
        System.out.printf("Após %d anos, a população do país A chegará a: %.2f e a população do país B: %.2f", tempoNecessario, populacaoPaisA, populacaoPaisB);

    }
}
