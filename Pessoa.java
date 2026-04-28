// Código "Errado"

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade); // usa validação
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else {
            this.idade = idade;
        }
    }
}