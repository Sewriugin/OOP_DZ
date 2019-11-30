package com.company.Reapairs;

public class House {
    Window [] windows;
    Door [] doors;
    Roof[] roof;

    public House() {

    }

    public House(Window[] windows, Door[] doors, Roof[] roof) {
        this.windows = windows;
        this.doors = doors;
        this.roof = roof;
    }

    public void  makeRepairs(){
        for (Window w: windows) {
            w.repair();
        }
        for (Door d: doors){
            d.repair();
        }
        for (Roof r: roof){
            r.repair();
      }
    }
}
