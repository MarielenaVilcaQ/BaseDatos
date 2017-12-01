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
public class AFP {
    String AfpCod;
    String AfpDes;
    String AfpEstReg;
    
    public AFP (String AfpCod, String AfpDes, String AfpEstReg) {
        this.AfpCod = AfpCod;
        this.AfpDes = AfpDes;
        this.AfpEstReg = AfpEstReg;
    }

    public String getAfpCod() {
        return AfpCod;
    }

    public String getAfpDes() {
        return AfpDes;
    }

    public String getAfpEstReg() {
        return AfpEstReg;
    }

    public void setAfpCod(String AfpCod) {
        this.AfpCod = AfpCod;
    }

    public void setAfpDes(String AfpDes) {
        this.AfpDes = AfpDes;
    }

    public void setAfpEstReg(String AfpEstReg) {
        this.AfpEstReg = AfpEstReg;
    }
}
