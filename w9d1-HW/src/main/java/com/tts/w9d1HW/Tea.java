package com.tts.w9d1HW;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tea {

    @Id
    @GeneratedValue
    private long id;

    private String commonName;
    private String vendorName;
    private String category;
    private String location;
    private float weightGrams;
    private float volume_ml;
    private String brewingMethod;
    private String tastingNotes;

    public Tea() {
    }

    @Override
    public String toString() {
        return "Tea{" +
                "id=" + id +
                ", commonName='" + commonName + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", category='" + category + '\'' +
                ", location='" + location + '\'' +
                ", weightGrams=" + weightGrams +
                ", volume_ml=" + volume_ml +
                ", brewingMethod='" + brewingMethod + '\'' +
                ", tastingNotes='" + tastingNotes + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public float getWeightGrams() {
        return weightGrams;
    }

    public void setWeightGrams(float weightGrams) {
        this.weightGrams = weightGrams;
    }

    public float getVolume_ml() {
        return volume_ml;
    }

    public void setVolume_ml(float volume_ml) {
        this.volume_ml = volume_ml;
    }

    public String getBrewingMethod() {
        return brewingMethod;
    }

    public void setBrewingMethod(String brewingMethod) {
        this.brewingMethod = brewingMethod;
    }

    public String getTastingNotes() {
        return tastingNotes;
    }

    public void setTastingNotes(String tastingNotes) {
        this.tastingNotes = tastingNotes;
    }
}
