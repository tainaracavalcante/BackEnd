public class Caçador extends Personagem {

    public Caçador(String nome) {
        super(nome, 110, 30,15);
    }

    public void golpePesado(Personagem inimigo){
        int dano = getAtaque() + 6;
        IO.println(getNome() + "atacou pessado" + inimigo.getNome());
        inimigo.receberDano(dano);
    }
}