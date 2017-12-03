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
public class EstadoCivilClass {
    
    String EstCivCod;
    String EstCivDes;
    String EstCivEstReg;

    public EstadoCivilClass(String EstCivCod, String EstCivDes, String EstCivEstReg) {
        this.EstCivCod = EstCivCod;
        this.EstCivDes = EstCivDes;
        this.EstCivEstReg = EstCivEstReg;
    }

    public String getEstCivCod() {
        return EstCivCod;
    }

    public String getEstCivDes() {
        return EstCivDes;
    }

    public String getEstCivEstReg() {
        return EstCivEstReg;
    }

    public void setEstCivCod(String EstCivCod) {
        this.EstCivCod = EstCivCod;
    }

    public void setEstCivDes(String EstCivDes) {
        this.EstCivDes = EstCivDes;
    }

    public void setEstCivEstReg(String EstCivEstReg) {
        this.EstCivEstReg = EstCivEstReg;
    }
    
    
    
}
