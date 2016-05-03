package trivia;

public class ViewScores {
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearAll;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<trivia.Playerscores> playerscoresList;
    private javax.persistence.Query playerscoresQuery;
    private javax.swing.JTable tblResults;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    private javax.swing.JFrame startup;
    
    public ViewScores(javax.swing.JPanel jPanel1, javax.swing.JFrame startup){
        this.jPanel1 = jPanel1;
        this.startup = startup;
        jPanel1.removeAll();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("triviadb?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        playerscoresQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Playerscores p");
        playerscoresList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : playerscoresQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResults = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, playerscoresList, tblResults);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${player}"));
        columnBinding.setColumnName("Player");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${correctAnswers}"));
        columnBinding.setColumnName("Correct Answers");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${finalScore}"));
        columnBinding.setColumnName("Final Score");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(tblResults);
        if (tblResults.getColumnModel().getColumnCount() > 0) {
            tblResults.getColumnModel().getColumn(0).setResizable(false);
            tblResults.getColumnModel().getColumn(1).setResizable(false);
            tblResults.getColumnModel().getColumn(2).setResizable(false);
            tblResults.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 204, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back(evt);
            }
        });

        btnClearAll.setBackground(new java.awt.Color(0, 0, 0));
        btnClearAll.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 48)); // NOI18N
        btnClearAll.setForeground(new java.awt.Color(0, 204, 0));
        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearAll(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearAll))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnClearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(startup.getContentPane());
        startup.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, java.awt.Toolkit.getDefaultToolkit().getScreenSize().width, java.awt.Toolkit.getDefaultToolkit().getScreenSize().width,  java.awt.Toolkit.getDefaultToolkit().getScreenSize().width)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height, java.awt.Toolkit.getDefaultToolkit().getScreenSize().height)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        
        bindingGroup.bind();
        
        tblResults.getColumnModel().getColumn(0).setMinWidth(0);
        tblResults.getColumnModel().getColumn(0).setMaxWidth(0);
        
        startup.pack();
    }// </editor-fold>  
    
    // <editor-fold defaultstate="collapsed" desc="Back">
    private void Back(java.awt.event.ActionEvent evt) {                                        
        jPanel1.removeAll();
        Startup newstartup = new Startup();
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="ClearAll">
    private void ClearAll(java.awt.event.ActionEvent evt) {                                        
        SQL.startConnection();
        SQL.execute("delete from correct_answers where Player_ID <> 0");
        SQL.execute("delete from players where Player_ID <> 0");
        SQL.execute("delete from sessions where Session_ID <> 0");
        RefreshData();
        SQL.endConnection();
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="RefreshData">
    public void RefreshData(){
        entityManager.getTransaction().begin();
        java.util.Collection data = playerscoresQuery.getResultList();
        for(Object entity: data){
            entityManager.refresh(entity);
        }
        playerscoresList.clear();
        playerscoresList.addAll(data);
        bindingGroup.unbind();
        bindingGroup.bind();
        entityManager.getTransaction().commit();
        tblResults.getColumnModel().getColumn(0).setMinWidth(0);
        tblResults.getColumnModel().getColumn(0).setMaxWidth(0);
    }//</editor-fold>
}
