package taskmanagementsystem.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import taskmanagementsystem.entities.Calendars;

@Repository
public interface CalendarsRepository extends JpaRepository<Calendars, UUID> {

}
