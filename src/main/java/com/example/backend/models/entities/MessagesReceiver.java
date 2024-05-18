package com.example.backend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "message_receiver")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessagesReceiver {
    // todo: since there are no additional properties, other than making the connection
    // between the two tables, remove the class and use @ManyToMany
    // https://www.baeldung.com/jpa-many-to-many
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "users", referencedColumnName = "id", nullable = false)
    private User receiver;

    @ManyToOne
    @JoinColumn(name = "users", referencedColumnName = "id", nullable = false)
    private Message message;
}
