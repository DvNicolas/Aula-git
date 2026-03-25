void main() {
    IO.println(" Instalando seu programa  ");


    IO.println("\n");

    Scanner sc = new Scanner(System.in);

    IO.println(" Quantos GB já foi baixado??");


    int gigabyte = sc.nextInt();

    if (gigabyte <= 300) {

        IO.println(" Falta pouco ");
        IO.println(300 - gigabyte);
    } else if (gigabyte >= 300) {

        IO.println("Ainda falta mais um pouco");


    } else if (gigabyte >= 500) {

        IO.println("Ainda falta mais um pouco");

        IO.println(gigabyte - 2000);
    } else if (gigabyte >= 800) {

        IO.println("Ainda falta mais um pouco");

        IO.println(gigabyte - 2000);
    }else if (gigabyte >=1200) {

        IO.println("Ainda falta mais um pouco");

        IO.println(gigabyte - 2000);
    }else{
        IO.println("Donwload Pronto");


        IO.println(gigabyte - 2000 );
    }

}
