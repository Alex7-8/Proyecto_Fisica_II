
package Grafica;

import Logica.Procesos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Login extends javax.swing.JFrame {

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(500, 200, width, height); //To change body of generated methods, choose Tools | Templates.

    }
    public Login() {
        initComponents();
        transparenteP1();
        transparenteP2();
        transparenteP3();
        aparecer();
        transparenteP4();
        
       
       
    }

   public String Usuario, Contraseña, RUsuario, RContraseña, RPalabra, RContraseñaV, Preg, R,S,T;
   public String RrUsuario;
   public String RrPregunta,RrPalabra;
   public String CosR,CosV;
   
   public void transparenteP1() {
        P1BotTr.setOpaque(false);
        P1BotTr.setContentAreaFilled(false);
        P1BotTr.setBorderPainted(false);

        P1BotRr.setOpaque(false);
        P1BotRr.setContentAreaFilled(false);
        P1BotRr.setBorderPainted(false);

        P1BotIN.setOpaque(false);
        P1BotIN.setContentAreaFilled(false);
        P1BotIN.setBorderPainted(false);

        P1BotSL.setOpaque(false);
        P1BotSL.setContentAreaFilled(false);
        P1BotSL.setBorderPainted(false);
    }

    public void transparenteP2() {
        Pe2BotHr.setOpaque(false);
        Pe2BotHr.setContentAreaFilled(false);
        Pe2BotHr.setBorderPainted(false);

        Pe2BotRr.setOpaque(false);
        Pe2BotRr.setContentAreaFilled(false);
        Pe2BotRr.setBorderPainted(false);

        Pe2BotIN.setOpaque(false);
        Pe2BotIN.setContentAreaFilled(false);
        Pe2BotIN.setBorderPainted(false);

        Pe2BotS.setOpaque(false);
        Pe2BotS.setContentAreaFilled(false);
        Pe2BotS.setBorderPainted(false);

        MaxxP2.setOpaque(false);
       MaxxP2.setContentAreaFilled(false);
      MaxxP2.setBorderPainted(false);

       BotG.setOpaque(false);
       BotG.setContentAreaFilled(false);
       BotG.setBorderPainted(false);
       
       Combo.setOpaque(false);
    }

    public void transparenteP3() {
      Pe3BotH.setOpaque(false);
      Pe3BotH.setContentAreaFilled(false);
      Pe3BotH.setBorderPainted(false);

       Pe3BotR.setOpaque(false);
        Pe3BotR.setContentAreaFilled(false);
        Pe3BotR.setBorderPainted(false);

       Pe3BotIN.setOpaque(false);
       Pe3BotIN.setContentAreaFilled(false);
        Pe3BotIN.setBorderPainted(false);

        Pe3BotS.setOpaque(false);
       Pe3BotS.setContentAreaFilled(false);
        Pe3BotS.setBorderPainted(false);

       Maxx3.setOpaque(false);
        Maxx3.setContentAreaFilled(false);
       Maxx3.setBorderPainted(false);
    }
