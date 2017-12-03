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
public class TipoDocumentoClass {
    
    String TipDocCod;
    String TipDocDes;
    String TipDocEstReg;

    public TipoDocumentoClass(String TipDocCod, String TipDocDes, String TipDocEstReg) {
        this.TipDocCod = TipDocCod;
        this.TipDocDes = TipDocDes;
        this.TipDocEstReg = TipDocEstReg;
    }

    public String getTipDocCod() {
        return TipDocCod;
    }

    public String getTipDocDes() {
        return TipDocDes;
    }

    public String getTipDocEstReg() {
        return TipDocEstReg;
    }

    public void setTipDocDes(String TipDocDes) {
        this.TipDocDes = TipDocDes;
    }

    public void setTipDocCod(String TipDocCod) {
        this.TipDocCod = TipDocCod;
    }

    public void setTipDocEstReg(String TipDocEstReg) {
        this.TipDocEstReg = TipDocEstReg;
    }
}
