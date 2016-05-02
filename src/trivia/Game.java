package trivia;

public class Game extends javax.swing.JFrame {
    private Player player1;
    private Player player2;
    private PC pc;
    private boolean isSinglePlayer;
    private javax.swing.JButton btnAnswer2;
    private javax.swing.JButton btnAnswer1;
    private javax.swing.JButton btnAnswer3;
    private javax.swing.JButton btnAnswer4;
    private javax.swing.JButton btnMenu;
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
    private javax.swing.Timer timer;
    
    public Game(String player1){
        this.player1 = new Player(player1);
        this.pc = new PC();
        this.isSinglePlayer = true;
        initSinglePlayer(this.player1, this.pc);
        fetchData();
    }
    
    public Game(String player1, String player2){
        this.player1 = new Player(player1);
        this.player2 = new Player(player2);
        this.isSinglePlayer = false;
        initMultiPlayer(this.player1, this.player2);
        fetchData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="initSinglePlayer">                          
    private void initSinglePlayer(Player player1, PC pc) {
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
        btnAnswer2 = new javax.swing.JButton();
        btnAnswer3 = new javax.swing.JButton();
        btnAnswer4 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        
        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        device.setFullScreenWindow(this);
        
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setAlignmentX(javax.swing.SwingConstants.CENTER);

        btnAnswer1.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer1.setForeground(java.awt.Color.BLACK);
        btnAnswer1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));
        btnAnswer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answered(evt);
            }
        });

        lblQuestion.setEditable(false);
        lblQuestion.setBackground(new java.awt.Color(102, 102, 102));
        lblQuestion.setColumns(20);
        lblQuestion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));
        lblQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion.setLineWrap(true);
        lblQuestion.setRows(5);
        lblQuestion.setWrapStyleWord(true);
        lblQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jScrollPane1.setViewportView(lblQuestion);

        lblPlayer2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 48)); // NOI18N
        lblPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlayer2.setText("Machine");

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
        lblPlayer2Score.setText(String.format("%d", pc.getCorrectAnswers()));
        lblPlayer2Score.setToolTipText("");

        lblTime.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        sepLineSeperator.setForeground(new java.awt.Color(255, 255, 255));
        sepLineSeperator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sepLineSeperator.setEnabled(false);
        sepLineSeperator.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));

        btnAnswer2.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer2.setForeground(java.awt.Color.BLACK);
        btnAnswer2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));
        btnAnswer2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answered(evt);
            }
        });

        btnAnswer3.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer3.setForeground(java.awt.Color.BLACK);
        btnAnswer3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));
        btnAnswer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answered(evt);
            }
        });

        btnAnswer4.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer4.setForeground(java.awt.Color.BLACK);
        btnAnswer4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));
        btnAnswer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAnswer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answered(evt);
            }
        });

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoMenu.jpg")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnswer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnAnswer2)
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
        btnAnswer2 = new javax.swing.JButton();
        btnAnswer3 = new javax.swing.JButton();
        btnAnswer4 = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setUndecorated(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        device.setFullScreenWindow(this);
        
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setAlignmentX(javax.swing.SwingConstants.CENTER);

        btnAnswer1.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer1.setForeground(java.awt.Color.BLACK);
        btnAnswer1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));
        btnAnswer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answered(evt);
            }
        });

        lblQuestion.setEditable(false);
        lblQuestion.setBackground(new java.awt.Color(102, 102, 102));
        lblQuestion.setColumns(20);
        lblQuestion.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); 
        lblQuestion.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion.setLineWrap(true);
        lblQuestion.setRows(5);
        lblQuestion.setWrapStyleWord(true);
        lblQuestion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jScrollPane1.setViewportView(lblQuestion);

        lblPlayer2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 48));
        lblPlayer2.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlayer2.setText(player2.getName());

        lblPlayer1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 48));
        lblPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer1.setText(player1.getName());

        lblPlayer1Score.setBackground(new java.awt.Color(0, 0, 0));
        lblPlayer1Score.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48));
        lblPlayer1Score.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer1Score.setText(String.format("%d", player1.getCorrectAnswers()));
        lblPlayer1Score.setToolTipText("");

        lblPlayer2Score.setBackground(new java.awt.Color(0, 0, 0));
        lblPlayer2Score.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48));
        lblPlayer2Score.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayer2Score.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPlayer2Score.setText(String.format("%d", player2.getCorrectAnswers()));
        lblPlayer2Score.setToolTipText("");

        lblTime.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48));
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        sepLineSeperator.setForeground(new java.awt.Color(255, 255, 255));
        sepLineSeperator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        sepLineSeperator.setEnabled(false);
        sepLineSeperator.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));

        btnAnswer2.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer2.setForeground(java.awt.Color.BLACK);
        btnAnswer2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));
        btnAnswer2.setText("Answer 2");
        btnAnswer2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAnswer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answered(evt);
            }
        });

        btnAnswer3.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer3.setForeground(java.awt.Color.BLACK);
        btnAnswer3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));
        btnAnswer3.setText("Answer 3");
        btnAnswer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAnswer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answered(evt);
            }
        });

        btnAnswer4.setBackground(new java.awt.Color(255, 255, 255));
        btnAnswer4.setForeground(java.awt.Color.BLACK);
        btnAnswer4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48));
        btnAnswer4.setText("Answer 4");
        btnAnswer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnAnswer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Answered(evt);
            }
        });

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconoMenu.jpg")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnswer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnswer4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnAnswer2)
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
                    populateAnswers("select Answer, Answer_ID, isCorrect from view_cqa where Question_ID = " + Integer.parseInt(key));
                    break;
                }
                i++;
            }
            initTime();
        }catch(java.sql.SQLException ex){
            System.err.println(ex.getMessage());
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="populateAnswers"> 
    private void populateAnswers(String sql){
        try{
            SQL.startConnection();
            java.sql.ResultSet rs = SQL.select(sql);
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
                        btnAnswer2.setText(rs.getString("Answer"));
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
            SQL.endConnection();
        }catch(java.sql.SQLException ex){
            System.err.println(ex.getMessage());
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="newQuestion">   
    private void newQuestion(){
        try{
            timer.stop();
            btnAnswer1.setForeground(java.awt.Color.BLACK);
            btnAnswer2.setForeground(java.awt.Color.BLACK);
            btnAnswer3.setForeground(java.awt.Color.BLACK);
            btnAnswer4.setForeground(java.awt.Color.BLACK);
            java.util.Set<String> keys = questions.keySet();
            for(String key: keys){
                if(lblQuestion.getText().equals(questions.get(key))){
                    questions.remove(key);
                    break;
                }
            }
            if(questions.isEmpty()){
                endGame();
                return;
            }
            int pickedQuestion = new java.util.Random().nextInt(questions.size());
            int i = 0;
            for(String key: keys){
                if(i == pickedQuestion){
                    lblQuestion.setText(questions.get(key));
                    populateAnswers("select Answer, Answer_ID, isCorrect from view_cqa where Question_ID = " + Integer.parseInt(key));
                    break;
                }
                i++;
            }
            initTime();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="endGame"> 
    private void endGame(){
        try{
            btnAnswer1.setEnabled(false);
            btnAnswer2.setEnabled(false);
            btnAnswer3.setEnabled(false);
            btnAnswer4.setEnabled(false);
            if(isSinglePlayer){
                if(player1.getCorrectAnswers() > pc.getCorrectAnswers()){
                    lblPlayer1.setForeground(java.awt.Color.GREEN);
                    lblPlayer2.setForeground(java.awt.Color.GRAY);
                    lblQuestion.setText("Congratulations! You Have Successfully Beaten A Mindless Machine!");
                }else if(player1.getCorrectAnswers() < pc.getCorrectAnswers()){
                    lblPlayer1.setForeground(java.awt.Color.GRAY);
                    lblPlayer2.setForeground(java.awt.Color.GREEN);
                    lblQuestion.setForeground(java.awt.Color.RED);
                    lblQuestion.setText("Maybe The Only Significant Difference Between A Really Basic Simulation And Yourself Is The Noise It Makes When You Punch It... Better Luck Next Time!");
                }else{
                    lblPlayer1.setForeground(java.awt.Color.WHITE);
                    lblPlayer2.setForeground(java.awt.Color.WHITE);
                    lblQuestion.setText("Close Call! Better Luck Next Time!");
                }
            }else{
                if(player1.getCorrectAnswers() > player2.getCorrectAnswers()){
                    lblPlayer1.setForeground(java.awt.Color.GREEN);
                    lblPlayer2.setForeground(java.awt.Color.GRAY);
                    lblQuestion.setText(player1.getName() + " Wins!");
                }else if(player1.getCorrectAnswers() < player2.getCorrectAnswers()){
                    lblPlayer1.setForeground(java.awt.Color.GRAY);
                    lblPlayer2.setForeground(java.awt.Color.GREEN);
                    lblQuestion.setText(player2.getName() + " Wins!");
                }else{
                    lblPlayer1.setForeground(java.awt.Color.WHITE);
                    lblPlayer2.setForeground(java.awt.Color.WHITE);
                    lblQuestion.setText("Draw!");
                }
            }
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Answered">
    private void Answered(java.awt.event.ActionEvent evt){
        try{
            javax.swing.JButton sender = (javax.swing.JButton)evt.getSource();
            timer.stop();
            if(sender.getText().equals(btnAnswer1.getText())){
                if(sender.getText().equals(correctAnswer.toString())){
                    btnAnswer1.setForeground(java.awt.Color.GREEN);
                    if(lblPlayer1.getForeground().equals(java.awt.Color.BLUE)){
                        player1.AnsweredCorrectly();
                        lblPlayer1Score.setText(String.format("%d", player1.getCorrectAnswers()));
                    }else{
                        if(!isSinglePlayer){
                            player2.AnsweredCorrectly();
                            lblPlayer2Score.setText(String.format("%d", player2.getCorrectAnswers()));
                        }else{
                            pc.AnsweredCorrectly();
                            lblPlayer2Score.setText(String.format("%d", pc.getCorrectAnswers()));
                        }
                    }
                }else{
                    btnAnswer1.setForeground(java.awt.Color.RED);
                    if(btnAnswer2.getText().equals(correctAnswer.toString())){
                        btnAnswer2.setForeground(java.awt.Color.GREEN);
                    }else if(btnAnswer3.getText().equals(correctAnswer.toString())){
                        btnAnswer3.setForeground(java.awt.Color.GREEN);
                    }else if(btnAnswer4.getText().equals(correctAnswer.toString())){
                        btnAnswer4.setForeground(java.awt.Color.GREEN);
                    }
                }
            }else if(sender.getText().equals(btnAnswer2.getText())){
                if(sender.getText().equals(correctAnswer.toString())){
                    btnAnswer2.setForeground(java.awt.Color.GREEN);
                    if(lblPlayer1.getForeground().equals(java.awt.Color.BLUE)){
                        player1.AnsweredCorrectly();
                        lblPlayer1Score.setText(String.format("%d", player1.getCorrectAnswers()));
                    }else{
                        if(!isSinglePlayer){
                            player2.AnsweredCorrectly();
                            lblPlayer2Score.setText(String.format("%d", player2.getCorrectAnswers()));
                        }else{
                            pc.AnsweredCorrectly();
                            lblPlayer2Score.setText(String.format("%d", pc.getCorrectAnswers()));
                        }
                    }
                }else{
                    btnAnswer2.setForeground(java.awt.Color.RED);
                    if(btnAnswer1.getText().equals(correctAnswer.toString())){
                        btnAnswer1.setForeground(java.awt.Color.GREEN);
                    }else if(btnAnswer3.getText().equals(correctAnswer.toString())){
                        btnAnswer3.setForeground(java.awt.Color.GREEN);
                    }else if(btnAnswer4.getText().equals(correctAnswer.toString())){
                        btnAnswer4.setForeground(java.awt.Color.GREEN);
                    }
                }
            }else if(sender.getText().equals(btnAnswer3.getText())){
                if(sender.getText().equals(correctAnswer.toString())){
                    btnAnswer3.setForeground(java.awt.Color.GREEN);
                    if(lblPlayer1.getForeground().equals(java.awt.Color.BLUE)){
                        player1.AnsweredCorrectly();
                        lblPlayer1Score.setText(String.format("%d", player1.getCorrectAnswers()));
                    }else{
                        if(!isSinglePlayer){
                            player2.AnsweredCorrectly();
                            lblPlayer2Score.setText(String.format("%d", player2.getCorrectAnswers()));
                        }else{
                            pc.AnsweredCorrectly();
                            lblPlayer2Score.setText(String.format("%d", pc.getCorrectAnswers()));
                        }
                    }
                }else{
                    btnAnswer3.setForeground(java.awt.Color.RED);
                    if(btnAnswer2.getText().equals(correctAnswer.toString())){
                        btnAnswer2.setForeground(java.awt.Color.GREEN);
                    }else if(btnAnswer1.getText().equals(correctAnswer.toString())){
                        btnAnswer1.setForeground(java.awt.Color.GREEN);
                    }else if(btnAnswer4.getText().equals(correctAnswer.toString())){
                        btnAnswer4.setForeground(java.awt.Color.GREEN);
                    }
                }
            }else if(sender.getText().equals(btnAnswer4.getText())){
                if(sender.getText().equals(correctAnswer.toString())){
                    btnAnswer4.setForeground(java.awt.Color.GREEN);
                    if(lblPlayer1.getForeground().equals(java.awt.Color.BLUE)){
                        player1.AnsweredCorrectly();
                        lblPlayer1Score.setText(String.format("%d", player1.getCorrectAnswers()));
                    }else{
                        if(!isSinglePlayer){
                            player2.AnsweredCorrectly();
                            lblPlayer2Score.setText(String.format("%d", player2.getCorrectAnswers()));
                        }else{
                            pc.AnsweredCorrectly();
                            lblPlayer2Score.setText(String.format("%d", pc.getCorrectAnswers()));
                        }
                    }
                }else{
                    btnAnswer4.setForeground(java.awt.Color.RED);
                    if(btnAnswer2.getText().equals(correctAnswer.toString())){
                        btnAnswer2.setForeground(java.awt.Color.GREEN);
                    }else if(btnAnswer1.getText().equals(correctAnswer.toString())){
                        btnAnswer1.setForeground(java.awt.Color.GREEN);
                    }else if(btnAnswer3.getText().equals(correctAnswer.toString())){
                        btnAnswer3.setForeground(java.awt.Color.GREEN);
                    }
                }
            }
            TimerClass tc = new TimerClass(true);
            timer = new javax.swing.Timer(1000, tc);
            timer.start();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            Thread.currentThread().interrupt();
        }
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="initTime"> 
    private void initTime(){
        try{
            TimerClass tc = new TimerClass(false);
            timer = new javax.swing.Timer(1000, tc);
            timer.start();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }// </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="MachineAnswer">
    private void MachineAnswer(){
        try{
            int winChance = new java.util.Random().nextInt(2);
            if(winChance == 1){
                if(correctAnswer.toString().equals(btnAnswer1.getText())){
                    btnAnswer1.doClick();
                }else if(correctAnswer.toString().equals(btnAnswer2.getText())){
                    btnAnswer2.doClick();
                }else if(correctAnswer.toString().equals(btnAnswer3.getText())){
                    btnAnswer3.doClick();
                }else if(correctAnswer.toString().equals(btnAnswer4.getText())){
                    btnAnswer4.doClick();
                }
            }else{
                int randomSelection = new java.util.Random().nextInt(4);
                for(int i = 1; i <= randomSelection; i++){
                    if(i == randomSelection){
                        switch(i){
                            case 1:
                                if(!btnAnswer1.getText().equals(correctAnswer.toString())){
                                    btnAnswer1.doClick();
                                }else{
                                    this.MachineAnswer();
                                }   break;
                            case 2:
                                if(!btnAnswer2.getText().equals(correctAnswer.toString())){
                                    btnAnswer2.doClick();
                                }else{
                                    this.MachineAnswer();
                                }   break;
                            case 3:
                                if(!btnAnswer3.getText().equals(correctAnswer.toString())){
                                    btnAnswer3.doClick();
                                }else{
                                    this.MachineAnswer();
                                }   break;
                            default:
                                if(!btnAnswer4.getText().equals(correctAnswer.toString())){
                                    btnAnswer4.doClick();
                                }else{
                                    this.MachineAnswer();
                                }   break;
                        }
                    }
                }
            }
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }// </editor-fold>
    
    public class TimerClass implements java.awt.event.ActionListener{
        int counter;
        boolean isWaitTime = false;
        
        public TimerClass(boolean isWaitTime){
            this.isWaitTime = isWaitTime;
            if(isWaitTime){
                this.counter = 1;
            }else{
                this.counter = 20;
            }
        }
        
        public void actionPerformed(java.awt.event.ActionEvent evt){
            if(!isWaitTime){
                checkPlayer();
                if(counter >= 6){
                    lblTime.setForeground(java.awt.Color.white);
                    lblTime.setText(String.format("%d", counter));
                    counter --;
                }else if(counter < 6 && counter >= 1){
                    lblTime.setForeground(java.awt.Color.red);
                    lblTime.setText(String.format("%d", counter));
                    counter --;
                }else{
                    lblTime.setText(String.format("%d", counter));
                    timer.stop();
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    newQuestion();
                }
            }else{
                if(counter > 0){
                    counter --;
                }else if(counter == 0){
                    timer.stop();
                    newQuestion();
                }
            }
        }
        
        private void checkPlayer(){
            if(counter == 20){
                if(lblPlayer1.getForeground().equals(java.awt.Color.BLUE)){
                    lblPlayer1.setForeground(java.awt.Color.WHITE);
                    lblPlayer2.setForeground(java.awt.Color.BLUE);
                    if(isSinglePlayer){
                        timer.stop();
                        MachineAnswer();
                    }
                }else{
                    lblPlayer1.setForeground(java.awt.Color.BLUE);
                    lblPlayer2.setForeground(java.awt.Color.WHITE);
                }
            }
        }
    }
}
