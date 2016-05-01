package trivia;

public class PreGameSettings extends javax.swing.JDialog {
    private javax.swing.JFrame startup;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnCancel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel lblPlayer2Name;
    private javax.swing.JTextField txtName2;
    private boolean isSinglePlayer;
    
    public PreGameSettings(java.awt.Frame parent, boolean isSinglePlayer, javax.swing.JFrame startup){
        super(parent,true);
        this.isSinglePlayer = isSinglePlayer;
        this.startup = startup;
        if (this.isSinglePlayer) {
            initSinglePlayer();
        }else{
            initMultiPlayer();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="initSinglePlayer">                          
    private void initSinglePlayer() {
        jPanel1 = new javax.swing.JPanel();
        lblPlayerName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPlayerName.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        lblPlayerName.setForeground(new java.awt.Color(0, 156, 0));
        lblPlayerName.setText("Player");

        txtName.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 156, 0));

        btnStart.setBackground(new java.awt.Color(19, 19, 19));
        btnStart.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 156, 0));
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartSinglePlayer(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(19, 19, 19));
        btnCancel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 156, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel(evt);
            }
        });
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPlayerName)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnStart))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="initMultiPlayer">                          
    private void initMultiPlayer() {
        jPanel1 = new javax.swing.JPanel();
        lblPlayer2Name = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblPlayerName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPlayer2Name.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        lblPlayer2Name.setForeground(new java.awt.Color(0, 156, 0));
        lblPlayer2Name.setText("Player 2 Name");

        txtName2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        txtName2.setForeground(new java.awt.Color(0, 156, 0));

        btnStart.setBackground(new java.awt.Color(19, 19, 19));
        btnStart.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnStart.setForeground(new java.awt.Color(0, 156, 0));
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartMultiPlayer(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(19, 19, 19));
        btnCancel.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 156, 0));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel(evt);
            }
        });

        lblPlayerName.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        lblPlayerName.setForeground(new java.awt.Color(0, 156, 0));
        lblPlayerName.setText("Player 1 Name");

        txtName.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 156, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPlayer2Name)
                        .addGap(18, 18, 18)
                        .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPlayerName)
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayer2Name))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnStart))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Back">
    private void Cancel(java.awt.event.ActionEvent evt) {                                        
        jPanel1.removeAll();
        this.dispose();
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="StartSinglePlayer">
    private void StartSinglePlayer(java.awt.event.ActionEvent evt) { 
        Game game = new Game(txtName.getText());
        game.setVisible(true);
        this.dispose();
        startup.dispose();
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="StartMultiPlayer">
    private void StartMultiPlayer(java.awt.event.ActionEvent evt) {
        Game game = new Game(txtName.getText(), txtName2.getText());
        game.setVisible(true);
        this.dispose();
        startup.dispose();
    }//</editor-fold>
}
