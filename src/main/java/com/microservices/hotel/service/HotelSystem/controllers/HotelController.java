package com.microservices.hotel.service.HotelSystem.controllers;

import com.microservices.hotel.service.HotelSystem.api.HotelService;
import com.microservices.hotel.service.HotelSystem.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController
{
    @Autowired
    private HotelService hotelService;


    public ResponseEntity<Hotel> create(@RequestBody Hotel hotel)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }

    @GetMapping("{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Long hotelId)
    {
        return  ResponseEntity.ok(hotelService.findbyId(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel()
    {
        return ResponseEntity.ok(hotelService.allHotels());
    }
}
