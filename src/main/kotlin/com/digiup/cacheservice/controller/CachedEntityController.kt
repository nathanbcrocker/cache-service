package com.digiup.cacheservice.controller

import com.digiup.cacheservice.model.CachedEntity
import com.digiup.cacheservice.service.CachedEntityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/entities")
class CachedEntityController() {

    @Autowired
    lateinit var service : CachedEntityService

    @GetMapping("/")
    @ResponseBody
    fun get(): List<CachedEntity> {
        return service.getAll()
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    fun get(@PathVariable(name = "uuid", required = true) uuid : String): Optional<CachedEntity> {
        return service.get(uuid)
    }

    @GetMapping("/{uuid}+update")
    @ResponseBody
    fun update(@PathVariable(name = "uuid", required = true) uuid : String,
               @RequestParam(name = "val", required = true) value : String): Optional<CachedEntity> {
        val ent : Optional<CachedEntity> = service.get(uuid)
        ent.ifPresent{
            it.value = value
            service.save(it)
        }

        return ent
    }
}