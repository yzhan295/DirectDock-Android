package com.direct.dock.model;

/**
 * Created by ESG020 on 2017/11/14.
 */

public class VehicleData {
    public String getOk() {
        return ok;
    }

    public void setOk(String ok) {
        this.ok = ok;
    }

    public String getAc_temp() {
        return ac_temp;
    }

    public void setAc_temp(String ac_temp) {
        this.ac_temp = ac_temp;
    }

    public String getGear_d_pos() {
        return gear_d_pos;
    }

    public void setGear_d_pos(String gear_d_pos) {
        this.gear_d_pos = gear_d_pos;
    }

    public String getTire_lf() {
        return tire_lf;
    }

    public void setTire_lf(String tire_lf) {
        this.tire_lf = tire_lf;
    }

    public String getTire_lr() {
        return tire_lr;
    }

    public void setTire_lr(String tire_lr) {
        this.tire_lr = tire_lr;
    }

    public String getTire_rf() {
        return tire_rf;
    }

    public void setTire_rf(String tire_rf) {
        this.tire_rf = tire_rf;
    }

    public String getTire_rr() {
        return tire_rr;
    }

    public void setTire_rr(String tire_rr) {
        this.tire_rr = tire_rr;
    }

    private String ok;
    private String ac_temp;
    private String gear_d_pos;
    private String tire_lf;
    private String tire_lr;
    private String tire_rf;
    private String tire_rr;

    @Override
    public String toString() {
        return "VehicleData{" +
                "ok='" + ok + '\'' +
                ", ac_temp='" + ac_temp + '\'' +
                ", gear_d_pos='" + gear_d_pos + '\'' +
                ", tire_lf='" + tire_lf + '\'' +
                ", tire_lr='" + tire_lr + '\'' +
                ", tire_rf='" + tire_rf + '\'' +
                ", tire_rr='" + tire_rr + '\'' +
                '}';
    }
}
