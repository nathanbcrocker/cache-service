package com.digiup.cacheservice

import com.digiup.cacheservice.model.CachedEntity
import com.digiup.cacheservice.service.CachedEntityService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component


@Component
class DataLoader(private val service : CachedEntityService) : CommandLineRunner {

    @Throws(Exception::class)
    override fun run(vararg strings: String) {
        var list = listOf(cachedEntity("one", "two"))
        service.saveAll(list)
    }

    fun cachedEntity(key: String, value: String) : CachedEntity {
        var c = CachedEntity()
        c.key = key
        c.value = value
        return c
    }
}