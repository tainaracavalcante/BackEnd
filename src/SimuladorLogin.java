import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SimuladorLogin extends JFrame {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    JTextField txtEmail = new JTextField();
    JPasswordField txtSenha = new JPasswordField();

    public SimuladorLogin() {

        usuarios.add(new Usuario("admin@senai.com", "123456"));

        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel lblEmail = new JLabel("E-mail");
        JLabel lblSenha = new JLabel("Senha");

        JButton btnLogin = new JButton("Login");
        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnLimpar = new JButton("Limpar");

        painel.add(lblEmail);
        painel.add(txtEmail);

        painel.add(lblSenha);
        painel.add(txtSenha);

        painel.add(btnLogin);
        painel.add(btnCadastrar);
        painel.add(btnLimpar);

        add(painel);

        btnLogin.addActionListener(e -> {

            String email = txtEmail.getText();
            String senha = new String(txtSenha.getPassword());

            boolean login = false;

            for (Usuario u : usuarios) {

                if (u.getEmail().equals(email)
                        && u.getSenha().equals(senha)) {

                    login = true;
                }
            }

            if (login) {

                JOptionPane.showMessageDialog(null,
                        "Login realizado");

            } else {

                JOptionPane.showMessageDialog(null,
                        "Dados incorretos");
            }

        });

        btnCadastrar.addActionListener(e -> {

            String email = txtEmail.getText();
            String senha = new String(txtSenha.getPassword());

            if (email.isEmpty() || senha.isEmpty()) {

                JOptionPane.showMessageDialog(null,
                        "Preencha os campos");

            } else {

                usuarios.add(new Usuario(email, senha));

                JOptionPane.showMessageDialog(null,
                        "Usuário cadastrado");
            }

        });

        btnLimpar.addActionListener(e -> {

            txtEmail.setText("");
            txtSenha.setText("");

        });

        setVisible(true);
    }

    public static void main(String[] args) {

        new SimuladorLogin();
    }
}