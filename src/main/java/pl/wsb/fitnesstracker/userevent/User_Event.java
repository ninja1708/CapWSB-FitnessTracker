package pl.wsb.fitnesstracker.userevent;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.event.Event;
import pl.wsb.fitnesstracker.user.api.User;

@Entity
@Table(name = "user_event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class User_Event{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User_Event user_id;

    @ManyToOne(optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id", nullable = false)
    private User_Event event_id;

    @Column(name = "status", nullable = false)
    private String status;

    public User_Event(User user_event, User_Event user_id, User_Event event_id, String status) {
        this.user_id = user_id;
        this.event_id = event_id;
        this.user_id = user_id;
        this.status = status;

    }
}

