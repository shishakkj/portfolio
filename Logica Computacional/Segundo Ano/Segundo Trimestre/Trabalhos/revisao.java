package cavalo;
import java.util.Scanner;
public class Cavalo {
Scanner input = new Scanner(System.in);
public static void main(String[] args) {
System.out.println(volPrisma());
System.out.println(altPrisma());
System.out.println("------------------------------");
System.out.println(afPrisma());
}
public static double volPrisma() {
Scanner input = new Scanner(System.in);
System.out.println("Digite a área da face");
double af = input.nextDouble();
System.out.println("Digite a altura");
double h = input.nextDouble();
return af*h;
}
public static double altPrisma(){
Scanner input = new Scanner(System.in);
System.out.println("Digite o volume");
double vol = input.nextDouble();
System.out.println("Digite a área da face");
double af = input.nextDouble();
return vol/af;
}
public static double afPrisma() {
Scanner input = new Scanner(System.in);
System.out.println("Digite o volume");
double vol = input.nextDouble();
System.out.println("Digite a altura");
double alt = input.nextDouble();
return vol/alt;
}
}