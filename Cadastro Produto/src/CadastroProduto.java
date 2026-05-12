import javax.swing.*;

public class CadastroProduto extends JFrame {
    JLabel lblNome, lblPreco, lblQuantidade;
    JTextField txtNome, txtPreco, txtQuantidade;
    JButton btnCadastrar, btnLimpar;
    JTextArea areaResultado;

    public CadastroProduto() {

        // janela
        setTitle("Cadastro de Produto");
        setSize(350, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblNome = new JLabel("Nome:");
        lblPreco = new JLabel("Preço:");
        lblQuantidade = new JLabel("Quantidade:");

        // campos
        txtNome = new JTextField();
        txtPreco = new JTextField();
        txtQuantidade = new JTextField();

        // botoes
        btnCadastrar = new JButton("Cadastrar");
        btnLimpar = new JButton("Limpar");

        // resultado
        areaResultado = new JTextArea();
        areaResultado.setEditable(false);

        // posições
        lblNome.setBounds(20, 20, 100, 20);
        txtNome.setBounds(120, 20, 180, 25);

        lblPreco.setBounds(20, 60, 100, 20);
        txtPreco.setBounds(120, 60, 180, 25);

        lblQuantidade.setBounds(20, 100, 100, 20);
        txtQuantidade.setBounds(120, 100, 180, 25);

        btnCadastrar.setBounds(40, 150, 120, 30);
        btnLimpar.setBounds(180, 150, 120, 30);

        areaResultado.setBounds(20, 200, 280, 60);

        // adicionando na tela
        add(lblNome);
        add(txtNome);

        add(lblPreco);
        add(txtPreco);

        add(lblQuantidade);
        add(txtQuantidade);

        add(btnCadastrar);
        add(btnLimpar);

        add(areaResultado);

        // ação cadastrar
        btnCadastrar.addActionListener(e -> {

            String nome = txtNome.getText();
            String precoTexto = txtPreco.getText();
            String qtdTexto = txtQuantidade.getText();

            if (nome.equals("") || precoTexto.equals("") || qtdTexto.equals("")){

                areaResultado.setText("Preencha todos os campos.");

            } else {

                double preco = Double.parseDouble(precoTexto);
                int quantidade = Integer.parseInt(qtdTexto);

                double total = preco * quantidade;

                areaResultado.setText(
                        "Produto cadastrado!\n" +
                                "Nome: " + nome +
                                "\nTotal: R$ " + total
                );
            }
        });

        // ação limpar
        btnLimpar.addActionListener(e -> {

            txtNome.setText("");
            txtPreco.setText("");
            txtQuantidade.setText("");
            areaResultado.setText("");
        });

        // deixa visivel
        setVisible(true);
    }

    public static void main(String[] args) {

        new CadastroProduto();
    }
}