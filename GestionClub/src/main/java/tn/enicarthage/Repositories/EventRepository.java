package tn.enicarthage.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.enicarthage.Entities.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, String> {
	Event getEventByTitle(String title);
}
