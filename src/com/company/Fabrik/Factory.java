package com.company.Fabrik;

public class Factory {
    Machine machine;
    Worker[] workers;
    Manager manager;

    public hirereStaff(Worker[] workers, Manager manager) {
        this.workers = workers;
        this.manager = manager;
    }

    public fireStaff(Worker[] workers, Manager manager) {
        this.workers = workers;
        this.manager = manager;
    }

    public Factory(Machine machine, Worker[] workers, Manager manager) {
        this.machine = machine;
        this.workers = workers;
        this.manager = manager;
    }
}
