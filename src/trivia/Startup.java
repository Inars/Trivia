package trivia;

public class Startup extends javax.swing.JFrame {                   
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnViewScores;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel jPanel1;
    private static java.awt.GraphicsDevice device = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
    
    public Startup(){
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="initComponents"> 
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnViewScores = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        device.setFullScreenWindow(this);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trivia4.jpg")));

        btnViewScores.setBackground(new java.awt.Color(19, 19, 19));
        btnViewScores.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48));
        btnViewScores.setForeground(new java.awt.Color(0, 153, 0));
        btnViewScores.setText("View Scores");
        btnViewScores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewScores(evt);
            }
        });

        btnNewGame.setBackground(new java.awt.Color(19, 19, 19));
        btnNewGame.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48));
        btnNewGame.setForeground(new java.awt.Color(0, 153, 0));
        btnNewGame.setText("New Game");
        btnNewGame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGame(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(19, 19, 19));
        btnExit.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48));
        btnExit.setForeground(new java.awt.Color(0, 153, 0));
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewScores, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 194, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 194, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 194))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 320, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 320, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 320)
                .addComponent(lblLogo)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewScores, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, java.awt.Toolkit.getDefaultToolkit().getScreenSize().width, java.awt.Toolkit.getDefaultToolkit().getScreenSize().width,  java.awt.Toolkit.getDefaultToolkit().getScreenSize().width)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height)
        );
        pack();
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="NewGame">
    private void NewGame(java.awt.event.ActionEvent evt) {                                           
        PreGame initiatePreGame = new PreGame(jPanel1, this);
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="ViewScores">
    private void ViewScores(java.awt.event.ActionEvent evt) {                                              
        
    }//</editor-fold>                                            
    
    // <editor-fold defaultstate="collapsed" desc="Exit">
    private void Exit(java.awt.event.ActionEvent evt) {                                        
        dispose();
    }//</editor-fold>
}
