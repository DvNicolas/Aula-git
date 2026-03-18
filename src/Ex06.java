void main() {
    IO.println(" Projeto estudos  ");

    IO.println(" Seu objetivo é: estudar 40 horas");

    IO.println("\n");

    Scanner sc = new Scanner(System.in);

    IO.println(" Quantas horas você estudou hoje?");


    int estudos = sc.nextInt();

    if (estudos <= 40) {

        IO.println("Parabéns você conseguiu ");
        IO.println(40 - estudos);
    } else if (estudos <= 50) {

        IO.println("Parabéns você ultrapassou a meta");

        IO.println( estudos- 40);

    }
}