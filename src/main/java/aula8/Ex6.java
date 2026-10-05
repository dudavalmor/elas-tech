package aula8;

public class Ex6 {
    public static void main(String[] args) {
        System.out.println(somar(10, 20));

        System.out.println(somar(10, 20, 30));

        System.out.println(somar(10.5, 20.5));
    }

    static int somar(int n1, int n2){
        return n1+n2;
    }

    static int somar(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    static double somar(double n1, double n2){
        return n1+n2;
    }

}
