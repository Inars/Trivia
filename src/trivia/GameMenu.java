package trivia;

public class GameMenu extends javax.swing.JDialog {
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnResumeGame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFrame Game;
    private Session session;
    
    public GameMenu(java.awt.Frame parent, javax.swing.JFrame Game, Session session){
        super(parent,true);
        this.Game = Game;
        this.session = session;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(){
        jPanel1 = new javax.swing.JPanel();
        btnResumeGame = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();

        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnResumeGame.setBackground(new java.awt.Color(0, 0, 0));
        btnResumeGame.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnResumeGame.setForeground(new java.awt.Color(0, 204, 0));
        btnResumeGame.setText("Resume Game");
        btnResumeGame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnResumeGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel(evt);
            }
        });

        btnMainMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnMainMenu.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnMainMenu.setForeground(new java.awt.Color(0, 204, 0));
        btnMainMenu.setText("Main Menu");
        btnMainMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopGame(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnResumeGame, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnResumeGame)
                .addGap(18, 18, 18)
                .addComponent(btnMainMenu)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="StopGame"> 
    private void StopGame(java.awt.event.ActionEvent evt){
        SQL.startConnection();
        SQL.execute("update sessions set Winner = -1 where Session_ID = " + session.getSessionNb());
        SQL.endConnection();
        Startup startup = new Startup();
        startup.setVisible(true);
        this.dispose();
        Game.dispose();
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Cancel"> 
    private void Cancel(java.awt.event.ActionEvent evt){
        this.dispose();
    }// </editor-fold>
}
