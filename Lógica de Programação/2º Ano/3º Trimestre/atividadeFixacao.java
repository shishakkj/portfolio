package atividade.Fixação;
import java.util.Scanner;

public class AtividadeFixação {

    
    public static void main(String[] args) {
       media(); 
       System.out.println();
       System.out.println("---------------------------------");
       System.out.println();
       salario();
       System.out.println();
       System.out.println("---------------------------------");
       System.out.println();
       consumo();
       System.out.println();
       System.out.println("---------------------------------");
       System.out.println();
       conversor();
    }
    
    public static void media() {
        Scanner nanako =  new Scanner (System.in);
        System.out.println("Insira o seu nome: ");
        String nome = nanako.next();
        System.out.println("Insira a primeira nota: ");
        int nota1 =  nanako.nextInt();
        System.out.println("Insira a segunda nota: ");
        int nota2 =  nanako.nextInt();
        System.out.println("Insira a terceira nota: ");
        int nota3 =  nanako.nextInt();
        int mediaNotas = (nota1 + nota2 + nota3)/3;
        
        System.out.println("");
        System.out.println("Olá " +nome+ ", a sua média é " +mediaNotas+ ".");
    }
    
    public static void salario() {
        Scanner nanako =  new Scanner (System.in);
        System.out.println("Insira o seu nome: ");
        String nome = nanako.next();
        System.out.println("Insira o seu salário: ");
        float salario =  nanako.nextFloat();
        System.out.println("Insira a comissão de vendas efetuadas no mês: ");
        float vendas =  nanako.nextInt();
        float salarioFM = salario + ((vendas/100)*15);
        
        System.out.println("Olá " +nome+ ", o seu salário fixo é R$" +salario+ " e o seu salário desse mês é R$" +salarioFM);
    }
    
    public static void consumo(){
        Scanner nanako =  new Scanner (System.in);
        System.out.println("Insira a distância percorrida: ");
        int distancia = nanako.nextInt();
        System.out.println("Insira o total de gasolina gasto: ");
        int gasolina = nanako.nextInt();
        int gKM = distancia/gasolina;
        
        System.out.println("É consumido " +gKM+ " litros de gasolina por quilômetro");
        
    }
    
    public static void conversor(){
        Scanner nanako = new Scanner(System.in);
        
        System.out.println("Digite o número para escolher o conversor:\n[1] - Celsius para Fahrenheit; \n[2] - Fahrenheit para Celsius; \nR: ");
        int escolha = nanako.nextInt();
        
        if (escolha == 1) {
            System.out.println("Digite a sua temperatura em Celsius");
            double celsius = nanako.nextDouble();
            double cC = (celsius * 9/5) + 32;
            System.out.println(celsius+"ºC ---> "+cC+"ºF");
            
        }
        
        else if (escolha == 2){
            System.out.println("Digite a sua temperatura em Fahrenheit");
            double fahrenheit = nanako.nextDouble();
            double fC = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit+"ºF ---> "+fC+"ºC");
        }
        
        else {
            System.out.println("Insira uma opção válida");
        }
        
    }
}