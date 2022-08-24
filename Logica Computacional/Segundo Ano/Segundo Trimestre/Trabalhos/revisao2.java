package catatau;
import java.util.Scanner;
public class lalau {
Scanner input = new Scanner(System.in);
public static void main(String[] args) {
System.out.println("O volume do prisma é " + volPrisma());
System.out.println("------------------------------");
System.out.println("A altura do prisma é " + altPrisma());
System.out.println("------------------------------");
System.out.println("A área das faces do prisma é " + afPrisma());
System.out.println("------------------------------");
System.out.println("A área total é " + areaTotalPrisma());
System.out.println("------------------------------");
System.out.println("A área base é" + areaBase());
System.out.println("------------------------------");
System.out.println("O número de faces é " + numeroFaces());
System.out.println("------------------------------");
System.out.println("A área da face é "+areaFace());
}
public static double volPrisma() {
Scanner input = new Scanner(System.in);
System.out.println("VOLUME DO PRISMA");
System.out.println("Digite a área da face");
double af = input.nextDouble();
System.out.println("Digite a altura");
double h = input.nextDouble();
return af*h;
}
public static double altPrisma(){
Scanner input = new Scanner(System.in);
System.out.println("ALTURA DO PRISMA");
System.out.println("Digite o volume");
double vol = input.nextDouble();
System.out.println("Digite a área da face");
double af = input.nextDouble();
return vol/af;
}
public static double afPrisma() {
Scanner input = new Scanner(System.in);
System.out.println("ÁREA DAS FACES DO PRISMA");
System.out.println("Digite o volume");
double vol = input.nextDouble();
System.out.println("Digite a altura");
double alt = input.nextDouble();

return vol/alt;
}
public static double areaTotalPrisma () {
Scanner input = new Scanner (System.in);
System.out.println("ÁREA TOTAL DO PRISMA");
System.out.println("Digite a área da base");
double areaBase = input.nextDouble(); //30
System.out.println("Digite o número de faces");
double nFaces = input.nextDouble(); //6
System.out.println("Digite a área da face");
double areaFace = input.nextDouble(); //15
return (2*areaBase)+(nFaces*areaFace); //150
}
public static double areaBase () {
Scanner input = new Scanner (System.in);
System.out.println("ÁREA DA BASE DO PRISMA");
System.out.println("Digite a área total");
double areaTotal = input.nextDouble();
System.out.println("Digite o número de faces");
double nFaces = input.nextDouble();
System.out.println("Digite a área da face");
double areaFace = input.nextDouble();
return (areaTotal-(nFaces*areaFace))/2;
}
public static double numeroFaces () {
Scanner input = new Scanner (System.in);
System.out.println("NÚMERO DE FACES DO PRISMA");
System.out.println("Digite a área total");
double areaTotal = input.nextDouble();
System.out.println("Digite a área da base");
double areaBase = input.nextDouble();
System.out.println("Digite a área da face");
double areaFace = input.nextDouble();
return (areaTotal-(2*areaBase))/areaFace;
}
public static double areaFace () {
Scanner input = new Scanner (System.in);
System.out.println("ÁREA DAS FACES DO PRISMA");
System.out.println("Digite a área total");
double areaTotal = input.nextDouble();
System.out.println("Digite a área da base");
double areaBase = input.nextDouble();
System.out.println("Digite o número de faces");
double nFaces = input.nextDouble();
return (areaTotal-(2*areaBase))/nFaces;
}
}