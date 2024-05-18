package com.example.backend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "relationships")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Relationships {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "users", referencedColumnName = "id", nullable = false)
    private Users sender;

    @ManyToOne
    @JoinColumn(name = "users", referencedColumnName = "id", nullable = false)
    private Users receiver;

    @Column(name="status", nullable = false)
    private String status;

}
