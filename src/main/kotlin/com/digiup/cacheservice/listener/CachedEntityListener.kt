package com.digiup.cacheservice.listener

import com.digiup.cacheservice.event.CachedEntityUpdated
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class CachedEntityListener {
    @EventListener
    fun updated(c : CachedEntityUpdated) {
        System.out.println(String.format("updated cached entity %s", c.e.id))
    }
}