import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaJava {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setSize(300, 200);
        janela.setTitle("Minha 1° Janela ! ");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        
        //criando label (rótulos)
        JLabel rotulo = new JLabel();
        rotulo.setText("digite seu nome");
        janela.add(rotulo);
        
        //criando campo de entrada 
        JTextField campo = new JTextField (10);
        janela.add(campo);
        
        //criando botão
        JButton botao = new JButton();
        botao.setText("Clique aqui");
        janela.add(botao);
        
        janela.setVisible(true);
        
        
        
        
    }
}
