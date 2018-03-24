package com.digiup.cacheservice.controller

import com.digiup.cacheservice.model.CachedEntity
import com.digiup.cacheservice.service.CachedEntityService
import com.digiup.cacheservice.service.EventService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/events")
class EventsController {
    @Autowired
    lateinit var entityService: CachedEntityService

    @Autowired
    lateinit var eventService: EventService

    @GetMapping("/")
    @ResponseBody
    fun updated() {
        val ent : List<CachedEntity> = entityService.getAll()
        //val rand : Int =  (Math.random() - (ent.size - 1) + 1).toInt()
        val rand : Int = 0
        eventService.updated(ent[rand])
    }


}