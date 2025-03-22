import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String NameVendedor = input.nextLine();

        // System.out.println("Cantidad de productos vendidos:");
        // int CantidadProductos = input.nextInt();

        System.out.println("Ingrese valor producto 1:");
        double ValorProducto1= input.nextDouble();

        System.out.println("Ingrese valor producto 2:");
        double ValorProducto2 = input.nextDouble();

        System.out.println("Ingrese valor producto 3:");
        double ValorProducto3 = input.nextDouble();

        System.out.println("Ingrese valor producto 4:");
        double ValorProducto4 = input.nextDouble();

        System.out.println("Ingrese valor producto 5:");
        double ValorProducto5 = input.nextDouble();

        System.out.println("Ingrese valor producto 6:");
        double ValorProducto6 = input.nextDouble();

        System.out.println("Ingrese valor producto 7:");
         double ValorProducto7 = input.nextDouble();


            double Comisiones1 = 0;

          if (ValorProducto1 >= 100000) {
              Comisiones1 += (ValorProducto1 * 0.10);
          } else {
              Comisiones1 += (ValorProducto1 * 0.05);
          }

          if (ValorProducto2 >= 100000) {
              Comisiones1 += (ValorProducto2 * 0.10);
          } else {
              Comisiones1 += (ValorProducto2 * 0.05);
          }

          if (ValorProducto3 >= 100000) {
              Comisiones1 += (ValorProducto3 * 0.10);
          } else {
              Comisiones1 += ( ValorProducto3 * 0.05);
          }

          if (ValorProducto4 >= 100000) {
              Comisiones1 += ( ValorProducto4 * 0.10);
          } else {
              Comisiones1 += (ValorProducto4 * 0.05);
          }

          if (ValorProducto5 >= 100000) {
              Comisiones1 += (ValorProducto5 * 0.10);
          } else {
              Comisiones1 += (ValorProducto5 * 0.05);
          }

          if (ValorProducto6 >= 100000) {
              Comisiones1 += (ValorProducto6 * 0.10);
          } else {
              Comisiones1 += (ValorProducto6 * 0.05);
          }

          if (ValorProducto7 >= 100000) {
              Comisiones1 += (ValorProducto7 * 0.10);
          } else {
              Comisiones1 += (ValorProducto7 * 0.05);
          }

        double TotalVentas = ValorProducto1 + ValorProducto2 + ValorProducto3 + ValorProducto4 + ValorProducto5 + ValorProducto6 + ValorProducto7;
        double SalarioTotal = (double) (Comisiones1 + 1000000);

        System.out.println("Vendedor: " + NameVendedor);
        System.out.println("Total ventas: $" + (int) TotalVentas);
        System.out.println("Comisiones: $" + (int) Comisiones1);
        System.out.println("Salario total: $" + (int) SalarioTotal);
        input.close();

    }
}
