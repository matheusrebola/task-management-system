package taskmanagementsystem.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import taskmanagementsystem.entities.Settings;

@Repository
public interface SettingsRepository extends JpaRepository<Settings, UUID> {

}
