package com.api.repositories;

import com.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
//Significa <Entidade / Chave primaria>

}
