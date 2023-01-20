package org.acme;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;

import javax.annotation.security.DenyAll;

@DenyAll
public interface MyResource extends PanacheEntityResource<MyEntity, Long> {
}
