package com.gigplay.model;

import java.util.List;
import java.util.Map;

public class UserRegistration {
    String registrationId;
    PersonalInformation personalInformation;
    ProfessionalInformation professionalInformation;
    String bio;
    List<String> interests;
    Map<String, String> otherPlatformLinks;


    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public void setPersonalInformation(PersonalInformation personalInformation) {
        this.personalInformation = personalInformation;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public Map<String, String> getOtherPlatformLinks() {
        return otherPlatformLinks;
    }

    public void setOtherPlatformLinks(Map<String, String> otherPlatformLinks) {
        this.otherPlatformLinks = otherPlatformLinks;
    }

    public ProfessionalInformation getProfessionalInformation() {
        return professionalInformation;
    }

    public void setProfessionalInformation(ProfessionalInformation professionalInformation) {
        this.professionalInformation = professionalInformation;
    }
}
