package com.lunghr.informationsystemslab1.controllers

import com.lunghr.informationsystemslab1.model.exceptions.BookCreatureAlreadyExistsException
import com.lunghr.informationsystemslab1.model.exceptions.CityAlreadyExistsException
import com.lunghr.informationsystemslab1.model.exceptions.CityNotFoundException
import com.lunghr.informationsystemslab1.model.exceptions.RingAlreadyExistsException
import com.lunghr.informationsystemslab1.model.exceptions.RingAlreadyOwnedException
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(CityAlreadyExistsException::class)
    fun handleCityAlreadyExistsException(e: CityAlreadyExistsException): ResponseEntity<String> {
        return ResponseEntity.status(400).body(e.message)
    }

    @ExceptionHandler(RingAlreadyExistsException::class)
    fun handleRingAlreadyExistsException(e: RingAlreadyExistsException): ResponseEntity<String> {
        return ResponseEntity.status(400).body(e.message)
    }

    @ExceptionHandler(BookCreatureAlreadyExistsException::class)
    fun handleBookCreatureAlreadyExistsException(e: BookCreatureAlreadyExistsException): ResponseEntity<String> {
        return ResponseEntity.status(400).body(e.message)
    }

    @ExceptionHandler(CityNotFoundException::class)
    fun handleCityNotFoundException(e: CityNotFoundException): ResponseEntity<String> {
        return ResponseEntity.status(404).body(e.message)
    }

    @ExceptionHandler(RingAlreadyOwnedException::class)
    fun handleRingAlreadyOwnedException(e: RingAlreadyOwnedException): ResponseEntity<String> {
        return ResponseEntity.status(400).body(e.message)
    }
}
