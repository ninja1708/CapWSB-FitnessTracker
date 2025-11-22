package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.Id;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.training.api.Training;

import java.util.Date;

@Entity
@Table(name= "workout_session")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString

public class WorkoutSession {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @OneToOne
    @JoinColumn(name="training_id", nullable = false)
    private Training training_id;

    @Column(name ="timestamp", nullable = false)
    private String timestamp;

    @Column(name ="startLatitude", nullable = false)
    private double startLatitude;

    @Column(name ="startLongitude", nullable = false)
    private double startLongitude;

    @Column(name ="endLatitude", nullable = false)
    private double endLatitude;

    @Column(name ="endLongitude", nullable = false)
    private double endLongitude;

    @Column(name ="altitude", nullable = false)
    private double altitude;

    public WorkoutSession(
            final Training training_id,
            final String timestamp,
            final double startLatitude,
            final double startLongitude,
            final double endLatitude,
            final double endLongitude,
            final double altitude){
        this.training_id = training_id;
        this.timestamp = timestamp;
        this.startLatitude = startLatitude;
        this.startLongitude = startLongitude;
        this.endLatitude = endLatitude;
        this.endLongitude = endLongitude;
        this.altitude = altitude;

    }

}
