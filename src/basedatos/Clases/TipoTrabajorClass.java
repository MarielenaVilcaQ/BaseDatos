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
public class TipoTrabajorClass {
    
    String TipTraCod;
    String TipTraDes;
    String TipTraEstReg;

    public TipoTrabajorClass(String TipTraCod, String TipTraDes, String TipTraEstReg) {
        this.TipTraCod = TipTraCod;
        this.TipTraDes = TipTraDes;
        this.TipTraEstReg = TipTraEstReg;
    }

    public String getTipTraCod() {
        return TipTraCod;
    }

    public String getTipTraDes() {
        return TipTraDes;
    }

    public String getTipTraEstReg() {
        return TipTraEstReg;
    }

    public void setTipTraCod(String TipTraCod) {
        this.TipTraCod = TipTraCod;
    }

    public void setTipTraEstReg(String TipTraEstReg) {
        this.TipTraEstReg = TipTraEstReg;
    }
    
    
    
}
