package com.digiup.cacheservice.model

import org.hibernate.annotations.GenericGenerator
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class CachedEntity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid",strategy = "uuid")
    @Column(name = "id", updatable = false, nullable = false)
    var id : String = ""

    @Column(name = "key", updatable = false, nullable = false)
    var key : String = ""

    @Column(name = "value", updatable = false, nullable = false)
    var value : String = ""
}