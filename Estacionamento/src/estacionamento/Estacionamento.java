package estacionamento;

public class Estacionamento {
    
    String placa;
    int hora_entrada;
    double minuto_entrada;
    int hora_saida;
    double minuto_saida;
    double preco_total;
    
    public Estacionamento(String placa, int hora_entrada, double minuto_entrada, int hora_saida, double minuto_saida, double preco_total){
        this.placa = placa;
        this.hora_entrada = hora_entrada;
        this.minuto_entrada = minuto_entrada;
        this.hora_saida = hora_saida;
        this.minuto_saida = minuto_saida;
        this.preco_total = preco_total;
        
}
      
public void Calculo(){
    double novo_valor;
    double nova_entrada;
    double nova_saida;
   
    nova_entrada = ((hora_entrada)+minuto_entrada/60);
    nova_saida = ((hora_saida)+minuto_saida/60);
    
    novo_valor = nova_saida - nova_entrada;
    
    preco_total = novo_valor*5.00;
     
    System.out.println("--------------------------------------------------------------");
    System.out.println("-            ESTACIONAMENTO PIT-STOP GARANHUNS               -");
    System.out.println("-                                                            -");
    System.out.println("-                  PLACA VEICULO:"+placa                       );
    System.out.println("-              HORARIO DE ENTRADA:"+hora_entrada+"Hrs"+minuto_entrada+"Min" );
    System.out.println("-               HORARIO DE SAIDA:"+hora_saida+"Hrs"+minuto_saida+"Min"    );
    System.out.println("-                                                            -");
    System.out.println("-                TOTAL A PAGAR:"+preco_total+"Reais"           );
    System.out.println("-                                                            -");
    System.out.println("-             Endereço: Av. Rui Barbosa - nº 000             -");
    System.out.println("-          CEP 00.000-000 - Heliopolis - Garanhuns           -");
    System.out.println("-                 CNPJ: 00.000.000/0000-00                   -");
    System.out.println("-                                                            -");
    System.out.println("-                 OBRIGADO PELA PREFERENCIA!                 -");
    System.out.println("--------------------------------------------------------------");
}
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getHora_entrada() {
        return hora_entrada;
    }
    public void setHora_entrada(int hora_entrada) {
        this.hora_entrada = hora_entrada;
    }
    public double getMinuto_entrada() {
        return minuto_entrada;
    }
    public void setMinuto_entrada(int minuto_entrada) {
        this.minuto_entrada = minuto_entrada;
    }
      public int getHora_saida() {
        return hora_saida;
    }
    public void setHora_saida(int hora_saida) {
        this.hora_saida = hora_saida;
    }
    public double getMinuto_saida() {
        return minuto_saida;
    }
    public void setMinuto_saida(int minuto_saida) {
        this.minuto_saida = minuto_saida;
    }
    
}
