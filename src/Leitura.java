import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Olá, qual é o seu nome?");
        String userName = leitura.nextLine();
        System.out.println(userName+", digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual é o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual nota você daria para esse filme? considere de 0 a 10");
        int notaFilme = leitura.nextInt();
        System.out.println(userName+", seu filme favorito é: "+filme+", ele foi lançado em: "+anoDeLancamento+" e a sua nota para ele é: "+notaFilme);
    }
}
