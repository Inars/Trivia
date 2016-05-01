package trivia;

import java.sql.SQLException;

public class Game extends javax.swing.JFrame {
    private Player player1;
    private Player player2;
    private javax.swing.JButton btnAnswe2;
    private javax.swing.JButton btnAnswer1;
    private javax.swing.JButton btnAnswer3;
    private javax.swing.JButton btnAnswer4;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer1Score;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JLabel lblPlayer2Score;
    private javax.swing.JTextArea lblQuestion;
    private javax.swing.JLabel lblTime;
    private javax.swing.JSeparator sepLineSeperator;
    private static java.awt.GraphicsDevice device = java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
    private java.util.Hashtable<String, String> questions;
    private CorrectAnswer correctAnswer;
    
    public Game(javax.swing.JPanel jPanel1, String player1){
        this.jPanel1 = jPanel1;
        this.player1 = new Player(player1);                                       
        jPanel1.removeAll();
        initSinglePlayer(this.player1);
        fetchData();
    }
    
    public Game(javax.swing.JPanel jPanel1, String player1, String player2){
        this.jPanel1 = jPanel1;
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);                                       
        jPanel1.removeAll();
        initMultiPlayer(this.player1, this.player2);
        fetchData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="initSinglePlayer">                          
    private void initSinglePlayer(Player player1) {
        jPanel1 = new javax.swing.JPanel();
        btnAnswer1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblQuestion = new javax.swing.JTextArea();
        lblPlayer2 = new javax.swing.JLabel();
        lblPlayer1 = new javax.swing.JLabel();
        lblPlayer1Score = new javax.swing.JLabel();
        lblPlayer2Score = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        sepLineSeperator = new javax.swing.JSeparator();
        btnAnswe2 = new javax.swing.JButton();
        btnAnswer3 = new javax.swing.JButton();
        btnAnswer4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        device.setFullScreenWindow(this);
        
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setAlignmentX(javax.swing.SwingConstants.CENTER);

        btnAnswer1.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnAnswer1.setText("Answer 1");
        btnAnswer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        lblQuestion.setEditable(false);
        lblQuestion.setBackground(new java.awt.Color(102, 102, 102));
        lblQuestion.setColumns(20);
        lblQuestion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        lblQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion.setLineWrap(true);
        lblQuestion.setRows(5);
        lblQuestion.setWrapStyleWord(true);
        lblQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jScrollPane1.setViewportView(lblQuestion);

        lblPlayer2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 48)); // NOI18N
        lblPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlayer2.setText(player2.getName());

        lblPlayer1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 48)); // NOI18N
        lblPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer1.setText(player1.getName());

        lblPlayer1Score.setBackground(new java.awt.Color(0, 0, 0));
        lblPlayer1Score.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        lblPlayer1Score.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer1Score.setText(String.format("%d", player1.getCorrectAnswers()));
        lblPlayer1Score.setToolTipText("");

        lblPlayer2Score.setBackground(new java.awt.Color(0, 0, 0));
        lblPlayer2Score.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        lblPlayer2Score.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer2Score.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlayer2Score.setText(String.format("%d", player2.getCorrectAnswers()));
        lblPlayer2Score.setToolTipText("");

        lblTime.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("25");

        sepLineSeperator.setForeground(new java.awt.Color(255, 255, 255));
        sepLineSeperator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sepLineSeperator.setEnabled(false);
        sepLineSeperator.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N

        btnAnswe2.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswe2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnAnswe2.setText("Answer 2");
        btnAnswe2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnAnswer3.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnAnswer3.setText("Answer 3");
        btnAnswer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnAnswer4.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnAnswer4.setText("Answer 4");
        btnAnswer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoMenu.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnswer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPlayer1Score, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPlayer2Score, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sepLineSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sepLineSeperator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPlayer2))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayer1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer1Score, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(lblTime)
                    .addComponent(lblPlayer2Score))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnswer1)
                .addGap(18, 18, 18)
                .addComponent(btnAnswe2)
                .addGap(18, 18, 18)
                .addComponent(btnAnswer3)
                .addGap(18, 18, 18)
                .addComponent(btnAnswer4)
                .addGap(291, 291, 291))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, java.awt.Toolkit.getDefaultToolkit().getScreenSize().width, java.awt.Toolkit.getDefaultToolkit().getScreenSize().width,  java.awt.Toolkit.getDefaultToolkit().getScreenSize().width)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="initMultiPlayer">                          
    private void initMultiPlayer(Player player1, Player player2) {
        jPanel1 = new javax.swing.JPanel();
        btnAnswer1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblQuestion = new javax.swing.JTextArea();
        lblPlayer2 = new javax.swing.JLabel();
        lblPlayer1 = new javax.swing.JLabel();
        lblPlayer1Score = new javax.swing.JLabel();
        lblPlayer2Score = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        sepLineSeperator = new javax.swing.JSeparator();
        btnAnswe2 = new javax.swing.JButton();
        btnAnswer3 = new javax.swing.JButton();
        btnAnswer4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        device.setFullScreenWindow(this);
        
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setAlignmentX(javax.swing.SwingConstants.CENTER);

        btnAnswer1.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnAnswer1.setText("Answer 1");
        btnAnswer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        lblQuestion.setEditable(false);
        lblQuestion.setBackground(new java.awt.Color(102, 102, 102));
        lblQuestion.setColumns(20);
        lblQuestion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        lblQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion.setLineWrap(true);
        lblQuestion.setRows(5);
        lblQuestion.setWrapStyleWord(true);
        lblQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jScrollPane1.setViewportView(lblQuestion);

        lblPlayer2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 48)); // NOI18N
        lblPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlayer2.setText("Player 2");

        lblPlayer1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 48)); // NOI18N
        lblPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer1.setText("Player 1");

        lblPlayer1Score.setBackground(new java.awt.Color(0, 0, 0));
        lblPlayer1Score.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        lblPlayer1Score.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer1Score.setText("60");
        lblPlayer1Score.setToolTipText("");

        lblPlayer2Score.setBackground(new java.awt.Color(0, 0, 0));
        lblPlayer2Score.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        lblPlayer2Score.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer2Score.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlayer2Score.setText("60");
        lblPlayer2Score.setToolTipText("");

        lblTime.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("25");

        sepLineSeperator.setForeground(new java.awt.Color(255, 255, 255));
        sepLineSeperator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sepLineSeperator.setEnabled(false);
        sepLineSeperator.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N

        btnAnswe2.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswe2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnAnswe2.setText("Answer 2");
        btnAnswe2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnAnswer3.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnAnswer3.setText("Answer 3");
        btnAnswer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        btnAnswer4.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnAnswer4.setText("Answer 4");
        btnAnswer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoMenu.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnswer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswe2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPlayer1Score, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPlayer2Score, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sepLineSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sepLineSeperator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPlayer2))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayer1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayer1Score, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(lblTime)
                    .addComponent(lblPlayer2Score))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnswer1)
                .addGap(18, 18, 18)
                .addComponent(btnAnswe2)
                .addGap(18, 18, 18)
                .addComponent(btnAnswer3)
                .addGap(18, 18, 18)
                .addComponent(btnAnswer4)
                .addGap(291, 291, 291))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="fetchData">    
    private void fetchData(){
        try{
            SQL.startConnection();
            java.sql.ResultSet rs = SQL.select("select distinct Question_ID, Question from view_cqa");
            com.sun.rowset.CachedRowSetImpl crs = new com.sun.rowset.CachedRowSetImpl();
            questions = new java.util.Hashtable<String, String>();
            crs.populate(rs);
            SQL.endConnection();
            while(crs.next()){
                questions.put(crs.getString("Question_ID"), crs.getString("Question"));
            }
            int pickedQuestion = new java.util.Random().nextInt(questions.size());
            java.util.Set<String> keys = questions.keySet();
            int i = 0;
            for(String key: keys){
                if(i == pickedQuestion){
                    lblQuestion.setText(questions.get(key));
                    SQL.startConnection();
                    rs = SQL.select("select Answer, Answer_ID, isCorrect from view_cqa where Question_ID = " + Integer.parseInt(key));
                    populateAnswers(rs);
                    SQL.endConnection();
                    break;
                }
                i++;
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="populateAnswers"> 
    private void populateAnswers(java.sql.ResultSet rs){
        try{
            int iterateButtons = 0;
            while(rs.next()){
                if(rs.getBoolean("isCorrect")){
                    correctAnswer = new CorrectAnswer(rs.getString("Answer"), rs.getString("Answer_ID"));
                }
                switch(iterateButtons){
                    case 0:
                        btnAnswer1.setText(rs.getString("Answer"));
                        iterateButtons++;
                        break;
                    case 1:
                        btnAnswe2.setText(rs.getString("Answer"));
                        iterateButtons++;
                        break;
                    case 2:
                        btnAnswer3.setText(rs.getString("Answer"));
                        iterateButtons++;
                        break;
                    case 3:
                        btnAnswer4.setText(rs.getString("Answer"));
                        iterateButtons++;
                        break;
                    default:
                        break;
                }
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }// </editor-fold>
}
