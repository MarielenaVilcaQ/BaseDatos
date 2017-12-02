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
public class CategoriaAcademicaClass {
    
    String CatAcaCod;
    String CatAcaDes;
    String CatAcaEstReg;

    public CategoriaAcademicaClass(String CatAcaCod, String CatAcaDes, String CatAcaEstReg) {
        this.CatAcaCod = CatAcaCod;
        this.CatAcaDes = CatAcaDes;
        this.CatAcaEstReg = CatAcaEstReg;
    }

    public String getCatAcaCod() {
        return CatAcaCod;
    }

    public String getCatAcaDes() {
        return CatAcaDes;
    }

    public String getCatAcaEstReg() {
        return CatAcaEstReg;
    }

    public void setCatAcaCod(String CatAcaCod) {
        this.CatAcaCod = CatAcaCod;
    }

    public void setCatAcaDes(String CatAcaDes) {
        this.CatAcaDes = CatAcaDes;
    }

    public void setCatAcaEstReg(String CatAcaEstReg) {
        this.CatAcaEstReg = CatAcaEstReg;
    }
}
