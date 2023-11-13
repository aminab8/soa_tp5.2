package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    int code;
    float solde ;
    @XmlTransient
   private  Date date_creation ;

    public Compte() {}

    public Compte(int code, float solde, Date date_creation) {
        this.code = code;
        this.solde = solde;
        this.date_creation = date_creation;
    }

    public int getCode() {
        return code;
    }

    public float getSolde() {
        return solde;
    }

    public Date getDate_creation() {
        return date_creation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }
}
