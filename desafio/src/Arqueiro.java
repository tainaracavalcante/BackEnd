public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome, 70, 20, 10);
    }

    public void disparoPreciso(Personagem inimigo){
        int dano = getAtaque() + 7;
        System.out.println(getNome() + "fez um disparo preciso" + inimigo.getNome());
        inimigo.receberDano(dano);
    }

}