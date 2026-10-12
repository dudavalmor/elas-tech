package aula14Polimorfismo.Ex1;

public class Calculadora {

    public double calculaArea(double lado){
        return lado * lado;
    }

    public double calculaArea(double base, double altura){
        return base * altura;
    }

    public double calculaArea(int raio){
        return 3.14159 * raio * raio;
    }
}
