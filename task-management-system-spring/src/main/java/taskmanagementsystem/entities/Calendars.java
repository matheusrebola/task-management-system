package taskmanagementsystem.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Calendars(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String externalCalendarId,
		Boolean syncEnabled,
		LocalDateTime lastSync,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user) {

}
