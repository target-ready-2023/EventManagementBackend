//package com.target.eventmanagementsystem.models;
//
//import jakarta.persistence.*;
//import java.util.HashSet;
//import java.util.Set;
//
//@Entity
//public class EventParticipant {
//    @EmbeddedId
//    private EventParticipantKey id;
//
//    @ManyToOne
//    @MapsId("userId") // Maps the userId attribute in the composite key
//    @JoinColumn(name = "user_id")
//    private Users user;
//
//    @ManyToOne
//    @MapsId("eventId") // Maps the eventId attribute in the composite key
//    @JoinColumn(name = "event_id")
//    private Events event;
//
//    public EventParticipantKey getId() {
//        return id;
//    }
//
//    public void setId(EventParticipantKey id) {
//        this.id = id;
//    }
//
//    public Users getUser() {
//        return user;
//    }
//
//    public void setUser(Users user) {
//        this.user = user;
//    }
//
//    public Events getEvent() {
//        return event;
//    }
//
//    public void setEvent(Events event) {
//        this.event = event;
//    }
//
//    public Integer getResult() {
//        return result;
//    }
//
//    public void setResult(Integer result) {
//        this.result = result;
//    }
//
//    private Integer result;
//    // Getters and setters
//
//
//}

package com.target.eventmanagementsystem.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class EventParticipant {
    @EmbeddedId
    private EventParticipantKey id;

    @ManyToOne
    @MapsId("userId") // Maps the userId attribute in the composite key
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @MapsId("eventId") // Maps the eventId attribute in the composite key
    @JoinColumn(name = "event_id")
    private Event event;

    public void setResult(Object o) {
    }
}
