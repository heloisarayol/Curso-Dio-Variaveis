package tipos_de_variaveis;

public class tipagem {
    public static void main(String[]args){
        //dados numericos
        byte b1= 5;
        byte b2= 10;

        short s1=  200;
        short s2= 100;

        int i1 = 4;
        long i3 = 2900000000l; //inteiro utilizado para numeros inteiros grandes

        float f1 = 4.5f; //necessario colocar f no fim do float para que o programa n interprete como double
        double d1= 89.90d; // utilizado para numeros grandes reais fracionados

        //textuais
        char c1 = 'Y'; // somente um caractere
        char c2 = '\u0057';

        String st1 = "Hello World"; //utilizado para textos

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(i1);
        System.out.println(i3);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(st1);
        System.out.println(bo1);
        System.out.println(bo2);


    }
}
