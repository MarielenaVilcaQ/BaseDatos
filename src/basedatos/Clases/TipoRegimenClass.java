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
public class TipoRegimenClass {
    
    String TipRegPenCod;
    String TipRegPenDes;
    String TipRegPenEstReg;
    String afp_AfpCod;

    public TipoRegimenClass(String TipRegPenCod, String TipRegPenDes, String TipRegPenEstReg, String afp_AfpCod) {
        this.TipRegPenCod = TipRegPenCod;
        this.TipRegPenDes = TipRegPenDes;
        this.TipRegPenEstReg = TipRegPenEstReg;
        this.afp_AfpCod = afp_AfpCod;
    }

    public String getAfp_AfpCod() {
        return afp_AfpCod;
    }

    public String getTipRegPenCod() {
        return TipRegPenCod;
    }

    public String getTipRegPenDes() {
        return TipRegPenDes;
    }

    public String getTipRegPenEstReg() {
        return TipRegPenEstReg;
    }

    public void setTipRegPenCod(String TipRegPenCod) {
        this.TipRegPenCod = TipRegPenCod;
    }

    public void setAfp_AfpCod(String afp_AfpCod) {
        this.afp_AfpCod = afp_AfpCod;
    }

    public void setTipRegPenDes(String TipRegPenDes) {
        this.TipRegPenDes = TipRegPenDes;
    }

    public void setTipRegPenEstReg(String TipRegPenEstReg) {
        this.TipRegPenEstReg = TipRegPenEstReg;
    }
}
