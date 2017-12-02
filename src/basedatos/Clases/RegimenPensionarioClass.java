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
public class RegimenPensionarioClass {
    
    String RegPenCod;
    String RegPenSppCus;
    String RegPenFecInsAnio;
    String RegPenFecInsMes;
    String RegPenFecInsDia;
    String RegPenEstReg;
    String TIPO_REGIMEN_PENSIONARIO_TipRegPenCod;

    public RegimenPensionarioClass(String RegPenCod, String RegPenSppCus, String RegPenFecInsAnio, String RegPenFecInsMes, String RegPenFecInsDia, String RegPenEstReg, String TIPO_REGIMEN_PENSIONARIO_TipRegPenCod) {
        this.RegPenCod = RegPenCod;
        this.RegPenSppCus = RegPenSppCus;
        this.RegPenFecInsAnio = RegPenFecInsAnio;
        this.RegPenFecInsMes = RegPenFecInsMes;
        this.RegPenFecInsDia = RegPenFecInsDia;
        this.RegPenEstReg = RegPenEstReg;
        this.TIPO_REGIMEN_PENSIONARIO_TipRegPenCod = TIPO_REGIMEN_PENSIONARIO_TipRegPenCod;
    }

    public String getRegPenCod() {
        return RegPenCod;
    }

    public String getRegPenEstReg() {
        return RegPenEstReg;
    }

    public String getRegPenFecInsAnio() {
        return RegPenFecInsAnio;
    }

    public String getRegPenFecInsDia() {
        return RegPenFecInsDia;
    }

    public String getRegPenFecInsMes() {
        return RegPenFecInsMes;
    }

    public String getRegPenSppCus() {
        return RegPenSppCus;
    }

    public String getTIPO_REGIMEN_PENSIONARIO_TipRegPenCod() {
        return TIPO_REGIMEN_PENSIONARIO_TipRegPenCod;
    }

    public void setRegPenCod(String RegPenCod) {
        this.RegPenCod = RegPenCod;
    }

    public void setRegPenEstReg(String RegPenEstReg) {
        this.RegPenEstReg = RegPenEstReg;
    }

    public void setRegPenFecInsAnio(String RegPenFecInsAnio) {
        this.RegPenFecInsAnio = RegPenFecInsAnio;
    }

    public void setRegPenFecInsDia(String RegPenFecInsDia) {
        this.RegPenFecInsDia = RegPenFecInsDia;
    }

    public void setRegPenFecInsMes(String RegPenFecInsMes) {
        this.RegPenFecInsMes = RegPenFecInsMes;
    }

    public void setRegPenSppCus(String RegPenSppCus) {
        this.RegPenSppCus = RegPenSppCus;
    }

    public void setTIPO_REGIMEN_PENSIONARIO_TipRegPenCod(String TIPO_REGIMEN_PENSIONARIO_TipRegPenCod) {
        this.TIPO_REGIMEN_PENSIONARIO_TipRegPenCod = TIPO_REGIMEN_PENSIONARIO_TipRegPenCod;
    }
}
