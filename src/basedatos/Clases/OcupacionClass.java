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
public class OcupacionClass {
    
    String OcuCod;
    String OcuDes;
    String OcuEstReg;

    public OcupacionClass(String OcuCod, String OcuDes, String OcuEstReg) {
        this.OcuCod = OcuCod;
        this.OcuDes = OcuDes;
        this.OcuEstReg = OcuEstReg;
    }

    public String getOcuCod() {
        return OcuCod;
    }

    public String getOcuDes() {
        return OcuDes;
    }

    public String getOcuEstReg() {
        return OcuEstReg;
    }

    public void setOcuCod(String OcuCod) {
        this.OcuCod = OcuCod;
    }

    public void setOcuDes(String OcuDes) {
        this.OcuDes = OcuDes;
    }

    public void setOcuEstReg(String OcuEstReg) {
        this.OcuEstReg = OcuEstReg;
    }
    
    
    
}
