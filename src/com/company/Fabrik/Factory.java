package com.company.Fabrik;

public class Factory {
    Machine machine;
    Worker[] workers;
    Manager manager;

    //TODO у метода пропущен тип возвращаемого значения, в данном случае void
    public void hirereStaff(Worker[] workers, Manager manager) {
        this.workers = workers;
        this.manager = manager;
    }

    //TODO у метода пропущен тип возвращаемого значения, в данном случае void
    public void fireStaff(Worker[] workers, Manager manager) {
        this.workers = workers;
        this.manager = manager;
    }

    public Factory(Machine machine, Worker[] workers, Manager manager) {
        this.machine = machine;
        this.workers = workers;
        this.manager = manager;
    }
}
