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
public class RegimenClass {
    
    String RegCod;
    String RegDes;
    String RegEstReg;

    public RegimenClass(String RegCod, String RegDes, String RegEstReg) {
        this.RegCod = RegCod;
        this.RegDes = RegDes;
        this.RegEstReg = RegEstReg;
    }
    
    public String getRegCod() {
        return RegCod;
    }

    public String getRegDes() {
        return RegDes;
    }

    public String getRegEstReg() {
        return RegEstReg;
    }

    public void setRegCod(String RegCod) {
        this.RegCod = RegCod;
    }

    public void setRegDes(String RegDes) {
        this.RegDes = RegDes;
    }

    public void setRegEstReg(String RegEstReg) {
        this.RegEstReg = RegEstReg;
    }
}
