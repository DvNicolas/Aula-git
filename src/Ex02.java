import java.awt.image.ImagingOpException;

void main() {



    Scanner b22 = new Scanner(System.in);

    IO.println("Bem vindo ao Terraço Itália, para começar seu pedido:");

    IO.println("\n");


    IO.println("Qual seu Nome?");

    String nome = b22.nextLine();



    IO.println("Qual será seu pedido?");

    String pedido = b22.nextLine();


    IO.println("Qual valor do seu prato?");

    int valor = b22.nextInt();


    IO.println("Cadastro completo");

    IO.println("------Suas informações:");
    IO.println("\n");
    IO.println( "seu nome: "+ nome + "\n" + "seu pedido: " + pedido + "\n" + "sua valor: " + valor + "\n" );










































}