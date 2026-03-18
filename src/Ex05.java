void main() {
    IO.println(" Projeto economico  ");

    IO.println(" Seu objetivo é: 500 reais mensal");

    IO.println("\n");

    Scanner sc = new Scanner(System.in);

    IO.println(" Quantos você guardou hoje?");


    int guardou = sc.nextInt();

    if (guardou <= 500) {

        IO.println("Parabéns você conseguiu ");
        IO.println(500 - guardou);
    } else if (guardou <= 5000) {

        IO.println("Parabéns você ultrapassou a meta");

        IO.println(guardou - 500);

    }
}