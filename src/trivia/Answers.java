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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "answers", catalog = "triviadb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Answers.findAll", query = "SELECT a FROM Answers a"),
    @NamedQuery(name = "Answers.findByAnswerID", query = "SELECT a FROM Answers a WHERE a.answerID = :answerID"),
    @NamedQuery(name = "Answers.findByAnswer", query = "SELECT a FROM Answers a WHERE a.answer = :answer"),
    @NamedQuery(name = "Answers.findByIsCorrect", query = "SELECT a FROM Answers a WHERE a.isCorrect = :isCorrect"),
    @NamedQuery(name = "Answers.findByQuestionID", query = "SELECT a FROM Answers a WHERE a.questionID = :questionID")})
public class Answers implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Answer_ID")
    private Integer answerID;
    @Column(name = "Answer")
    private String answer;
    @Column(name = "isCorrect")
    private Boolean isCorrect;
    @Column(name = "Question_ID")
    private Integer questionID;

    public Answers() {
    }

    public Answers(Integer answerID) {
        this.answerID = answerID;
    }

    public Integer getAnswerID() {
        return answerID;
    }

    public void setAnswerID(Integer answerID) {
        Integer oldAnswerID = this.answerID;
        this.answerID = answerID;
        changeSupport.firePropertyChange("answerID", oldAnswerID, answerID);
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        String oldAnswer = this.answer;
        this.answer = answer;
        changeSupport.firePropertyChange("answer", oldAnswer, answer);
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Boolean isCorrect) {
        Boolean oldIsCorrect = this.isCorrect;
        this.isCorrect = isCorrect;
        changeSupport.firePropertyChange("isCorrect", oldIsCorrect, isCorrect);
    }

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        Integer oldQuestionID = this.questionID;
        this.questionID = questionID;
        changeSupport.firePropertyChange("questionID", oldQuestionID, questionID);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (answerID != null ? answerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Answers)) {
            return false;
        }
        Answers other = (Answers) object;
        if ((this.answerID == null && other.answerID != null) || (this.answerID != null && !this.answerID.equals(other.answerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "trivia.Answers[ answerID=" + answerID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
