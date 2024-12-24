package com.microservices.hotel.service.HotelSystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "hotel")
public class Hotel
{
    @Id
    private Long id;
    private String name;
    private String location;
    private String about;
}