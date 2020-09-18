
package total.a.pagar.xd;

import javax.swing.JOptionPane;

public class Datos {

    public Datos() {
    }
   String nombre="";
   Integer precio=0;
   Integer cantidad=0;
   Integer subtotal;
   Double iva=0.14;
   Double totalap;
   Double resultado;
   Integer total;
   Integer Valor;
   Integer contador=0;

public void Calcular(){

    nombre=Windows.nombre.getText();
    precio=Integer.parseInt(Windows.pre.getText());
    cantidad=Integer.parseInt(Windows.can.getText());
contador++;


    total=cantidad*precio;
    subtotal=total;
    totalap=total*iva;
    resultado=totalap+precio;
    ///cantidad*precio=subtotal=total*iva=tap=totalapagar*precio.
    String su=String.valueOf(subtotal);
    Windows.sub.setText(su);
    String res=String.valueOf(resultado);
    Windows.tap.setText(res);
    String ivas=String.valueOf(totalap);
    Windows.iva.setText(ivas);
    
    String con=String.valueOf(contador);
    Windows.contador.setText(con);


        if (precio > 50) {
        JOptionPane.showMessageDialog(null, "Descuento del 30%");      
    } else {
            
         }
        if (precio  > 100) {
        JOptionPane.showMessageDialog(null, "Descuento del 10%");
        
    } else {
    }


       
  
}
public void MostrarResultados(){

    JOptionPane.showMessageDialog(null, "Nombre del producto es "+nombre+"\nEl precio es $"+precio+"\nLa cantidad es "+cantidad+"\nSubtotal es $"+subtotal+"\nEl iva es de "+totalap+"\nSu total a pagar es $"+resultado);
        
    }
}


