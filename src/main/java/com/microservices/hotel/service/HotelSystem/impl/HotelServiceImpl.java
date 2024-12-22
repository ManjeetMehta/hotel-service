package com.microservices.hotel.service.HotelSystem.impl;

import com.microservices.hotel.service.HotelSystem.api.HotelService;
import com.microservices.hotel.service.HotelSystem.entities.Hotel;
import com.microservices.hotel.service.HotelSystem.exceptions.ResourceNotFoundException;
import com.microservices.hotel.service.HotelSystem.repositories.HotelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService
{
    @Autowired
    public HotelRepository hotelRepository;


    @Override
    public Hotel create(Hotel hotel)
    {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> allHotels()
    {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel findbyId(Long hotelId)
    {
        Logger log = LoggerFactory.getLogger("HotelServiceImpl.class");
        log.info("getting hotel information : "+ hotelId);
        return  hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("not found"));
    }
}
