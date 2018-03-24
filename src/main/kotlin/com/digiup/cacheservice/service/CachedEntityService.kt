package com.digiup.cacheservice.service

import com.digiup.cacheservice.model.CachedEntity
import com.digiup.cacheservice.repository.CachedEntityRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class CachedEntityService {

    @Autowired
    lateinit var repository: CachedEntityRepository

    fun get(uuid: String) : Optional<CachedEntity> {
        return repository.findById(uuid)
    }

    fun getAll() : List<CachedEntity> {
        return repository.findAll();
    }

    fun save(e : CachedEntity) {
        repository.save(e)
    }

    fun saveAll(list : List<CachedEntity>) {
        repository.saveAll(list)
    }
}