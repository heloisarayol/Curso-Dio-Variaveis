package Variaveis;

public class main {
    public static void main(String[]args) {
        int i = 3;
        //int i (Variaveis devem possuir diferetes nomes)
        int I = 4; //Variaveis em Java são Case-Sensitive
        //int 1i (Variaveis em Java nao devem ser iniciadas com numeros)
        int _1a = 5; //(Evitar escrever variaveis dessa forma)
        final int j = 10;  //variaveis final possuem valores constantes
        // int b io (Variaveis em java nao podem ser espacadas)
        // caracteres especiais em variaveis nao podem ser utilizados

        //******** Boas Praticas para Variaveis ************
        int quantidadeProduto = 8; // metodo "camelo" e expressividade interessante
        final int NUMERO_TENTATIVAS = 5; // regra utilizada para escrever variaveis final

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println(j);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
    }
}
