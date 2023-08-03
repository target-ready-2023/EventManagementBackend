//package com.target.eventManagementSystem.models;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Entity
//@Data
//public class EventParticipant {
//    @EmbeddedId
//    private EventParticipantKey id;
//
//    @ManyToOne
//    @MapsId("userId") // Maps the userId attribute in the composite key
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToOne
//    @MapsId("eventId") // Maps the eventId attribute in the composite key
//    @JoinColumn(name = "event_id")
//    private Event event;
//
//    private int result;
//}
