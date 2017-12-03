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
public class NivelEducativoClass {
    
    String NivEduCod;
    String NivEduDes;
    String NivEduNivGra;
    String NivEduEstReg;

    public NivelEducativoClass(String NivEduCod, String NivEduDes, String NivEduNivGra, String NivEduEstReg) {
        this.NivEduCod = NivEduCod;
        this.NivEduDes = NivEduDes;
        this.NivEduNivGra = NivEduNivGra;
        this.NivEduEstReg = NivEduEstReg;
    }

    public String getNivEduCod() {
        return NivEduCod;
    }

    public String getNivEduDes() {
        return NivEduDes;
    }

    public String getNivEduEstReg() {
        return NivEduEstReg;
    }

    public String getNivEduNivGra() {
        return NivEduNivGra;
    }

    public void setNivEduCod(String NivEduCod) {
        this.NivEduCod = NivEduCod;
    }

    public void setNivEduDes(String NivEduDes) {
        this.NivEduDes = NivEduDes;
    }

    public void setNivEduEstReg(String NivEduEstReg) {
        this.NivEduEstReg = NivEduEstReg;
    }

    public void setNivEduNivGra(String NivEduNivGra) {
        this.NivEduNivGra = NivEduNivGra;
    }
}
