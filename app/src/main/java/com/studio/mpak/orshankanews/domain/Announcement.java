package com.studio.mpak.orshankanews.domain;

import java.util.ArrayList;
import java.util.List;

public class Announcement {
    private int id;
    private List<String> events = new ArrayList<>();
    private String place;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getEvents() {
        if (null == events) {
            events = new ArrayList<>();
        }
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "id=" + id +
                ", events=" + events +
                ", place='" + place + '\'' +
                '}';
    }
}
