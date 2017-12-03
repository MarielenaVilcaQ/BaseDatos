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
public class BancoClass {
    
    String BanCod;
    String BanNom; 
    String BanEstReg;

    public BancoClass(String BanCod, String BanNom, String BanEstReg) {
        this.BanCod = BanCod;
        this.BanNom = BanNom;
        this.BanEstReg = BanEstReg;
    }

    public String getBanCod() {
        return BanCod;
    }

    public String getBanEstReg() {
        return BanEstReg;
    }

    public String getBanNom() {
        return BanNom;
    }

    public void setBanCod(String BanCod) {
        this.BanCod = BanCod;
    }

    public void setBanEstReg(String BanEstReg) {
        this.BanEstReg = BanEstReg;
    }

    public void setBanNom(String BanNom) {
        this.BanNom = BanNom;
    }
}
