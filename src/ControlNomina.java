import java.util.Scanner;
public class ControlNomina {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int SueldoJusto = 0;  
        int SueldoVIP = 0;     
        double totalSueldo = 0; 
        
        System.out.println("aja y tu que? quieres el control de nomina o que?. Ponte trucho pue'");
        for (int i = 1; i <= 10; i++) {
            double Sueldo;
            while (true) {
                System.out.print("Ingresa el Sueldo del empleado "+ i + " en esa monda : ");
                Sueldo = input.nextDouble();
                
                if (Sueldo <= 0) {
                    System.out.println("El Sueldo no es valido tratame serio!! Debe ser mayor que 0 nojoda.");
                } else {
                    break; 
                }
            }

            if (Sueldo >= 100 && Sueldo <= 300) {
                SueldoJusto++;  
            } else if (Sueldo > 300) {
                SueldoVIP++;  
            }

            totalSueldo += Sueldo;
        }

        System.out.println("--- Informe de Nomina ---");
        System.out.println("Los Sueldos pobrecitos que estubieron en 100 a 300 son : " + SueldoJusto);
        System.out.println("Cantidad de Sueldos bien pagados mayores a 300 fueron : " + SueldoVIP);
        System.out.printf("Total acumulado: %.2f\n" , (float) totalSueldo);
        System.out.println(" y ya , que mas quieres");

        input.close();
    }
    
}
