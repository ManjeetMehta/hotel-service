package com.microservices.hotel.service.HotelSystem.api;

import com.microservices.hotel.service.HotelSystem.entities.Hotel;

import java.util.List;

public interface HotelService
{
    public Hotel create(Hotel hotel);

    public List<Hotel> allHotels();

    public Hotel findbyId(Long hotelId);
}
