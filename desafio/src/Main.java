public class Main {
    public static void main(String[] arg) {

        Personagem p1 = new Feiticeiro("Merlin");
        Personagem p2 = new Caçador("João");
        Personagem p3 = new Arqueiro("Jose");

        p1.mostrarStatus();
        p2.mostrarStatus();
        p3.mostrarStatus();

        while (p1.getVida() > 0 & p2.getVida() > 0) {

            p1.atacar(p2);
            p2.atacar(p1);
            p3.atacar(p1);
        }

        String vencedor = (p1.getVida() > 0) ? p1.getNome() : p2.getNome();

        System.out.println("Vencedor: " + vencedor);
    }
}