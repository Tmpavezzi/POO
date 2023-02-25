

public class Jogador {
    private String nome;
    private int xp=0;
    private int hp=100;
    private boolean evenenado=false;
  
      
    
   public Jogador(){
       
   }
    
   
    public Jogador(String nome){
        this.nome=nome;
    }
    
    public void receberAntidoto(){
        if(evenenado) evenenado= false;
        if(evenenado)evenenado=true;
        
    }
    public void receberdado(int pontos){
        this.hp =this.hp-pontos;
        //this.hp -=pontos;
    }
    
    public  void recebercura(int pontos){
        this.hp+=pontos;
    }
    
    public void receberExperiencia(int pontos){
        this.xp=this.hp+pontos;
    }
  
      public String getNome() {
          return nome;
      }
    
    
    
    public int getXp() {
          return xp;
      }
  
      public int getHp() {
          return hp;
      }
  
      public boolean isEvenenado() {
          return evenenado;
      }
    
}
