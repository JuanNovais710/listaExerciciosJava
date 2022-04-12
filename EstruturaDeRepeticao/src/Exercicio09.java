public class Exercicio09 {
    public static void main(String[] args) {

        for(int i=1; i<=50; i++) {
        boolean numerosImpares = i % 2 != 0;
        if(numerosImpares) {
            System.out.println(i);
        }
        }
    }
}
