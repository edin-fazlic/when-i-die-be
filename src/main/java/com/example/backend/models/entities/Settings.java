package com.example.backend.models.entities;

import com.example.backend.models.enums.PassedAwayConfirmationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "settings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="deathCheck", nullable = false)
    private PassedAwayConfirmationType deathCheck;

    @Column(name="checkAfterDays")
    private Integer checkAfterDays;

    @Column(name="deadline")
    private Date deadline;
}
