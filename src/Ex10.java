void main() {
    IO.println(" Projeto da leitura  ");


    IO.println("\n");

    Scanner sc = new Scanner(System.in);

    IO.println(" Quantas páginas você leu?");


    int leitura = sc.nextInt();

    if (leitura <= 300) {

        IO.println(" Você  conseguiu ");
        IO.println(300 - leitura);
    } else if (leitura >= 300) {

        IO.println("Parabéns você passou" +
                " a meta");
        IO.println("Você leu a mais :");
        IO.println( leitura - 300);

    }
}
