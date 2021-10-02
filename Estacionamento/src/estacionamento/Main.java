package estacionamento;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        
        int op;  
    do{
        op = Integer.parseInt(JOptionPane.showInputDialog("ESTACIONAMENTO PIT-STOP GUS \n \n SEJA BEM VINDO!\n \n #Digite 1 para Guardar o Veiculo \n #Digite 0 sair"));
    
        if (op == 1){
            String placa = JOptionPane.showInputDialog(null,"Informe a Placa do Veiculo: Ex.:KLB 5570");
            int h_entrada = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a HORA de ENTRADA do Veiculo:"));
            int m_entrada = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o MINUTO de ENTRADA do Veiculo:"));
            int h_saida = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a HORA de SAIDA do Veiculo:"));
            int m_saida = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o MINUTO de SAIDA do Veiculo:"));
         
         Estacionamento a = new  Estacionamento(placa, h_entrada, m_entrada, h_saida, m_saida,1);
         
        a.Calculo();
        }
        else
        break;
    }while(op != 0);
    }
}
