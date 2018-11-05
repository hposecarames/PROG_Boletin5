
package contabancaria;

import javax.swing.JOptionPane;
/**
 * 
 * @author Hector Pose Carames
 */
public class ContaBancaria {
    //Atributos
    private String nombreCliente;
    private String numConta;
    private double saldo;
    double ingreso;
    double reintegro;
    
    //Constructor con parámetros
    public ContaBancaria(String nombreCliente, String numConta, double saldo){
        this.nombreCliente = nombreCliente;
        this.numConta = numConta;
        this.saldo = saldo;  
    }
    //Constructor vacío
    public ContaBancaria(){
        
    }
   
    public void datos(){
        
        nombreCliente = JOptionPane.showInputDialog("Introduce el nombre: ");
        numConta = JOptionPane.showInputDialog("Introduce el número de cuenta: ");
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el saldo: "));
    }
    
    public void visualizar(){
        JOptionPane.showMessageDialog(null, "Nombre del cliente: "+ nombreCliente+"\nNumero de conta: "+ numConta+ "\nSaldo da conta: "+ saldo);
        
    }
    public void ingreso(){
        
        ingreso = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a ingresar: "));
        if (ingreso>0){
        saldo = saldo + ingreso;   
        JOptionPane.showMessageDialog(null, "Tu saldo actual es: " + saldo);
        }
        else
            JOptionPane.showMessageDialog(null,"Introduzca cantidades mayores de 0");
    }
      
    public void reintegro(){
        
        reintegro = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a retirar: "));
        if (reintegro<saldo){
            saldo = saldo - reintegro;
            JOptionPane.showMessageDialog(null, "Tu saldo actual es: " + saldo);
        }
        else
            JOptionPane.showMessageDialog(null,"No tienes suficiente saldo");
        
    }
    public String getCliente(){
        return nombreCliente;
    }        
    public void setCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    public String getConta(){
        return numConta;
    }
    public void setConta(String numConta){
        this.numConta = numConta;    
    }
    public double getsaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
