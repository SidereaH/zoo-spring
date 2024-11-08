package com.zoo.zoo_spring.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ticket", schema = "public", catalog = "zoo")
public class Ticket {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ticket_id")
    private Long ticketId;

    @Column(name = "time")
    private String time;

    @ManyToOne
    @JoinColumn(name = "ticket_category_id")
    private TicketCategory ticketCategory;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
