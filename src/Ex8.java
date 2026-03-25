void main() {
    IO.println(" Bem vindo ao Cena2K ");

    IO.println(" Requisitos minimos: 18 anos");

    IO.println("\n");

    Scanner sc = new Scanner(System.in);

    IO.println(" Qual sua idade??");


    int idade = sc.nextInt();

    if (idade >=18) {

        IO.println(" Bem vindo ao Cena2K ");

    } else if (idade <18) {

        IO.println("Idade Insuficiente");


    }
}