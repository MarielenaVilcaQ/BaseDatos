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
public class PaisClass {
    
    String PaiCod;
    String PaiDes;
    String PaiEstReg;

    public PaisClass(String PaiCod, String PaiDes, String PaiEstReg) {
        this.PaiCod = PaiCod;
        this.PaiDes = PaiDes;
        this.PaiEstReg = PaiEstReg;
    }

    public String getPaiCod() {
        return PaiCod;
    }

    public String getPaiDes() {
        return PaiDes;
    }

    public String getPaiEstReg() {
        return PaiEstReg;
    }

    public void setPaiCod(String PaiCod) {
        this.PaiCod = PaiCod;
    }

    public void setPaiDes(String PaiDes) {
        this.PaiDes = PaiDes;
    }

    public void setPaiEstReg(String PaiEstReg) {
        this.PaiEstReg = PaiEstReg;
    }
    
    
}
