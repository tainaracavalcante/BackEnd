import javax.swing.*;
import java.awt.*;

public class SimuladorLogin extends JFrame {

    private JTextField txtEmail;
    private JPasswordField txtSenha;
    private JButton btnLogin;
    private JButton btnLimpar;

    public SimuladorLogin() {
        setTitle("Login SENAI");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel(" E-mail:"));
        txtEmail = new JTextField();
        add(txtEmail);

        add(new JLabel(" Senha:"));
        txtSenha = new JPasswordField();
        add(txtSenha);

        btnLogin = new JButton("Login");
        btnLimpar = new JButton("Limpar");
        add(btnLogin);
        add(btnLimpar);

        btnLogin.addActionListener(e -> {
            String email = txtEmail.getText();
            String senha = new String(txtSenha.getPassword());

            if (email.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha tudo!");
            } else if (email.equals("admin@senai.com") && senha.equals("123456")) {
                JOptionPane.showMessageDialog(this, "Sucesso: Login realizado!");
            } else {
                JOptionPane.showMessageDialog(this, "E-mail ou senha inválidos!");
            }
        });

        btnLimpar.addActionListener(e -> {
            txtEmail.setText("");
            txtSenha.setText("");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimuladorLogin().setVisible(true);
        });
    }
}