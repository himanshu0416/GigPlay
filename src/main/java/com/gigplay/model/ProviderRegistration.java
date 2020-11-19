package com.gigplay.model;

import java.util.List;

public class ProviderRegistration extends UserRegistration {
    List<Gig> gigsProvided;
    int totalYearsOfExperience;

    public List<Gig> getGigsProvided() {
        return gigsProvided;
    }

    public void setGigsProvided(List<Gig> gigsProvided) {
        this.gigsProvided = gigsProvided;
    }

    public int getTotalYearsOfExperience() {
        return totalYearsOfExperience;
    }

    public void setTotalYearsOfExperience(int totalYearsOfExperience) {
        this.totalYearsOfExperience = totalYearsOfExperience;
    }
}
