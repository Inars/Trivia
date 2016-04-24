package trivia;

public class PreGameSettings extends javax.swing.JDialog {
    public PreGameSettings(javax.swing.JFrame PreGame, boolean isSinglePlayer){
        super(PreGame,true);
        if (isSinglePlayer) {
            initSinglePlayer();
        }else{
            initMultiPlayer();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="initSinglePlayer">                          
    private void initSinglePlayer() {
        
        pack();
    }// </editor-fold>   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="initMultiPlayer">                          
    private void initMultiPlayer() {
        
        pack();
    }// </editor-fold>   
}
