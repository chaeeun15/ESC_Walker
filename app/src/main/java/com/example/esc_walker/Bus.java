package com.example.esc_walker;

public class Bus {
    private String charge;
    private String depplacename;
    private String depplandtime;
    private String arrplandtime;

    public Bus(String arrplandtime, String charge, String depplacename, String depplandtime) {
        this.charge = charge;
        this.arrplandtime = arrplandtime;
        this.depplacename = depplacename;
        this.depplandtime = depplandtime;
    }

    public String getCharge() {
        return charge;
    }

    public String getDepplacename() {
        return depplacename;
    }

    public String getDepplandtime() {
        return depplandtime;
    }

    public String getArrplandtime() {
        return arrplandtime;
    }
}

