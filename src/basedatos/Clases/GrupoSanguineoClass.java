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
public class GrupoSanguineoClass {
    
    String GruSanCod;
    String GruSanDes;
    String GruSanEstReg;

    public GrupoSanguineoClass(String GruSanCod, String GruSanDes, String GruSanEstReg) {
        this.GruSanCod = GruSanCod;
        this.GruSanDes = GruSanDes;
        this.GruSanEstReg = GruSanEstReg;
    }

    public String getGruSanCod() {
        return GruSanCod;
    }

    public String getGruSanDes() {
        return GruSanDes;
    }

    public String getGruSanEstReg() {
        return GruSanEstReg;
    }

    public void setGruSanCod(String GruSanCod) {
        this.GruSanCod = GruSanCod;
    }

    public void setGruSanDes(String GruSanDes) {
        this.GruSanDes = GruSanDes;
    }

    public void setGruSanEstReg(String GruSanEstReg) {
        this.GruSanEstReg = GruSanEstReg;
    }
}
