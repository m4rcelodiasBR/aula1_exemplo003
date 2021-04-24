
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author m4rce
 */
public class Tela extends JFrame {

    private JLabel lblTitulo = null;
    private JLabel lblNome = null;
    private JLabel lblEmail = null;
    private JLabel lblSexo = null;
    private JLabel lblSenha = null;
    private JLabel lblEstiloLeitura = null;
    private JLabel lblTimeFutebol = null;
    private JTextField txtNome = null;
    private JTextField txtEmail = null;
    private JPasswordField pswSenha = null;
    private JRadioButton rdbMasculino = null;
    private JRadioButton rdbFeminino = null;
    private JCheckBox chkEsportes = null;
    private JCheckBox chkEducacao = null;
    private JCheckBox chkCulinaria = null;
    private JComboBox jComboBox1 = null;
    private JButton btnEnviar = null;
    
    public Tela() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 600);
        setLocation(250, 250);
        
        setLayout(null);
        
        lblTitulo = new JLabel("Cadastro");
        lblTitulo.setBounds(150, 0, 300, 40);
        lblTitulo.setFont(new Font("Calibri", Font.BOLD, 18));
        
        lblNome = new JLabel("Nome: ");
        lblNome.setLocation(15, 35);
        lblNome.setSize(100, 20);
        
        txtNome = new JTextField(10);
        txtNome.setLocation(110, 35);
        txtNome.setSize(110, 20);
        
        lblEmail = new JLabel("Email: ");
        lblEmail.setLocation(15, 60);
        lblEmail.setSize(100, 20);
        
        txtEmail = new JTextField(10);
        txtEmail.setLocation(110, 60);
        txtEmail.setSize(140, 20);
        
        lblSenha = new JLabel("Senha: ");
        lblSenha.setBounds(15, 85, 100, 20);
        
        pswSenha = new JPasswordField();
        pswSenha.setBounds(110, 85, 100, 20);
        
        lblSexo = new JLabel("Sexo: ");
        lblSexo.setBounds(15, 110, 100 , 20);
        
        rdbMasculino = new JRadioButton("Masculino");
        rdbMasculino.setBounds(110, 110, 100, 20);
        
        rdbFeminino = new JRadioButton("Feminino");
        rdbFeminino.setBounds(210, 110, 100, 20);
        
        lblEstiloLeitura = new JLabel("Estilo de Leitura: ");
        lblEstiloLeitura.setBounds(15, 135, 110, 20);
        
        chkEsportes = new JCheckBox("Esportes");
        chkEsportes.setBounds(135, 135, 120, 20);
        
        chkEducacao = new JCheckBox("Educação");
        chkEducacao.setBounds(135, 160, 120, 20);
        
        chkCulinaria = new JCheckBox("Culinária");
        chkCulinaria.setBounds(135, 185, 120, 20);
        
        lblTimeFutebol = new JLabel("Time de Futebol");
        lblTimeFutebol.setBounds(15, 210, 110, 20);
        
        jComboBox1 = new JComboBox();
        jComboBox1.setBounds(110, 210, 110, 20);
        jComboBox1.addItem("Fluminense");
        jComboBox1.addItem("Botafogo");
        jComboBox1.addItem("Vasco");
        jComboBox1.addItem("América");
        jComboBox1.addItem("Flamengo");
        
        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(200, 300, 110, 30);
                      
        add(lblTitulo);
        add(lblNome);
        add(txtNome);
        add(lblEmail);
        add(txtEmail);
        add(lblSenha);
        add(pswSenha);
        add(lblSexo);
        add(rdbMasculino);
        add(rdbFeminino);
        add(lblEstiloLeitura);
        add(chkEsportes);
        add(chkEducacao);
        add(chkCulinaria);
        add(lblTimeFutebol);
        add(jComboBox1);
        add(btnEnviar);
               
    }
    
}
