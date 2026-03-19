public class Personagem {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Personagem inimigo) {
        int dano = this.ataque - inimigo.getDefesa();
        if (dano < 0) {
            dano = 0;
        }

        IO.println(this.nome + "atacou" + inimigo.getNome());
        inimigo.receberDano(dano);
    }

    public void receberDano(int dano) {
        this.vida -= dano;

        if (this.vida < 0) {
            this.vida = 0;
        }

        IO.println(this.nome + " recebeu " + dano + " de dano");
        IO.println("Vida atual: " + this.vida);
    }

    public void mostrarStatus() {
        IO.println("Nome: " + nome);
        IO.println("Vida: " + vida);
        IO.println("Ataque: " + ataque);
        IO.println("Defesa: " + defesa);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
