public class Main {
    public static void main(String[] args) {
        Pessoa tom = new Pessoa("Tom", -5);

        // Mostra valor inválido
        System.out.println("Idade inicial: " + tom.idade); // -5

        // Alteração direta (sem controle)
        tom.idade = -999;

        System.out.println("Idade alterada: " + tom.idade); // -999
    }
}