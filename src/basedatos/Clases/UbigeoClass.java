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
public class UbigeoClass {
    
    String UbiCod;
    String UbiDep;
    String UbiPro;
    String UbiDis;
    String UbiEstReg;

    public UbigeoClass(String UbiCod, String UbiDep, String UbiPro, String UbiDis, String UbiEstReg) {
        this.UbiCod = UbiCod;
        this.UbiDep = UbiDep;
        this.UbiPro = UbiPro;
        this.UbiDis = UbiDis;
        this.UbiEstReg = UbiEstReg;
    }

    public String getUbiCod() {
        return UbiCod;
    }

    public String getUbiDep() {
        return UbiDep;
    }

    public String getUbiEstReg() {
        return UbiEstReg;
    }

    public String getUbiDis() {
        return UbiDis;
    }

    public String getUbiPro() {
        return UbiPro;
    }

    public void setUbiCod(String UbiCod) {
        this.UbiCod = UbiCod;
    }

    public void setUbiDep(String UbiDep) {
        this.UbiDep = UbiDep;
    }

    public void setUbiDis(String UbiDis) {
        this.UbiDis = UbiDis;
    }

    public void setUbiEstReg(String UbiEstReg) {
        this.UbiEstReg = UbiEstReg;
    }

    public void setUbiPro(String UbiPro) {
        this.UbiPro = UbiPro;
    }
    
    
    
}
