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
public class TipoContratoClass {
    
    String TipConTraCod;
    String TipConTraDes;
    String TipConTraEstReg;

    public TipoContratoClass(String TipConTraCod, String TipConTraDes, String TipConTraEstReg) {
        this.TipConTraCod = TipConTraCod;
        this.TipConTraDes = TipConTraDes;
        this.TipConTraEstReg = TipConTraEstReg;
    }

    public String getTipConTraCod() {
        return TipConTraCod;
    }

    public String getTipConTraDes() {
        return TipConTraDes;
    }

    public String getTipConTraEstReg() {
        return TipConTraEstReg;
    }

    public void setTipConTraCod(String TipConTraCod) {
        this.TipConTraCod = TipConTraCod;
    }

    public void setTipConTraDes(String TipConTraDes) {
        this.TipConTraDes = TipConTraDes;
    }

    public void setTipConTraEstReg(String TipConTraEstReg) {
        this.TipConTraEstReg = TipConTraEstReg;
    }
}
