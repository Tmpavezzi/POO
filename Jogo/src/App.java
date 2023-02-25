public class App {
    public static void main(String[] args)  {
        
        var jogador =new Jogador("Thiago");
        jogador.recebercura(10);
        jogador.receberExperiencia(10);
        System.out.println(jogador.getNome());
        System.out.println(jogador.getHp());
        System.out.println(jogador.getXp());
        
    }
}
