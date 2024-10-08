package atv02;

public class Veiculo {
     
   private String modelo;
   private double quilometragem;

   public Veiculo(String modelo, double quilometragem){
     
    this.modelo = modelo;
    this.quilometragem = quilometragem;
   }
   
   public double calcularCustoServico(){
    return quilometragem;
   }


   public String getModelo(){
          return modelo;
   }
   public void setModelo(String modelo){
          this.modelo = modelo;
   }
    
   public double getQuilometragem(){
         return quilometragem;
}
   public void setquilometragem(double quilometragem){
    this.quilometragem = quilometragem;
}
}
