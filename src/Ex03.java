void main() {




    Scanner b22 = new Scanner(System.in);

    IO.println("Faça login para entrar");

    IO.println("\n");


    IO.println("Qual seu Nickname?");

    String nickname = b22.nextLine();



    IO.println("Qual seu jogo favorito?");

    String jogo = b22.nextLine();


    IO.println("Qual sua pontuação atual ?");

    int pontos = b22.nextInt();


    IO.println("Cadastro completo");

    IO.println("------Suas informações:");
    IO.println("\n");
    IO.println( "seu nickname: "+ nickname + "\n" + "seu jogo Fav.: " + jogo + "\n" + "sua aurakkjk: " + pontos + "\n" );
}