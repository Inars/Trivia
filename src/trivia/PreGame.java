package trivia;

public class PreGame {
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFrame startup;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSinglePlayer;
    private javax.swing.JButton btnMultiPlayer;
    private javax.swing.JLabel lblLogo;
    
    public PreGame(javax.swing.JPanel jPanel1, javax.swing.JFrame startup){
        this.jPanel1 = jPanel1;
        this.startup = startup;
        jPanel1.removeAll();
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="initComponents"> 
    @SuppressWarnings("unchecked")
    private void initComponents() {
        btnBack = new javax.swing.JButton();
        btnSinglePlayer  = new javax.swing.JButton();
        btnMultiPlayer  = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trivia4.jpg")));
        
        btnBack.setBackground(new java.awt.Color(19, 19, 19));
        btnBack.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48));
        btnBack.setForeground(new java.awt.Color(0, 153, 0));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back(evt);
            }
        });
        
        btnSinglePlayer.setBackground(new java.awt.Color(19, 19, 19));
        btnSinglePlayer.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48));
        btnSinglePlayer.setForeground(new java.awt.Color(0, 153, 0));
        btnSinglePlayer.setText("Play VS Machine");
        btnSinglePlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSinglePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinglePlayer(evt);
            }
        });
        
        btnMultiPlayer.setBackground(new java.awt.Color(19, 19, 19));
        btnMultiPlayer.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48));
        btnMultiPlayer.setForeground(new java.awt.Color(0, 153, 0));
        btnMultiPlayer.setText("Play VS Human");
        btnMultiPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMultiPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiPlayer(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSinglePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 225, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 225, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 225))
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
                .addComponent(btnSinglePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMultiPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        
        startup.pack();
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="reInitComponents"> 
    @SuppressWarnings("unchecked")
    private void reInitComponents() {                  
        javax.swing.JButton btnExit;
        javax.swing.JButton btnNewGame;
        javax.swing.JButton btnViewScores;
        
        lblLogo = new javax.swing.JLabel();
        
        btnViewScores = new javax.swing.JButton();
        btnNewGame = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

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

        startup.pack();
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Back">
    private void Back(java.awt.event.ActionEvent evt) {                                        
        jPanel1.removeAll();
        reInitComponents();
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="NewGame">
    private void NewGame(java.awt.event.ActionEvent evt) {                                           
        jPanel1.removeAll();
        initComponents();
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="ViewScores">
    private void ViewScores(java.awt.event.ActionEvent evt) {  
        InsertScores();
        ViewScores viewScores = new ViewScores(jPanel1,startup);
    }//</editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="InsertScores">
    private void InsertScores(){
        try{
            SQL.startConnection();
            SQL.execute("delete from playerscores");
            java.sql.ResultSet rs = SQL.select("select * from view_playerscores");
            while(rs.next()){
                SQL.execute("insert into playerscores values('" + rs.getInt("ID") + "','" + rs.getString("Player") + "','" + rs.getInt("CorrectAnswers") + "','" + rs.getString("FinalScore") + "')");
            }
            SQL.endConnection();
        }catch(java.sql.SQLException ex){
            System.err.println(ex.getMessage());
        }
    }//</editor-fold>                                            
    
    // <editor-fold defaultstate="collapsed" desc="Exit">
    private void Exit(java.awt.event.ActionEvent evt) {                                        
        startup.dispose();
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="SinglePlayer">
    private void SinglePlayer(java.awt.event.ActionEvent evt) {                                        
        PreGameSettings initiatePreGameSettings = new PreGameSettings(startup, true, startup);
        initiatePreGameSettings.setLocation((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 479, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height / 2) - 83);
        initiatePreGameSettings.setVisible(true);
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="MultiPlayer">
    private void MultiPlayer(java.awt.event.ActionEvent evt) {                                        
        PreGameSettings initiatePreGameSettings = new PreGameSettings(startup, false, startup);
        initiatePreGameSettings.setLocation((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 479, (java.awt.Toolkit.getDefaultToolkit().getScreenSize().height / 2) - 83);
        initiatePreGameSettings.setVisible(true);
    }//</editor-fold>
}
