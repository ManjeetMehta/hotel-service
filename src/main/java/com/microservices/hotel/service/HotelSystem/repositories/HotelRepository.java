package com.microservices.hotel.service.HotelSystem.repositories;

import com.microservices.hotel.service.HotelSystem.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long>
{
}
