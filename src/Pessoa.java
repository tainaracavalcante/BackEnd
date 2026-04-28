// Código "Errado"

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa tom = new Pessoa("Tom", -5);

        // Já começa com valor inválido
        System.out.println("Idade inicial: " + tom.idade); // -5

        // Qualquer parte do código pode alterar diretamente
        tom.idade = -999;

        System.out.println("Idade alterada: " + tom.idade); // -999
    }
}