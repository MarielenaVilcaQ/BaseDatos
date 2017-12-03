/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos.Clases;

/**
 *
 * @author asus
 */
public class SituacionEPSClass {
    
    String SitEpsCod;
    String SitEpsDes;
    String SitEpsEstReg;

    public SituacionEPSClass(String SitEpsCod, String SitEpsDes, String SitEpsEstReg) {
        this.SitEpsCod = SitEpsCod;
        this.SitEpsDes = SitEpsDes;
        this.SitEpsEstReg = SitEpsEstReg;
    }

    public String getSitEpsCod() {
        return SitEpsCod;
    }

    public String getSitEpsDes() {
        return SitEpsDes;
    }

    public String getSitEpsEstReg() {
        return SitEpsEstReg;
    }

    public void setSitEpsCod(String SitEpsCod) {
        this.SitEpsCod = SitEpsCod;
    }

    public void setSitEpsDes(String SitEpsDes) {
        this.SitEpsDes = SitEpsDes;
    }

    public void setSitEpsEstReg(String SitEpsEstReg) {
        this.SitEpsEstReg = SitEpsEstReg;
    }
    
    
    
}
