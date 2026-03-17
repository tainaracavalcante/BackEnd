public class Feiticeiro extends Personagem {

    public Feiticeiro(String nome) {
        super(nome, 100, 50, 5);
    }

    public void lancarMagia(Personagem inimigo) {
        int dano = getAtaque() + 10;
        System.out.println(getNome() + "lançar magia em" + inimigo.getNome());
        inimigo.receberDano(dano);
    }

}