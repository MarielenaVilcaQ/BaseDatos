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
public class EstadoRegistroClass {
    
    String EstRegCod;
    String EstRegDes;
    String EstReg;

    public EstadoRegistroClass(String EstRegCod, String EstRegDes, String EstReg) {
        this.EstRegCod = EstRegCod;
        this.EstRegDes = EstRegDes;
        this.EstReg = EstReg;
    }

    public String getEstReg() {
        return EstReg;
    }

    public String getEstRegCod() {
        return EstRegCod;
    }

    public String getEstRegDes() {
        return EstRegDes;
    }

    public void setEstReg(String EstReg) {
        this.EstReg = EstReg;
    }

    public void setEstRegCod(String EstRegCod) {
        this.EstRegCod = EstRegCod;
    }

    public void setEstRegDes(String EstRegDes) {
        this.EstRegDes = EstRegDes;
    }
}
