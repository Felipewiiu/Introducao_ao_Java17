// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gum: Maverick");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String nomeDofilme = "Top gum";

        System.out.println(anoDeLancamento);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        double media = (9.8 + 6.3 + 8.0) / 3;

        System.out.println(media);

        String sinopse;

        sinopse = """
                Filme de aventura com galan dos anos 80
                Muito bom!
                Ano de lançamento
                """;

        System.out.println(sinopse);

        int classificacao;

        classificacao = (int) (media / 2);

        System.out.println("Classificação "  + classificacao);


    }
}