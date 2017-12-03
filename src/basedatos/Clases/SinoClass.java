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
public class SinoClass {
    
    String SinCod;
    String SinDes;
    String SinEstReg;

    public SinoClass(String SinCod, String SinDes, String SinEstReg) {
        this.SinCod = SinCod;
        this.SinDes = SinDes;
        this.SinEstReg = SinEstReg;
    }

    public String getSinCod() {
        return SinCod;
    }

    public String getSinDes() {
        return SinDes;
    }

    public String getSinEstReg() {
        return SinEstReg;
    }

    public void setSinCod(String SinCod) {
        this.SinCod = SinCod;
    }

    public void setSinDes(String SinDes) {
        this.SinDes = SinDes;
    }

    public void setSinEstReg(String SinEstReg) {
        this.SinEstReg = SinEstReg;
    }
    
    
}
