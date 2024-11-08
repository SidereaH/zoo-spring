package com.zoo.zoo_spring.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ticket_category", schema = "public", catalog = "zoo")
public class TicketCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ticket_category_id")
    private Long ticketCategoryId;

    @Column(name = "ticket_type")
    private String ticketType;

    @Column(name = "ticket_price")
    private double ticketPrie;

}
