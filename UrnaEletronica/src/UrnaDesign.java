
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Yasmin
 */
public class UrnaDesign extends javax.swing.JFrame {

  Candidatos c = new Candidatos();

    public UrnaDesign() {
        initComponents();

        setResizable(false);
        setLayout(null);

        painel.setLayout(null);

        backurna.setSize(569, 434);
        backurna.setLocation(20, 52);
        backurna.setLayout(null);

        cargo1.setLocation(390, 50);

        votolegendamini.setLocation(440, 390);

        c.labelsiniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        branco = new javax.swing.JButton();
        confirma = new javax.swing.JButton();
        corrige = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        digitoum = new javax.swing.JButton();
        digitonove = new javax.swing.JButton();
        digitoseis = new javax.swing.JButton();
        digitotres = new javax.swing.JButton();
        digitooito = new javax.swing.JButton();
        digitozero = new javax.swing.JButton();
        digitosete = new javax.swing.JButton();
        digitoquatro = new javax.swing.JButton();
        digitodois = new javax.swing.JButton();
        digitocinco = new javax.swing.JButton();
        backurna = new javax.swing.JPanel();
        cargomaximo = new javax.swing.JLabel();
        seuvotopara = new javax.swing.JLabel();
        partido = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        partidoescolhido = new javax.swing.JLabel();
        linha = new javax.swing.JSeparator();
        aperteatecla = new javax.swing.JLabel();
        confirmaprossegue = new javax.swing.JLabel();
        corrigereinicia = new javax.swing.JLabel();
        votolegendamini = new javax.swing.JLabel();
        cargo2 = new javax.swing.JLabel();
        cargo3 = new javax.swing.JLabel();
        cargo1 = new javax.swing.JLabel();
        labelcargo2 = new javax.swing.JLabel();
        labelcargo3 = new javax.swing.JLabel();
        primeirodig = new javax.swing.JTextField();
        segundodig = new javax.swing.JTextField();
        quartodig = new javax.swing.JTextField();
        terceirodig = new javax.swing.JTextField();
        quintodig = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        nomecandidato = new javax.swing.JLabel();
        votodelegenda = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mostracandidatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel.setBackground(new java.awt.Color(210, 205, 186));
        painel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                painelMouseEntered(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        branco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        branco.setText("BRANCO");
        branco.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        branco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brancoActionPerformed(evt);
            }
        });

        confirma.setBackground(new java.awt.Color(68, 195, 118));
        confirma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirma.setText("CONFIRMA");
        confirma.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        corrige.setBackground(new java.awt.Color(249, 167, 91));
        corrige.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        corrige.setText("CORRIGE");
        corrige.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        corrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corrigeActionPerformed(evt);
            }
        });

        digitoum.setBackground(new java.awt.Color(0, 0, 0));
        digitoum.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitoum.setForeground(new java.awt.Color(255, 255, 255));
        digitoum.setText("1");
        digitoum.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitoum.setContentAreaFilled(false);
        digitoum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitoumActionPerformed(evt);
            }
        });

        digitonove.setBackground(new java.awt.Color(0, 0, 0));
        digitonove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitonove.setForeground(new java.awt.Color(255, 255, 255));
        digitonove.setText("9");
        digitonove.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitonove.setContentAreaFilled(false);
        digitonove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitonoveActionPerformed(evt);
            }
        });

        digitoseis.setBackground(new java.awt.Color(0, 0, 0));
        digitoseis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitoseis.setForeground(new java.awt.Color(255, 255, 255));
        digitoseis.setText("6");
        digitoseis.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitoseis.setContentAreaFilled(false);
        digitoseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitoseisActionPerformed(evt);
            }
        });

        digitotres.setBackground(new java.awt.Color(0, 0, 0));
        digitotres.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitotres.setForeground(new java.awt.Color(255, 255, 255));
        digitotres.setText("3");
        digitotres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitotres.setContentAreaFilled(false);
        digitotres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitotresActionPerformed(evt);
            }
        });

        digitooito.setBackground(new java.awt.Color(0, 0, 0));
        digitooito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitooito.setForeground(new java.awt.Color(255, 255, 255));
        digitooito.setText("8");
        digitooito.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitooito.setContentAreaFilled(false);
        digitooito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitooitoActionPerformed(evt);
            }
        });

        digitozero.setBackground(new java.awt.Color(0, 0, 0));
        digitozero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitozero.setForeground(new java.awt.Color(255, 255, 255));
        digitozero.setText("0");
        digitozero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitozero.setContentAreaFilled(false);
        digitozero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitozeroActionPerformed(evt);
            }
        });

        digitosete.setBackground(new java.awt.Color(0, 0, 0));
        digitosete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitosete.setForeground(new java.awt.Color(255, 255, 255));
        digitosete.setText("7");
        digitosete.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitosete.setContentAreaFilled(false);
        digitosete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitoseteActionPerformed(evt);
            }
        });

        digitoquatro.setBackground(new java.awt.Color(0, 0, 0));
        digitoquatro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitoquatro.setForeground(new java.awt.Color(255, 255, 255));
        digitoquatro.setText("4");
        digitoquatro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitoquatro.setContentAreaFilled(false);
        digitoquatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitoquatroActionPerformed(evt);
            }
        });

        digitodois.setBackground(new java.awt.Color(0, 0, 0));
        digitodois.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitodois.setForeground(new java.awt.Color(255, 255, 255));
        digitodois.setText("2");
        digitodois.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitodois.setContentAreaFilled(false);
        digitodois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitodoisActionPerformed(evt);
            }
        });

        digitocinco.setBackground(new java.awt.Color(0, 0, 0));
        digitocinco.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        digitocinco.setForeground(new java.awt.Color(255, 255, 255));
        digitocinco.setText("5");
        digitocinco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        digitocinco.setContentAreaFilled(false);
        digitocinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitocincoActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(digitoum, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(digitonove, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(digitoseis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(digitotres, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(digitooito, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(digitozero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(digitosete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(digitoquatro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(digitodois, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(digitocinco, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(digitoquatro, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(digitocinco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(digitoseis, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                            .addComponent(digitoum, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(digitodois, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(digitotres, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(digitosete, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(digitozero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(digitooito, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(digitonove, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitodois, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitotres, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitoum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitocinco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitoseis, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitoquatro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitooito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitonove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digitosete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(digitozero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(branco, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(corrige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirma)
                        .addGap(15, 15, 15))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLayeredPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(branco, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(corrige, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        backurna.setBackground(new java.awt.Color(255, 255, 255));

        cargomaximo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        cargomaximo.setText("Deputado Federal");

        seuvotopara.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seuvotopara.setText("SEU VOTO PARA");

        partido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        partido.setText("Partido:");

        numero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numero.setText("Número:");

        partidoescolhido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        partidoescolhido.setText("BT");

        linha.setBackground(new java.awt.Color(0, 0, 0));
        linha.setForeground(new java.awt.Color(0, 0, 0));
        linha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 100));

        aperteatecla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aperteatecla.setText("Aperte a tecla:");

        confirmaprossegue.setText("CONFIRMA para PROSSEGUIR");

        corrigereinicia.setText("CORRIGE para REINICIAR este voto");

        votolegendamini.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        votolegendamini.setText("(voto de legenda)");

        cargo2.setBackground(new java.awt.Color(204, 204, 204));
        cargo2.setOpaque(true);

        cargo3.setBackground(new java.awt.Color(204, 204, 204));
        cargo3.setOpaque(true);

        cargo1.setBackground(new java.awt.Color(102, 102, 102));
        cargo1.setAlignmentX(0.5F);
        cargo1.setOpaque(true);

        labelcargo2.setText("Primeiro Suplente");

        labelcargo3.setText("Segundo Suplente");

        primeirodig.setEditable(false);
        primeirodig.setBackground(new java.awt.Color(255, 255, 255));
        primeirodig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        primeirodig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        primeirodig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        primeirodig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        segundodig.setEditable(false);
        segundodig.setBackground(new java.awt.Color(255, 255, 255));
        segundodig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        segundodig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        segundodig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        segundodig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        quartodig.setEditable(false);
        quartodig.setBackground(new java.awt.Color(255, 255, 255));
        quartodig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quartodig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quartodig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quartodig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        terceirodig.setEditable(false);
        terceirodig.setBackground(new java.awt.Color(255, 255, 255));
        terceirodig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        terceirodig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        terceirodig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        terceirodig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        terceirodig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terceirodigActionPerformed(evt);
            }
        });

        quintodig.setEditable(false);
        quintodig.setBackground(new java.awt.Color(255, 255, 255));
        quintodig.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quintodig.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quintodig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        quintodig.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nome.setText("Nome:");

        nomecandidato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomecandidato.setText("BT");

        votodelegenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        votodelegenda.setText("voto de legenda");

        javax.swing.GroupLayout backurnaLayout = new javax.swing.GroupLayout(backurna);
        backurna.setLayout(backurnaLayout);
        backurnaLayout.setHorizontalGroup(
            backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linha)
            .addGroup(backurnaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backurnaLayout.createSequentialGroup()
                        .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aperteatecla, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(corrigereinicia))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backurnaLayout.createSequentialGroup()
                        .addComponent(confirmaprossegue, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(votolegendamini)
                        .addGap(18, 18, 18))))
            .addGroup(backurnaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backurnaLayout.createSequentialGroup()
                        .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(backurnaLayout.createSequentialGroup()
                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomecandidato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cargomaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backurnaLayout.createSequentialGroup()
                        .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backurnaLayout.createSequentialGroup()
                                .addComponent(partido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(partidoescolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(votodelegenda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backurnaLayout.createSequentialGroup()
                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(primeirodig, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(segundodig, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(terceirodig, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quartodig, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quintodig, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backurnaLayout.createSequentialGroup()
                        .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelcargo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cargo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelcargo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cargo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backurnaLayout.createSequentialGroup()
                        .addComponent(cargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
            .addGroup(backurnaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(seuvotopara, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backurnaLayout.setVerticalGroup(
            backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backurnaLayout.createSequentialGroup()
                .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backurnaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(seuvotopara, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(cargomaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backurnaLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(cargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backurnaLayout.createSequentialGroup()
                        .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cargo2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargo3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backurnaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(primeirodig, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segundodig, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quartodig, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(terceirodig, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quintodig, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomecandidato, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backurnaLayout.createSequentialGroup()
                        .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelcargo2)
                            .addComponent(labelcargo3)
                            .addComponent(partido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partidoescolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backurnaLayout.createSequentialGroup()
                        .addComponent(votodelegenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(linha, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aperteatecla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backurnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmaprossegue)
                    .addComponent(votolegendamini))
                .addGap(4, 4, 4)
                .addComponent(corrigereinicia)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BrasãoRepúblicadoBrasil.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JUSTIÇA \nELEITORAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mostracandidatos.setText("Ver Candidatos");
        mostracandidatos.setBorder(null);
        mostracandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostracandidatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mostracandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(backurna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(mostracandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(backurna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void digitozeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitozeroActionPerformed
        c.digitar(digitozero);
    }//GEN-LAST:event_digitozeroActionPerformed

    private void digitooitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitooitoActionPerformed
        c.digitar(digitooito);
    }//GEN-LAST:event_digitooitoActionPerformed

    private void digitonoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitonoveActionPerformed
        c.digitar(digitonove);
    }//GEN-LAST:event_digitonoveActionPerformed

    private void digitoseteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitoseteActionPerformed
        c.digitar(digitosete);
    }//GEN-LAST:event_digitoseteActionPerformed

    private void digitocincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitocincoActionPerformed
        c.digitar(digitocinco);
    }//GEN-LAST:event_digitocincoActionPerformed

    private void digitoseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitoseisActionPerformed
        c.digitar(digitoseis);
    }//GEN-LAST:event_digitoseisActionPerformed

    private void digitoquatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitoquatroActionPerformed
        c.digitar(digitoquatro);
    }//GEN-LAST:event_digitoquatroActionPerformed

    private void digitoumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitoumActionPerformed
        c.digitar(digitoum);
    }//GEN-LAST:event_digitoumActionPerformed

    private void digitotresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitotresActionPerformed
        c.digitar(digitotres);
    }//GEN-LAST:event_digitotresActionPerformed

    private void digitodoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitodoisActionPerformed
        c.digitar(digitodois);
    }//GEN-LAST:event_digitodoisActionPerformed

    private void painelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_painelMouseEntered

    private void brancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brancoActionPerformed

    private void mostracandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostracandidatosActionPerformed
        new ListaCandidatos(null, true).show();
    }//GEN-LAST:event_mostracandidatosActionPerformed

    private void terceirodigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terceirodigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terceirodigActionPerformed

    private void corrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corrigeActionPerformed
        c.corrige(corrige);
    }//GEN-LAST:event_corrigeActionPerformed

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
            java.util.logging.Logger.getLogger(UrnaDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrnaDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrnaDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrnaDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrnaDesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel aperteatecla;
    public static javax.swing.JPanel backurna;
    private javax.swing.JButton branco;
    public static javax.swing.JLabel cargo1;
    public static javax.swing.JLabel cargo2;
    public static javax.swing.JLabel cargo3;
    public static javax.swing.JLabel cargomaximo;
    private javax.swing.JButton confirma;
    public static javax.swing.JLabel confirmaprossegue;
    private javax.swing.JButton corrige;
    public static javax.swing.JLabel corrigereinicia;
    public static javax.swing.JButton digitocinco;
    public static javax.swing.JButton digitodois;
    public static javax.swing.JButton digitonove;
    public static javax.swing.JButton digitooito;
    public static javax.swing.JButton digitoquatro;
    public static javax.swing.JButton digitoseis;
    public static javax.swing.JButton digitosete;
    public static javax.swing.JButton digitotres;
    public static javax.swing.JButton digitoum;
    public static javax.swing.JButton digitozero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel labelcargo2;
    public static javax.swing.JLabel labelcargo3;
    public static javax.swing.JSeparator linha;
    private javax.swing.JButton mostracandidatos;
    public static javax.swing.JLabel nome;
    public static javax.swing.JLabel nomecandidato;
    public static javax.swing.JLabel numero;
    private javax.swing.JPanel painel;
    public static javax.swing.JLabel partido;
    public static javax.swing.JLabel partidoescolhido;
    public static javax.swing.JTextField primeirodig;
    public static javax.swing.JTextField quartodig;
    public static javax.swing.JTextField quintodig;
    public static javax.swing.JTextField segundodig;
    public static javax.swing.JLabel seuvotopara;
    public static javax.swing.JTextField terceirodig;
    public static javax.swing.JLabel votodelegenda;
    public static javax.swing.JLabel votolegendamini;
    // End of variables declaration//GEN-END:variables
}
