void main() {
    IO.println(" Bem vindo ao Sistema de Fretes ");

    IO.println("\n");

    IO.println(" Requisitos minimos: Sua compra tem que passar de 100 reais");

    IO.println("\n");

    Scanner sc = new Scanner(System.in);

    IO.println(" Qual foi o valor da sua compra??");

    int frete = sc.nextInt();

    if (frete >=100) {

        IO.println(" Você ganhou frete gratis ");

    } else if (frete <100) {

        IO.println("você não ganhou o frete gratis");


    }
}