/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author user
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> map;
    
    public VehicleRegistry() {
        this.map = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        for (LicensePlate plate : this.map.keySet()) {
            if (licensePlate.equals(plate)) {
                return false;
            }
        }
        this.map.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        return this.map.getOrDefault(licensePlate, null);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.map.containsKey(licensePlate)) {
            this.map.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate e : this.map.keySet()) {
            System.out.println(e);
        }
    }
    
    public void printOwners() {
        ArrayList<String> track = new ArrayList<>();
        for (String owner : this.map.values()) {
            if (!track.contains(owner)) {
                track.add(owner);
            }
        }
        for (String singleInstance : track) {
            System.out.println(singleInstance);
        }
    }
}
