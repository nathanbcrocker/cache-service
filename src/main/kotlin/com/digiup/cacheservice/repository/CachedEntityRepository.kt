package com.digiup.cacheservice.repository

import com.digiup.cacheservice.model.CachedEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CachedEntityRepository : JpaRepository<CachedEntity, String>