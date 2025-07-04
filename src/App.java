import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        double precioInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio orignal del producto: "));
        double descuento = Double.parseDouble(JOptionPane.showInputDialog("Digite el % de descuento: "));
        descuento *= 0.01; //porcentaje a decimal 
        
        double valorDescuento = precioInicial * descuento;
        double PrecioFinal = precioInicial - valorDescuento;
        System.out.println("el precio original del producto es: "+ precioInicial );
        System.out.println("el valor de descuento es:" + descuento + "%");
        System.out.println("Precio final con el valor de descuento es de: "+ PrecioFinal);

         
       
    }
}
