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
public class SedeClass {
    
    String SedCod;
    String SedDes;
    String EstReg;

    public SedeClass(String SedCod, String SedDes, String EstReg) {
        this.SedCod = SedCod;
        this.SedDes = SedDes;
        this.EstReg = EstReg;
    }
    
    public String getEstReg() {
        return EstReg;
    }

    public String getSedCod() {
        return SedCod;
    }

    public String getSedDes() {
        return SedDes;
    }

    public void setEstReg(String EstReg) {
        this.EstReg = EstReg;
    }

    public void setSedCod(String SedCod) {
        this.SedCod = SedCod;
    }

    public void setSedDes(String SedDes) {
        this.SedDes = SedDes;
    }
}
