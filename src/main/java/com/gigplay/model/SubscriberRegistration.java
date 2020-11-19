package com.gigplay.model;

import java.util.List;

public class SubscriberRegistration extends UserRegistration {

    List<Gig> gigsSubscribed;


    public List<Gig> getGigsSubscribed() {
        return gigsSubscribed;
    }

    public void setGigsSubscribed(List<Gig> gigsSubscribed) {
        this.gigsSubscribed = gigsSubscribed;
    }
}
