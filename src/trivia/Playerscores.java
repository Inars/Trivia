/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trivia;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Elie
 */
@Entity
@Table(name = "playerscores", catalog = "triviadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Playerscores.findAll", query = "SELECT p FROM Playerscores p"),
    @NamedQuery(name = "Playerscores.findById", query = "SELECT p FROM Playerscores p WHERE p.id = :id"),
    @NamedQuery(name = "Playerscores.findByPlayer", query = "SELECT p FROM Playerscores p WHERE p.player = :player"),
    @NamedQuery(name = "Playerscores.findByCorrectAnswers", query = "SELECT p FROM Playerscores p WHERE p.correctAnswers = :correctAnswers"),
    @NamedQuery(name = "Playerscores.findByFinalScore", query = "SELECT p FROM Playerscores p WHERE p.finalScore = :finalScore")})
public class Playerscores implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Player")
    private String player;
    @Column(name = "CorrectAnswers")
    private Integer correctAnswers;
    @Column(name = "FinalScore")
    private String finalScore;

    public Playerscores() {
    }

    public Playerscores(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        String oldPlayer = this.player;
        this.player = player;
        changeSupport.firePropertyChange("player", oldPlayer, player);
    }

    public Integer getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(Integer correctAnswers) {
        Integer oldCorrectAnswers = this.correctAnswers;
        this.correctAnswers = correctAnswers;
        changeSupport.firePropertyChange("correctAnswers", oldCorrectAnswers, correctAnswers);
    }

    public String getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(String finalScore) {
        String oldFinalScore = this.finalScore;
        this.finalScore = finalScore;
        changeSupport.firePropertyChange("finalScore", oldFinalScore, finalScore);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Playerscores)) {
            return false;
        }
        Playerscores other = (Playerscores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "trivia.Playerscores[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
