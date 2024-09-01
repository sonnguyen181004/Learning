/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class OrderDetails {
    private Pet pet;// con tro
    private Service service;//con tro

    public OrderDetails() {
        pet=new Pet();
        service=new Service();
        
    }

    public OrderDetails(Pet pet, Service service) {
        this.pet = pet;
        this.service = service;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "OrderDetails{" + "pet=" + pet + ", service=" + service + '}';
    }
    
    
}
