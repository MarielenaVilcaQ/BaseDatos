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
public class UnidadAcademicaClass {
    
    String UniAcaCod;
    String UniAcaDes;
    String UniAcaEstReg;

    public UnidadAcademicaClass(String UniAcaCod, String UniAcaDes, String UniAcaEstReg) {
        this.UniAcaCod = UniAcaCod;
        this.UniAcaDes = UniAcaDes;
        this.UniAcaEstReg = UniAcaEstReg;
    }

    public String getUniAcaCod() {
        return UniAcaCod;
    }

    public String getUniAcaDes() {
        return UniAcaDes;
    }

    public String getUniAcaEstReg() {
        return UniAcaEstReg;
    }

    public void setUniAcaCod(String UniAcaCod) {
        this.UniAcaCod = UniAcaCod;
    }

    public void setUniAcaDes(String UniAcaDes) {
        this.UniAcaDes = UniAcaDes;
    }

    public void setUniAcaEstReg(String UniAcaEstReg) {
        this.UniAcaEstReg = UniAcaEstReg;
    }
}
