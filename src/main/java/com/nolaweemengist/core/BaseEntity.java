package com.nolaweemengist.core;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    @Version
    private long version;

    protected BaseEntity(){
        id = null;
    }
}
