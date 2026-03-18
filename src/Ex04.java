void main() {
    IO.println(" Vamos continuar sua meta de passos");

    IO.println("\n");

    Scanner sc = new Scanner(System.in);

    IO.println(" Quantos passos você fez hoje?");


    int passos = sc.nextInt();

    if (passos <= 500) {

        IO.println("Você esta andando pouco, ande mais ");
        IO.println(10000 - passos);
    } else if (passos <= 5000) {

        IO.println("Falta só mais um pouco ande mais");

        IO.println(10000 - passos);
    } else if (passos <= 8000) {

        IO.println("Ande mais um pouco");
        IO.println(10000 - passos);
    }else if (passos < 10000){



        IO.println("Falta pouco");

        IO.println(10000 - passos);
   }else{
        IO.println("Meta batida, parabéns");


        IO.println(passos - 10000 );
    }

}