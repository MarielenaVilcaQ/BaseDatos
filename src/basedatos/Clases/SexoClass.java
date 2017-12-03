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
public class SexoClass {
    
    String SexCod;
    String SexDes;
    String SexEstReg;

    public SexoClass(String SexCod, String SexDes, String SexEstReg) {
        this.SexCod = SexCod;
        this.SexDes = SexDes;
        this.SexEstReg = SexEstReg;
    }

    public String getSexCod() {
        return SexCod;
    }

    public String getSexDes() {
        return SexDes;
    }

    public String getSexEstReg() {
        return SexEstReg;
    }

    public void setSexCod(String SexCod) {
        this.SexCod = SexCod;
    }

    public void setSexDes(String SexDes) {
        this.SexDes = SexDes;
    }

    public void setSexEstReg(String SexEstReg) {
        this.SexEstReg = SexEstReg;
    }
}
