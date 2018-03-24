package com.digiup.cacheservice.service

import com.digiup.cacheservice.event.CachedEntityUpdated
import com.digiup.cacheservice.model.CachedEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class EventService {
    @Autowired
    lateinit var publisher : ApplicationEventPublisher

    fun updated(e : CachedEntity) : CachedEntityUpdated {
        val up = CachedEntityUpdated(e)
        publisher.publishEvent(up)
        return up
    }
}