package taskmanagementsystem.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Tasks(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String title,
		String description,
		LocalDateTime dueDate,
		Priority priority,
		StatusTask statusTask,
		LocalDateTime createdAt,
		LocalDateTime updatedAt,
		Users user) {

}