public void transparenteP4() {
        Pe3BotH1.setOpaque(false);
        Pe3BotH1.setContentAreaFilled(false);
        Pe3BotH1.setBorderPainted(false);

        Pe3BotR1.setOpaque(false);
        Pe3BotR1.setContentAreaFilled(false);
        Pe3BotR1.setBorderPainted(false);

        Pe3BotIN1.setOpaque(false);
        Pe3BotIN1.setContentAreaFilled(false);
        Pe3BotIN1.setBorderPainted(false);

        Pe3BotS1.setOpaque(false);
        Pe3BotS1.setContentAreaFilled(false);
        Pe3BotS1.setBorderPainted(false);

        Maxx4.setOpaque(false);
        Maxx4.setContentAreaFilled(false);
        Maxx4.setBorderPainted(false);
        
        Atras.setOpaque(false);
       Atras.setContentAreaFilled(false);
       Atras.setBorderPainted(false);
       
       Busc.setOpaque(false);
       Busc.setContentAreaFilled(false);
       Busc.setBorderPainted(false);
       
        Rec4.setVisible(false);
    }
    public void aparecer() {
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        Panel4.setVisible(false);
        Panel5.setVisible(false);
       
        Panel1.setVisible(true);
    }
    public void V(){
     if(CosR.equals("")){
            R="Vacio";
        
        }
    }
        
 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Panel1I = new javax.swing.JPanel();
        Ingr = new javax.swing.JLabel();
        P1Co = new javax.swing.JPasswordField();
        P1Us = new javax.swing.JTextField();
        InicioP1 = new javax.swing.JLabel();
        P1BotTr = new javax.swing.JButton();
        P1BotRr = new javax.swing.JButton();
        P1BotIN = new javax.swing.JButton();
        P1BotSL = new javax.swing.JButton();
        Us = new javax.swing.JLabel();
        Key = new javax.swing.JLabel();
        P1BotRr1 = new javax.swing.JButton();
        Panel3 = new javax.swing.JPanel();
        BuscarN = new javax.swing.JTextField();
        NombS = new javax.swing.JLabel();
        Pa3 = new javax.swing.JPanel();
        Text2P3 = new javax.swing.JLabel();
        ReC = new javax.swing.JLabel();
        BuscUs = new javax.swing.JButton();
        PN3 = new javax.swing.JPanel();
        Pe3Use = new javax.swing.JTextField();
        InPe1 = new javax.swing.JLabel();
        Pe3Cos = new javax.swing.JPasswordField();
        Panel2P1 = new javax.swing.JPanel();
        PeIn4 = new javax.swing.JLabel();
        Maxx3 = new javax.swing.JButton();
        Pe3BotIN = new javax.swing.JButton();
        Pe3BotS = new javax.swing.JButton();
        Pe3BotH = new javax.swing.JButton();
        Pe2BotRr2 = new javax.swing.JButton();
        UUs1 = new javax.swing.JLabel();
        KKy1 = new javax.swing.JLabel();
        Pe3BotR = new javax.swing.JButton();
        Panel4 = new javax.swing.JPanel();
        Pa4 = new javax.swing.JPanel();
        Text2P4 = new javax.swing.JLabel();
        ReC1 = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox<>();
        ResS1 = new javax.swing.JLabel();
        Busc = new javax.swing.JButton();
        PregSe1 = new javax.swing.JLabel();
        BuscarP4 = new javax.swing.JTextField();
        Rec4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        RUs = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Rcos = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        PN4 = new javax.swing.JPanel();
        InPe2 = new javax.swing.JLabel();
        Panel2P2 = new javax.swing.JPanel();
        PeIn1 = new javax.swing.JLabel();
        Maxx4 = new javax.swing.JButton();
        UUs2 = new javax.swing.JLabel();
        KKy2 = new javax.swing.JLabel();
        Pe2BotRr4 = new javax.swing.JButton();
        Pe3Use1 = new javax.swing.JTextField();
        Pe3Cos1 = new javax.swing.JPasswordField();
        Pe3BotH1 = new javax.swing.JButton();
        Pe3BotR1 = new javax.swing.JButton();
        Pe3BotIN1 = new javax.swing.JButton();
        Pe3BotS1 = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        PRJ2 = new javax.swing.JPanel();
        RCos = new javax.swing.JPasswordField();
        BotG = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RPal = new javax.swing.JTextField();
        RUsu = new javax.swing.JTextField();
        Rcosv = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        Combo = new javax.swing.JComboBox<>();
        Dis = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Report = new javax.swing.JLabel();
        PJ2 = new javax.swing.JPanel();
        LR = new javax.swing.JLabel();
        PN2 = new javax.swing.JPanel();
        Pe2Use = new javax.swing.JTextField();
        InPe = new javax.swing.JLabel();
        Pe2Cos = new javax.swing.JPasswordField();
        Panel2P = new javax.swing.JPanel();
        PeIn = new javax.swing.JLabel();
        MaxxP2 = new javax.swing.JButton();
        Pe2BotIN = new javax.swing.JButton();
        Pe2BotS = new javax.swing.JButton();
        Pe2BotHr = new javax.swing.JButton();
        Pe2BotRr = new javax.swing.JButton();
        UUs = new javax.swing.JLabel();
        KKy = new javax.swing.JLabel();
        Pe2BotRr1 = new javax.swing.JButton();
        InP = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        NombS1 = new javax.swing.JLabel();
        ELim1 = new javax.swing.JLabel();
        BuscUs1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        PL3 = new javax.swing.JPanel();
        Text2P5 = new javax.swing.JLabel();
        BuscarN1 = new javax.swing.JTextField();
        PN5 = new javax.swing.JPanel();
        Pe2Use1 = new javax.swing.JTextField();
        InPe3 = new javax.swing.JLabel();
        Pe2Cos1 = new javax.swing.JPasswordField();
        Panel2P3 = new javax.swing.JPanel();
        PeIn5 = new javax.swing.JLabel();
        MaxxP3 = new javax.swing.JButton();
        Pe2BotIN2 = new javax.swing.JButton();
        Pe2BotS2 = new javax.swing.JButton();
        Pe2BotHr1 = new javax.swing.JButton();
        Pe2BotRr3 = new javax.swing.JButton();
        UUs3 = new javax.swing.JLabel();
        KKy3 = new javax.swing.JLabel();
        Pe2BotRr5 = new javax.swing.JButton();
        ELim2 = new javax.swing.JLabel();
        PL1 = new javax.swing.JPanel();
        Text2P7 = new javax.swing.JLabel();
        Pa8 = new javax.swing.JPanel();
        Text2P8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setBackground(new java.awt.Color(0, 102, 102));
        Panel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1I.setBackground(new java.awt.Color(204, 102, 0));
        Panel1I.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel1I.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ingr.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        Ingr.setText("Ingresar al sistema");
        Panel1I.add(Ingr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 30));

        Panel1.add(Panel1I, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 44));

        P1Co.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                P1CoKeyReleased(evt);
            }
        });
        Panel1.add(P1Co, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 160, -1));

        P1Us.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                P1UsKeyReleased(evt);
            }
        });
        Panel1.add(P1Us, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 160, -1));

        InicioP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/INICIOG.gif"))); // NOI18N
        InicioP1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel1.add(InicioP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 250, 450));

        P1BotTr.setBackground(new java.awt.Color(0, 102, 102));
        P1BotTr.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        P1BotTr.setForeground(new java.awt.Color(0, 0, 0));
        P1BotTr.setText("Has olvidado tu contraseña?");
        P1BotTr.setBorder(null);
        P1BotTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1BotTrActionPerformed(evt);
            }
        });
        Panel1.add(P1BotTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        P1BotRr.setBackground(new java.awt.Color(0, 102, 102));
        P1BotRr.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        P1BotRr.setForeground(new java.awt.Color(0, 0, 0));
        P1BotRr.setText("Registrarse");
        P1BotRr.setBorder(null);
        P1BotRr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1BotRrActionPerformed(evt);
            }
        });
        Panel1.add(P1BotRr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 30));

        P1BotIN.setBackground(new java.awt.Color(0, 102, 102));
        P1BotIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iniciar-sesion.png"))); // NOI18N
        P1BotIN.setBorder(null);
        P1BotIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1BotINActionPerformed(evt);
            }
        });
        Panel1.add(P1BotIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 30, 40));

        P1BotSL.setBackground(new java.awt.Color(0, 102, 102));
        P1BotSL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar-sesion.png"))); // NOI18N
        P1BotSL.setBorder(null);
        P1BotSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1BotSLActionPerformed(evt);
            }
        });
        Panel1.add(P1BotSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 30, 40));

        Us.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario (1).png"))); // NOI18N
        Panel1.add(Us, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        Key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/llave (1).png"))); // NOI18N
        Panel1.add(Key, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        P1BotRr1.setBackground(new java.awt.Color(0, 102, 102));
        P1BotRr1.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        P1BotRr1.setForeground(new java.awt.Color(0, 0, 0));
        P1BotRr1.setText("Eliminar Usuario");
        P1BotRr1.setBorder(null);
        P1BotRr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1BotRr1ActionPerformed(evt);
            }
        });
        Panel1.add(P1BotRr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 30));

        getContentPane().add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        Panel3.setBackground(new java.awt.Color(102, 0, 153));
        Panel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel3.setAutoscrolls(true);
        Panel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel3.setPreferredSize(new java.awt.Dimension(552, 397));
        Panel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel3.add(BuscarN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 140, -1));

        NombS.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        NombS.setText("Nombre de Usuario");
        Panel3.add(NombS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        Pa3.setBackground(new java.awt.Color(102, 153, 0));
        Pa3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pa3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text2P3.setFont(new java.awt.Font("Javanese Text", 1, 23)); // NOI18N
        Text2P3.setText("Recuperar contraseña");
        Pa3.add(Text2P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 250, 40));

        Panel3.add(Pa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 670, 40));

        ReC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel3.add(ReC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 250, 410));

        BuscUs.setText("Buscar");
        BuscUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscUsMouseClicked(evt);
            }
        });
        BuscUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscUsActionPerformed(evt);
            }
        });
        Panel3.add(BuscUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        PN3.setBackground(new java.awt.Color(0, 102, 102));
        PN3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PN3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pe3Use.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        Pe3Use.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pe3UseKeyReleased(evt);
            }
        });
        PN3.add(Pe3Use, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 109, -1));

        InPe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/INICIOP.gif"))); // NOI18N
        InPe1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PN3.add(InPe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 0, 80, 160));

        Pe3Cos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pe3CosKeyReleased(evt);
            }
        });
        PN3.add(Pe3Cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 20));

        Panel2P1.setBackground(new java.awt.Color(204, 102, 0));
        Panel2P1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel2P1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PeIn4.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        PeIn4.setText("Ingresar al sistema");
        Panel2P1.add(PeIn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        Maxx3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/maximizar.png"))); // NOI18N
        Maxx3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Maxx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maxx3ActionPerformed(evt);
            }
        });
        Panel2P1.add(Maxx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        PN3.add(Panel2P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 20));

        Pe3BotIN.setBackground(new java.awt.Color(0, 102, 102));
        Pe3BotIN.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        Pe3BotIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iniciar-sesion (1).png"))); // NOI18N
        Pe3BotIN.setBorder(null);
        Pe3BotIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe3BotINActionPerformed(evt);
            }
        });
        PN3.add(Pe3BotIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 20, 20));

        Pe3BotS.setBackground(new java.awt.Color(0, 102, 102));
        Pe3BotS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar-sesion (1).png"))); // NOI18N
        Pe3BotS.setBorder(null);
        Pe3BotS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe3BotSActionPerformed(evt);
            }
        });
        PN3.add(Pe3BotS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 20, 20));

        Pe3BotH.setBackground(new java.awt.Color(0, 102, 102));
        Pe3BotH.setFont(new java.awt.Font("Javanese Text", 1, 9)); // NOI18N
        Pe3BotH.setForeground(new java.awt.Color(0, 0, 0));
        Pe3BotH.setText("Has olvidado tu contraseña?");
        Pe3BotH.setBorder(null);
        Pe3BotH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe3BotHActionPerformed(evt);
            }
        });
        PN3.add(Pe3BotH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        Pe2BotRr2.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotRr2.setFont(new java.awt.Font("Javanese Text", 1, 9)); // NOI18N
        Pe2BotRr2.setForeground(new java.awt.Color(0, 0, 0));
        Pe2BotRr2.setText("Eliminar Usuario");
        Pe2BotRr2.setBorder(null);
        Pe2BotRr2.setBorderPainted(false);
        Pe2BotRr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotRr2ActionPerformed(evt);
            }
        });
        PN3.add(Pe2BotRr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 20));

        UUs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        PN3.add(UUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        KKy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/llave.png"))); // NOI18N
        PN3.add(KKy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Pe3BotR.setBackground(new java.awt.Color(0, 102, 102));
        Pe3BotR.setFont(new java.awt.Font("Javanese Text", 1, 10)); // NOI18N
        Pe3BotR.setForeground(new java.awt.Color(0, 0, 0));
        Pe3BotR.setText("Registrarse");
        Pe3BotR.setBorder(null);
        Pe3BotR.setBorderPainted(false);
        Pe3BotR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe3BotRActionPerformed(evt);
            }
        });
        PN3.add(Pe3BotR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 20));

        Panel3.add(PN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 280, 160));

        getContentPane().add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        Panel4.setBackground(new java.awt.Color(102, 0, 153));
        Panel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel4.setAutoscrolls(true);
        Panel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel4.setPreferredSize(new java.awt.Dimension(552, 397));
        Panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pa4.setBackground(new java.awt.Color(102, 153, 0));
        Pa4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pa4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text2P4.setFont(new java.awt.Font("Javanese Text", 1, 23)); // NOI18N
        Text2P4.setText("Recuperar contraseña");
        Pa4.add(Text2P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 250, 40));

        Panel4.add(Pa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 670, 31));

        ReC1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel4.add(ReC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 250, 420));

        Tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Color", "Nombre de Mascota", "Colegio", "Lugar de trabajo", "Profesiòn", " " }));
        Tipo.setToolTipText("");
        Panel4.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 140, -1));

        ResS1.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        ResS1.setText("Respuesta");
        Panel4.add(ResS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        Busc.setBackground(new java.awt.Color(102, 0, 153));
        Busc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        Busc.setText("Buscar");
        Busc.setBorder(null);
        Busc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Busc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa (1).png"))); // NOI18N
        Busc.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Busc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Busc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscMouseClicked(evt);
            }
        });
        Busc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscActionPerformed(evt);
            }
        });
        Panel4.add(Busc, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 50, 50));

        PregSe1.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        PregSe1.setText("Pregunta de Seguridad ");
        Panel4.add(PregSe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        Panel4.add(BuscarP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 140, -1));

        Rec4.setBackground(new java.awt.Color(255, 204, 0));
        Rec4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Rec4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario:");
        Rec4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));

        RUs.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        RUs.setForeground(new java.awt.Color(0, 0, 0));
        Rec4.add(RUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 100, 20));

        jLabel7.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contraseña:");
        Rec4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 90, 20));

        Rcos.setBackground(new java.awt.Color(0, 0, 0));
        Rcos.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        Rec4.add(Rcos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 110, 20));

        Panel4.add(Rec4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 400, 60));

        Atras.setBackground(new java.awt.Color(102, 0, 153));
        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/flecha-hacia-atras_1.png"))); // NOI18N
        Atras.setBorder(null);
        Atras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/flecha-hacia-atras (1).png"))); // NOI18N
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        Panel4.add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 30, 30));

        PN4.setBackground(new java.awt.Color(0, 102, 102));
        PN4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PN4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InPe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/INICIOP.gif"))); // NOI18N
        InPe2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PN4.add(InPe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 0, 80, 160));

        Panel2P2.setBackground(new java.awt.Color(204, 102, 0));
        Panel2P2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel2P2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PeIn1.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        PeIn1.setText("Ingresar al sistema");
        Panel2P2.add(PeIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        Maxx4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/maximizar.png"))); // NOI18N
        Maxx4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Maxx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maxx4ActionPerformed(evt);
            }
        });
        Panel2P2.add(Maxx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        PN4.add(Panel2P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 20));

        UUs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        PN4.add(UUs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        KKy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/llave.png"))); // NOI18N
        PN4.add(KKy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Pe2BotRr4.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotRr4.setFont(new java.awt.Font("Javanese Text", 1, 10)); // NOI18N
        Pe2BotRr4.setForeground(new java.awt.Color(0, 0, 0));
        Pe2BotRr4.setText("Eliminar Usuario");
        Pe2BotRr4.setBorder(null);
        Pe2BotRr4.setBorderPainted(false);
        Pe2BotRr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotRr4ActionPerformed(evt);
            }
        });
        PN4.add(Pe2BotRr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 20));

        Pe3Use1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        Pe3Use1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pe3Use1KeyReleased(evt);
            }
        });
        PN4.add(Pe3Use1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 109, -1));

        Pe3Cos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pe3Cos1KeyReleased(evt);
            }
        });
        PN4.add(Pe3Cos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 20));

        Pe3BotH1.setBackground(new java.awt.Color(0, 102, 102));
        Pe3BotH1.setFont(new java.awt.Font("Javanese Text", 1, 9)); // NOI18N
        Pe3BotH1.setForeground(new java.awt.Color(0, 0, 0));
        Pe3BotH1.setText("Has olvidado tu contraseña?");
        Pe3BotH1.setBorder(null);
        Pe3BotH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe3BotH1ActionPerformed(evt);
            }
        });
        PN4.add(Pe3BotH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        Pe3BotR1.setBackground(new java.awt.Color(0, 102, 102));
        Pe3BotR1.setFont(new java.awt.Font("Javanese Text", 1, 10)); // NOI18N
        Pe3BotR1.setForeground(new java.awt.Color(0, 0, 0));
        Pe3BotR1.setText("Registrarse");
        Pe3BotR1.setBorder(null);
        Pe3BotR1.setBorderPainted(false);
        Pe3BotR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe3BotR1ActionPerformed(evt);
            }
        });
        PN4.add(Pe3BotR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 20));

        Pe3BotIN1.setBackground(new java.awt.Color(0, 102, 102));
        Pe3BotIN1.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        Pe3BotIN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iniciar-sesion (1).png"))); // NOI18N
        Pe3BotIN1.setBorder(null);
        Pe3BotIN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe3BotIN1ActionPerformed(evt);
            }
        });
        PN4.add(Pe3BotIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 20, 20));

        Pe3BotS1.setBackground(new java.awt.Color(0, 102, 102));
        Pe3BotS1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar-sesion (1).png"))); // NOI18N
        Pe3BotS1.setBorder(null);
        Pe3BotS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe3BotS1ActionPerformed(evt);
            }
        });
        PN4.add(Pe3BotS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 20, 20));

        Panel4.add(PN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 280, 160));

        getContentPane().add(Panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        Panel2.setBackground(new java.awt.Color(153, 153, 255));
        Panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PRJ2.setBackground(new java.awt.Color(0, 153, 255));
        PRJ2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PRJ2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RCos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RCosKeyReleased(evt);
            }
        });
        PRJ2.add(RCos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 160, -1));

        BotG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Guar.png"))); // NOI18N
        BotG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotGActionPerformed(evt);
            }
        });
        PRJ2.add(BotG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 30, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario");
        PRJ2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jLabel3.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contraseña");
        PRJ2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Respuesta");
        PRJ2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Repetir contraseña");
        PRJ2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        PRJ2.add(RPal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 160, -1));

        RUsu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RUsuKeyReleased(evt);
            }
        });
        PRJ2.add(RUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 160, -1));

        Rcosv.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RcosvKeyReleased(evt);
            }
        });
        PRJ2.add(Rcosv, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Pregunta de seguridad");
        PRJ2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 30));

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Color", "Nombre de Mascota", "Colegio", "Lugar de trabajo", "Profesiòn", " " }));
        Combo.setToolTipText("");
        PRJ2.add(Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 160, -1));

        Dis.setFont(new java.awt.Font("Javanese Text", 1, 13)); // NOI18N
        PRJ2.add(Dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 160, 20));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 204)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        Report.setFont(new java.awt.Font("Javanese Text", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PRJ2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 360, 30));

        Panel2.add(PRJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 380, 220));

        PJ2.setBackground(new java.awt.Color(204, 255, 255));
        PJ2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LR.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        LR.setForeground(new java.awt.Color(0, 0, 0));
        LR.setText("Registro de usuarios nuevos");

        javax.swing.GroupLayout PJ2Layout = new javax.swing.GroupLayout(PJ2);
        PJ2.setLayout(PJ2Layout);
        PJ2Layout.setHorizontalGroup(
            PJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PJ2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(LR)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        PJ2Layout.setVerticalGroup(
            PJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PJ2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Panel2.add(PJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        PN2.setBackground(new java.awt.Color(0, 102, 102));
        PN2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PN2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pe2Use.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        Pe2Use.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pe2UseKeyReleased(evt);
            }
        });
        PN2.add(Pe2Use, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 109, -1));

        InPe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/INICIOP.gif"))); // NOI18N
        InPe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PN2.add(InPe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 80, 160));

        Pe2Cos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pe2CosKeyReleased(evt);
            }
        });
        PN2.add(Pe2Cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 20));

        Panel2P.setBackground(new java.awt.Color(204, 102, 0));
        Panel2P.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel2P.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PeIn.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        PeIn.setText("Ingresar al sistema");
        Panel2P.add(PeIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        MaxxP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/maximizar.png"))); // NOI18N
        MaxxP2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MaxxP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxxP2ActionPerformed(evt);
            }
        });
        Panel2P.add(MaxxP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        PN2.add(Panel2P, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 20));

        Pe2BotIN.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotIN.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        Pe2BotIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iniciar-sesion (1).png"))); // NOI18N
        Pe2BotIN.setBorder(null);
        Pe2BotIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotINActionPerformed(evt);
            }
        });
        PN2.add(Pe2BotIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 20, 20));

        Pe2BotS.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar-sesion (1).png"))); // NOI18N
        Pe2BotS.setBorder(null);
        Pe2BotS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotSActionPerformed(evt);
            }
        });
        PN2.add(Pe2BotS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 20, 20));

        Pe2BotHr.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotHr.setFont(new java.awt.Font("Javanese Text", 1, 9)); // NOI18N
        Pe2BotHr.setForeground(new java.awt.Color(0, 0, 0));
        Pe2BotHr.setText("Has olvidado tu contraseña?");
        Pe2BotHr.setBorder(null);
        Pe2BotHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotHrActionPerformed(evt);
            }
        });
        PN2.add(Pe2BotHr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        Pe2BotRr.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotRr.setFont(new java.awt.Font("Javanese Text", 1, 10)); // NOI18N
        Pe2BotRr.setForeground(new java.awt.Color(0, 0, 0));
        Pe2BotRr.setText("Eliminar Usuario");
        Pe2BotRr.setBorder(null);
        Pe2BotRr.setBorderPainted(false);
        Pe2BotRr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotRrActionPerformed(evt);
            }
        });
        PN2.add(Pe2BotRr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 100, 20));

        UUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        PN2.add(UUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        KKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/llave.png"))); // NOI18N
        PN2.add(KKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Pe2BotRr1.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotRr1.setFont(new java.awt.Font("Javanese Text", 1, 10)); // NOI18N
        Pe2BotRr1.setForeground(new java.awt.Color(0, 0, 0));
        Pe2BotRr1.setText("Registrarse");
        Pe2BotRr1.setBorder(null);
        Pe2BotRr1.setBorderPainted(false);
        Pe2BotRr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotRr1ActionPerformed(evt);
            }
        });
        PN2.add(Pe2BotRr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, 20));

        Panel2.add(PN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 280, 160));

        InP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel2.add(InP, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 250, 450));

        getContentPane().add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        Panel5.setBackground(new java.awt.Color(0, 51, 255));
        Panel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel5.setAutoscrolls(true);
        Panel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel5.setPreferredSize(new java.awt.Dimension(552, 397));
        Panel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombS1.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        NombS1.setText("Usuario");
        Panel5.add(NombS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        ELim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Elim1.gif"))); // NOI18N
        ELim1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Panel5.add(ELim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 450));

        BuscUs1.setText("Buscar");
        BuscUs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscUs1MouseClicked(evt);
            }
        });
        BuscUs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscUs1ActionPerformed(evt);
            }
        });
        Panel5.add(BuscUs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PL3.setBackground(new java.awt.Color(255, 102, 0));
        PL3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PL3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text2P5.setFont(new java.awt.Font("Javanese Text", 1, 23)); // NOI18N
        Text2P5.setText("Elimianar Usuario");
        PL3.add(Text2P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 250, 40));

        jPanel2.add(PL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 31));
        jPanel2.add(BuscarN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, -1));

        Panel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 350, 230));

        PN5.setBackground(new java.awt.Color(0, 102, 102));
        PN5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PN5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pe2Use1.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        Pe2Use1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pe2Use1KeyReleased(evt);
            }
        });
        PN5.add(Pe2Use1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 109, -1));

        InPe3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/INICIOP.gif"))); // NOI18N
        InPe3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PN5.add(InPe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 0, 80, 160));

        Pe2Cos1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pe2Cos1KeyReleased(evt);
            }
        });
        PN5.add(Pe2Cos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 20));

        Panel2P3.setBackground(new java.awt.Color(204, 102, 0));
        Panel2P3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel2P3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PeIn5.setFont(new java.awt.Font("Javanese Text", 1, 12)); // NOI18N
        PeIn5.setText("Ingresar al sistema");
        Panel2P3.add(PeIn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        MaxxP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/maximizar.png"))); // NOI18N
        MaxxP3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MaxxP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxxP3ActionPerformed(evt);
            }
        });
        Panel2P3.add(MaxxP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        PN5.add(Panel2P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 20));

        Pe2BotIN2.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotIN2.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        Pe2BotIN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iniciar-sesion (1).png"))); // NOI18N
        Pe2BotIN2.setBorder(null);
        Pe2BotIN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotIN2ActionPerformed(evt);
            }
        });
        PN5.add(Pe2BotIN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 20, 20));

        Pe2BotS2.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cerrar-sesion (1).png"))); // NOI18N
        Pe2BotS2.setBorder(null);
        Pe2BotS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotS2ActionPerformed(evt);
            }
        });
        PN5.add(Pe2BotS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 20, 20));

        Pe2BotHr1.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotHr1.setFont(new java.awt.Font("Javanese Text", 1, 9)); // NOI18N
        Pe2BotHr1.setForeground(new java.awt.Color(0, 0, 0));
        Pe2BotHr1.setText("Has olvidado tu contraseña?");
        Pe2BotHr1.setBorder(null);
        Pe2BotHr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotHr1ActionPerformed(evt);
            }
        });
        PN5.add(Pe2BotHr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        Pe2BotRr3.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotRr3.setFont(new java.awt.Font("Javanese Text", 1, 10)); // NOI18N
        Pe2BotRr3.setForeground(new java.awt.Color(0, 0, 0));
        Pe2BotRr3.setText("Registrarse");
        Pe2BotRr3.setBorder(null);
        Pe2BotRr3.setBorderPainted(false);
        Pe2BotRr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotRr3ActionPerformed(evt);
            }
        });
        PN5.add(Pe2BotRr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 20));

        UUs3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        PN5.add(UUs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        KKy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/llave.png"))); // NOI18N
        PN5.add(KKy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Pe2BotRr5.setBackground(new java.awt.Color(0, 102, 102));
        Pe2BotRr5.setFont(new java.awt.Font("Javanese Text", 1, 10)); // NOI18N
        Pe2BotRr5.setForeground(new java.awt.Color(0, 0, 0));
        Pe2BotRr5.setText("Eliminar Usuario");
        Pe2BotRr5.setBorder(null);
        Pe2BotRr5.setBorderPainted(false);
        Pe2BotRr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pe2BotRr5ActionPerformed(evt);
            }
        });
        PN5.add(Pe2BotRr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 20));

        Panel5.add(PN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 280, 160));

        ELim2.setBorder(new javax.swing.border.MatteBorder(null));
        Panel5.add(ELim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 350, 220));

        PL1.setBackground(new java.awt.Color(255, 102, 0));
        PL1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PL1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text2P7.setFont(new java.awt.Font("Javanese Text", 1, 23)); // NOI18N
        Text2P7.setText("Elimianar Usuario");
        PL1.add(Text2P7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 250, 40));

        Pa8.setBackground(new java.awt.Color(255, 102, 0));
        Pa8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pa8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Text2P8.setFont(new java.awt.Font("Javanese Text", 1, 23)); // NOI18N
        Text2P8.setText("Elimianar Usuario");
        Pa8.add(Text2P8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 250, 40));

        PL1.add(Pa8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 320, 31));

        Panel5.add(PL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 320, 31));

        getContentPane().add(Panel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P1CoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_P1CoKeyReleased
        Pe2Cos.setText(P1Co.getText());
         Pe3Cos.setText(P1Co.getText());
         Pe3Cos1.setText(P1Co.getText());
    }//GEN-LAST:event_P1CoKeyReleased

    private void P1UsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_P1UsKeyReleased
        Pe2Use.setText(P1Us.getText());
        Pe3Use.setText(P1Us.getText());
        Pe3Use1.setText(P1Us.getText());
    }//GEN-LAST:event_P1UsKeyReleased

    private void P1BotTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1BotTrActionPerformed
        Panel4.setVisible(false);
        Panel3.setVisible(true);
        Panel2.setVisible(false);
        Panel1.setVisible(false);
    }//GEN-LAST:event_P1BotTrActionPerformed

    private void P1BotRrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1BotRrActionPerformed
        Panel4.setVisible(false);
        Panel3.setVisible(false);
        Panel2.setVisible(true);
        Panel1.setVisible(false);
    }//GEN-LAST:event_P1BotRrActionPerformed

    private void P1BotINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1BotINActionPerformed
        String Ress;
        Usuario = P1Us.getText();
        Contraseña = P1Co.getText();
        Procesos Lo = new Procesos(Usuario, Contraseña);

        Ress = Lo.Buscar();
        String separador[] = Ress.split(";", 3);
        if (separador[0].equals("Correcto")) {
         JOptionPane.showMessageDialog(null, "Correcto", "Aviso", INFORMATION_MESSAGE);
            this.setVisible(false);
            LeyDeOhm o = new LeyDeOhm();
            o.setVisible(true);
            
        } else {

            String Separado[] = Ress.split("-");
            JOptionPane.showMessageDialog(null, Ress, "Aviso", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_P1BotINActionPerformed

    private void P1BotSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1BotSLActionPerformed
        System.exit(0);
    }//GEN-LAST:event_P1BotSLActionPerformed

    private void RCosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RCosKeyReleased
        CosR = RCos.getText();
        CosV = Rcosv.getText();
        if (CosR.equals(CosV)) {
            Report.setText("Correcto");
            R="LLeno";
        } if(!CosR.equals(CosV)&&!CosV.equals("")){
            Report.setText("Incorrecto");
             R="LLeno";
        }else{
        R="Vacio";
        }
        if (R.equals("Vacio") && CosR.equals("")) {
            Report.setText(null);
        }
    }//GEN-LAST:event_RCosKeyReleased

    private void RcosvKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RcosvKeyReleased
        CosR = RCos.getText();
        CosV = Rcosv.getText();
        
       

        if (CosR.equals(CosV)) {
            Report.setText("Correcto");
            R="LLeno";
        } if(!CosR.equals(CosV)&&!CosR.equals("")){
            Report.setText("Incorrecto");
             R="LLeno";
        }else{
        R="Vacio";
        }
        if(!CosR.equals(CosV)&&CosR.equals("")){
            Report.setText("Incorrecto");
             R="LLeno";
        }else{
        R="Vacio";
        }
    }//GEN-LAST:event_RcosvKeyReleased

    private void Pe2UseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pe2UseKeyReleased
        P1Us.setText(Pe2Use.getText());
        Pe3Use.setText(Pe2Use.getText());
        Pe3Use1.setText(Pe2Use.getText());
        
    }//GEN-LAST:event_Pe2UseKeyReleased

    private void Pe2CosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pe2CosKeyReleased
        P1Co.setText(Pe2Cos.getText());
        Pe3Cos.setText(Pe2Cos.getText());
        Pe3Cos1.setText(Pe2Cos.getText());
        
    }//GEN-LAST:event_Pe2CosKeyReleased

    private void MaxxP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxxP2ActionPerformed

        Panel3.setVisible(false);
        Panel2.setVisible(false);
        Panel1.setVisible(true);
         
    }//GEN-LAST:event_MaxxP2ActionPerformed

    private void Pe2BotINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotINActionPerformed

        String Ress;
        Usuario = Pe2Use.getText();
        Contraseña = Pe2Cos.getText();
        Procesos Lo = new Procesos(Usuario, Contraseña);

        Ress = Lo.Buscar();
        String separador[] = Ress.split(";", 3);
        if (separador[0].equals("Correcto")) {
        JOptionPane.showMessageDialog(null, "0-Correcto", "Aviso", INFORMATION_MESSAGE);
         LeyDeOhm o = new LeyDeOhm();
            o.setVisible(true);
            this.setVisible(false);
        } else {

            String Separado[] = Ress.split("-");
            JOptionPane.showMessageDialog(null, Ress, "Aviso", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_Pe2BotINActionPerformed

    private void Pe2BotSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotSActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Pe2BotSActionPerformed

    private void Pe2BotHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotHrActionPerformed
        Panel4.setVisible(false);
        Panel3.setVisible(true);
        Panel2.setVisible(false);
        Panel1.setVisible(false);

    }//GEN-LAST:event_Pe2BotHrActionPerformed

    private void Pe2BotRrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotRrActionPerformed
        Panel4.setVisible(false);
        Panel3.setVisible(false);
        Panel2.setVisible(true);
        Panel1.setVisible(false);
    }//GEN-LAST:event_Pe2BotRrActionPerformed

    private void BotGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotGActionPerformed
       
        String Res;
        RUsuario = RUsu.getText();
        RContraseña = RCos.getText();
        RPalabra = RPal.getText();
        RContraseñaV = Rcosv.getText();
        Preg = Combo.getSelectedItem().toString();

       
        if(T.equals("Si")){
             Procesos LO = new Procesos(RUsuario, RContraseña, Preg, RPalabra);
         Res = LO.guardar();
        JOptionPane.showMessageDialog(null, Res, "Aviso", INFORMATION_MESSAGE);
        }else{
        JOptionPane.showMessageDialog(null,"No es Posible Guardar Favor Introducir un Usuario no Existente", "Aviso", ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_BotGActionPerformed

    private void BuscUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscUsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscUsMouseClicked

    private void BuscUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscUsActionPerformed
         String Ress;
        Usuario = BuscarN.getText(); 
            
      Procesos Lo = new Procesos(Usuario);

        Ress = Lo.BuscarUP();
        String separador[] = Ress.split(";", 2);
        if (separador[0].equals("Correcto")) {
    JOptionPane.showMessageDialog(null,"0-Correcto", "Aviso", INFORMATION_MESSAGE);
        Panel3.setVisible(false);
        Panel4.setVisible(true);
           
           
        } else {

            String Separado[] = Ress.split("-");
            JOptionPane.showMessageDialog(null, Ress, "Aviso", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_BuscUsActionPerformed

    private void Pe3Use1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pe3Use1KeyReleased
          P1Us.setText(Pe3Use1.getText());
          Pe2Use.setText(Pe3Use1.getText());
          Pe3Use.setText(Pe3Use1.getText());

    }//GEN-LAST:event_Pe3Use1KeyReleased

    private void Pe3Cos1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pe3Cos1KeyReleased
        P1Co.setText(Pe3Cos1.getText());
        Pe2Cos.setText(Pe3Cos1.getText());
        Pe3Cos.setText(Pe3Cos1.getText());
    }//GEN-LAST:event_Pe3Cos1KeyReleased

    private void Maxx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maxx4ActionPerformed
        Panel4.setVisible(false);
        Panel3.setVisible(false);
        Panel2.setVisible(false);
        Panel1.setVisible(true);      
    }//GEN-LAST:event_Maxx4ActionPerformed

    private void Pe3BotIN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe3BotIN1ActionPerformed
       String Ress;
        Usuario = Pe3Use.getText();
        Contraseña = Pe3Cos.getText();
      Procesos Lo = new Procesos(Usuario, Contraseña);

        Ress = Lo.Buscar();
        String separador[] = Ress.split(";", 3);
        if (separador[0].equals("Correcto")) {
    JOptionPane.showMessageDialog(null, "0-Correcto", "Aviso", INFORMATION_MESSAGE);
     LeyDeOhm o = new LeyDeOhm();
            o.setVisible(true);
            this.setVisible(false);
        } else {

            String Separado[] = Ress.split("-");
            JOptionPane.showMessageDialog(null, Ress, "Aviso", ERROR_MESSAGE);

        }      
        
        
        
    }//GEN-LAST:event_Pe3BotIN1ActionPerformed

    private void Pe3BotS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe3BotS1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_Pe3BotS1ActionPerformed

    private void Pe3BotH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe3BotH1ActionPerformed
        Panel4.setVisible(false);
        Panel3.setVisible(true);
        Panel2.setVisible(false);
        Panel1.setVisible(false);
        
    }//GEN-LAST:event_Pe3BotH1ActionPerformed

    private void Pe3BotR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe3BotR1ActionPerformed
       Panel4.setVisible(false);
        Panel3.setVisible(false);
        Panel2.setVisible(true);
        Panel1.setVisible(false);
    }//GEN-LAST:event_Pe3BotR1ActionPerformed

    private void BuscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscMouseClicked

    private void BuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscActionPerformed
          String Ress;
        RrPalabra = BuscarP4.getText(); 
        RrPregunta = Tipo.getSelectedItem().toString();
      
      Procesos Lo = new Procesos(Usuario,RrPalabra,RrPregunta);

        Ress = Lo.BuscarUPR();
        String separador[] = Ress.split(";", 4);
        if (separador[0].equals("Correcto")) {
    JOptionPane.showMessageDialog(null,"0-Correcto", "Aviso", INFORMATION_MESSAGE);
         Rec4.setVisible(true);
      
    
           RUs.setText(separador[1]);
           Rcos.setText(separador[2]);
           
        } else {

            String Separador[] = Ress.split("-");
            JOptionPane.showMessageDialog(null, Ress, "Aviso", ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_BuscActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        Panel4.setVisible(false);
         Panel3.setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    private void RUsuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RUsuKeyReleased
 String Ress;
 String F = null;
        Usuario = RUsu.getText(); 
            
      Procesos Lo = new Procesos(Usuario);

        Ress = Lo.BuscarUP();
        String separador[] = Ress.split(";", 2);
        if (separador[0].equals("Correcto")) {
     Dis.setText("Usuario no Disponible");
     T="No";
       BotG.setIcon(new ImageIcon("src\\Recursos\\guardar_1.png"));
        } if(!separador[0].equals("Correcto") && !separador[0].equals("")) {

            Dis.setText("Usuario Disponible");
            
            T = "Si";
BotG.setIcon(new ImageIcon("src\\Recursos\\Guar.png"));
        } if(separador[0].equals("1-Nombre de Usuario Vacio")){
         Dis.setText(null);
        }   
    }//GEN-LAST:event_RUsuKeyReleased

    private void BuscUs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscUs1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscUs1MouseClicked

    private void BuscUs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscUs1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscUs1ActionPerformed

    private void P1BotRr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1BotRr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P1BotRr1ActionPerformed

    private void Pe2BotRr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotRr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2BotRr1ActionPerformed

    private void Pe3UseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pe3UseKeyReleased
         P1Us.setText(Pe3Use.getText());
        Pe2Use.setText(Pe3Use.getText());
        Pe3Use1.setText(Pe3Use.getText());
    }//GEN-LAST:event_Pe3UseKeyReleased

    private void Pe3CosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pe3CosKeyReleased
     P1Co.setText(Pe3Cos.getText());
        Pe2Cos.setText(Pe3Cos.getText());
        Pe3Cos1.setText(Pe3Cos.getText());
    }//GEN-LAST:event_Pe3CosKeyReleased

    private void Maxx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maxx3ActionPerformed
     Panel4.setVisible(false);
        Panel3.setVisible(false);
        Panel2.setVisible(false);
        Panel1.setVisible(true);
    }//GEN-LAST:event_Maxx3ActionPerformed

    private void Pe3BotINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe3BotINActionPerformed
      String Ress;
        Usuario = Pe3Use.getText();
        Contraseña = Pe3Cos.getText();
        Procesos Lo = new Procesos(Usuario, Contraseña);

        Ress = Lo.Buscar();
        String separador[] = Ress.split(";", 3);
        if (separador[0].equals("Correcto")) {
            JOptionPane.showMessageDialog(null, "0-Correcto", "Aviso", INFORMATION_MESSAGE);
            LeyDeOhm o = new LeyDeOhm();
            o.setVisible(true);
            this.setVisible(false);
        } else {

            String Separado[] = Ress.split("-");
            JOptionPane.showMessageDialog(null, Ress, "Aviso", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_Pe3BotINActionPerformed

    private void Pe3BotSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe3BotSActionPerformed
       System.exit(0);
    }//GEN-LAST:event_Pe3BotSActionPerformed

    private void Pe3BotHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe3BotHActionPerformed
        Panel3.setVisible(true);
        Panel2.setVisible(false);
        Panel1.setVisible(false);
    }//GEN-LAST:event_Pe3BotHActionPerformed

    private void Pe2BotRr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotRr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2BotRr2ActionPerformed

    private void Pe3BotRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe3BotRActionPerformed
        Panel3.setVisible(false);
        Panel2.setVisible(true);
        Panel1.setVisible(false);
    }//GEN-LAST:event_Pe3BotRActionPerformed

    private void Pe2BotRr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotRr4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2BotRr4ActionPerformed

    private void Pe2Use1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pe2Use1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2Use1KeyReleased

    private void Pe2Cos1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pe2Cos1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2Cos1KeyReleased

    private void MaxxP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxxP3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxxP3ActionPerformed

    private void Pe2BotIN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotIN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2BotIN2ActionPerformed

    private void Pe2BotS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2BotS2ActionPerformed

    private void Pe2BotHr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotHr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2BotHr1ActionPerformed

    private void Pe2BotRr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotRr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2BotRr3ActionPerformed

    private void Pe2BotRr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pe2BotRr5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pe2BotRr5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton BotG;
    private javax.swing.JButton Busc;
    private javax.swing.JButton BuscUs;
    private javax.swing.JButton BuscUs1;
    private javax.swing.JTextField BuscarN;
    private javax.swing.JTextField BuscarN1;
    private javax.swing.JTextField BuscarP4;
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JLabel Dis;
    private javax.swing.JLabel ELim1;
    private javax.swing.JLabel ELim2;
    private javax.swing.JLabel InP;
    private javax.swing.JLabel InPe;
    private javax.swing.JLabel InPe1;
    private javax.swing.JLabel InPe2;
    private javax.swing.JLabel InPe3;
    private javax.swing.JLabel Ingr;
    private javax.swing.JLabel InicioP1;
    private javax.swing.JLabel KKy;
    private javax.swing.JLabel KKy1;
    private javax.swing.JLabel KKy2;
    private javax.swing.JLabel KKy3;
    private javax.swing.JLabel Key;
    private javax.swing.JLabel LR;
    private javax.swing.JButton Maxx3;
    private javax.swing.JButton Maxx4;
    private javax.swing.JButton MaxxP2;
    private javax.swing.JButton MaxxP3;
    private javax.swing.JLabel NombS;
    private javax.swing.JLabel NombS1;
    private javax.swing.JButton P1BotIN;
    private javax.swing.JButton P1BotRr;
    private javax.swing.JButton P1BotRr1;
    private javax.swing.JButton P1BotSL;
    private javax.swing.JButton P1BotTr;
    private javax.swing.JPasswordField P1Co;
    private javax.swing.JTextField P1Us;
    private javax.swing.JPanel PJ2;
    private javax.swing.JPanel PL1;
    private javax.swing.JPanel PL3;
    private javax.swing.JPanel PN2;
    private javax.swing.JPanel PN3;
    private javax.swing.JPanel PN4;
    private javax.swing.JPanel PN5;
    private javax.swing.JPanel PRJ2;
    private javax.swing.JPanel Pa3;
    private javax.swing.JPanel Pa4;
    private javax.swing.JPanel Pa8;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel1I;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel2P;
    private javax.swing.JPanel Panel2P1;
    private javax.swing.JPanel Panel2P2;
    private javax.swing.JPanel Panel2P3;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JButton Pe2BotHr;
    private javax.swing.JButton Pe2BotHr1;
    private javax.swing.JButton Pe2BotIN;
    private javax.swing.JButton Pe2BotIN2;
    private javax.swing.JButton Pe2BotRr;
    private javax.swing.JButton Pe2BotRr1;
    private javax.swing.JButton Pe2BotRr2;
    private javax.swing.JButton Pe2BotRr3;
    private javax.swing.JButton Pe2BotRr4;
    private javax.swing.JButton Pe2BotRr5;
    private javax.swing.JButton Pe2BotS;
    private javax.swing.JButton Pe2BotS2;
    private javax.swing.JPasswordField Pe2Cos;
    private javax.swing.JPasswordField Pe2Cos1;
    private javax.swing.JTextField Pe2Use;
    private javax.swing.JTextField Pe2Use1;
    private javax.swing.JButton Pe3BotH;
    private javax.swing.JButton Pe3BotH1;
    private javax.swing.JButton Pe3BotIN;
    private javax.swing.JButton Pe3BotIN1;
    private javax.swing.JButton Pe3BotR;
    private javax.swing.JButton Pe3BotR1;
    private javax.swing.JButton Pe3BotS;
    private javax.swing.JButton Pe3BotS1;
    private javax.swing.JPasswordField Pe3Cos;
    private javax.swing.JPasswordField Pe3Cos1;
    private javax.swing.JTextField Pe3Use;
    private javax.swing.JTextField Pe3Use1;
    private javax.swing.JLabel PeIn;
    private javax.swing.JLabel PeIn1;
    private javax.swing.JLabel PeIn4;
    private javax.swing.JLabel PeIn5;
    private javax.swing.JLabel PregSe1;
    private javax.swing.JPasswordField RCos;
    private javax.swing.JTextField RPal;
    private javax.swing.JLabel RUs;
    private javax.swing.JTextField RUsu;
    private javax.swing.JLabel Rcos;
    private javax.swing.JPasswordField Rcosv;
    private javax.swing.JLabel ReC;
    private javax.swing.JLabel ReC1;
    private javax.swing.JPanel Rec4;
    private javax.swing.JLabel Report;
    private javax.swing.JLabel ResS1;
    private javax.swing.JLabel Text2P3;
    private javax.swing.JLabel Text2P4;
    private javax.swing.JLabel Text2P5;
    private javax.swing.JLabel Text2P7;
    private javax.swing.JLabel Text2P8;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JLabel UUs;
    private javax.swing.JLabel UUs1;
    private javax.swing.JLabel UUs2;
    private javax.swing.JLabel UUs3;
    private javax.swing.JLabel Us;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
