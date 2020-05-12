package pe.gob.mtpe.backend.appee.models.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name = "EETBC_REGEMPRESA", schema = "EVENTO", catalog = "")
public class Regempresa implements Serializable {

    @Id
    @SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_IDESECEMP", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name = "N_IDESECEMP")
    private Long id;

    @Column(name = "N_CODRUCEMP", nullable = false)
    private Long codRucEmp;

    @Column(name = "V_DESRAZONS", nullable = true)
    private String desRazonS;

    @Column(name = "C_CODDEPART", nullable = true)
    private String codDepart;

    @Column(name = "C_CODPROVIN", nullable = true)
    private String codProvin;

    @Column(name = "C_CODDISTRI", nullable = true)
    private String codDistri;

    @Column(name = "V_DESDIRSED", nullable = true)
    private String desDirSed;

    @Column(name = "V_NUMTELEFO", nullable = true)
    private String numTelefo;

    @Column(name = "C_CODACTECO", nullable = true)
    private String codActEco;

    @Column(name = "N_NUMTRABAJ", nullable = true)
    private Long numTrabaj;

    @Column(name = "C_FLGPLAME", nullable = true)
    private String flgPlame;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodRucEmp() {
        return codRucEmp;
    }

    public void setCodRucEmp(Long codRucEmp) {
        this.codRucEmp = codRucEmp;
    }

    public String getDesRazonS() {
        return desRazonS;
    }

    public void setDesRazonS(String desRazonS) {
        this.desRazonS = desRazonS;
    }

    public String getCodDepart() {
        return codDepart;
    }

    public void setCodDepart(String codDepart) {
        this.codDepart = codDepart;
    }

    public String getCodProvin() {
        return codProvin;
    }

    public void setCodProvin(String codProvin) {
        this.codProvin = codProvin;
    }

    public String getCodDistri() {
        return codDistri;
    }

    public void setCodDistri(String codDistri) {
        this.codDistri = codDistri;
    }

    public String getDesDirSed() {
        return desDirSed;
    }

    public void setDesDirSed(String desDirSed) {
        this.desDirSed = desDirSed;
    }

    public String getNumTelefo() {
        return numTelefo;
    }

    public void setNumTelefo(String numTelefo) {
        this.numTelefo = numTelefo;
    }

    public String getCodActEco() {
        return codActEco;
    }

    public void setCodActEco(String codActEco) {
        this.codActEco = codActEco;
    }

    public Long getNumTrabaj() {
        return numTrabaj;
    }

    public void setNumTrabaj(Long numTrabaj) {
        this.numTrabaj = numTrabaj;
    }

    public String getFlgPlame() {
        return flgPlame;
    }

    public void setFlgPlame(String flgPlame) {
        this.flgPlame = flgPlame;
    }
    
    private static final long serialVersionUID = 1L;

    //@Column(name="create_at")
    //@Temporal(TemporalType.DATE)
    //private Date createAt;

    //@PrePersist
    //public void prePersist(){
    //    createAt = new Date();
    //}
}
