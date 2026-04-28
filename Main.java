public class Main {
    public static void main(String[] args) {
        Pessoa tom = new Pessoa("Tom", -5);

        // Como a idade é inválida, fica 0 (valor padrão)
        System.out.println("Idade inicial: " + tom.getIdade());

        tom.setIdade(25);
        System.out.println("Idade atualizada: " + tom.getIdade());

        // tom.idade = -999;

// isso agora não compila
    }
}
