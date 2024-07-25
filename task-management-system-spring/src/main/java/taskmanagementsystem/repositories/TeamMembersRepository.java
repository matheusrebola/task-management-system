package taskmanagementsystem.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import taskmanagementsystem.entities.TeamMembers;

@Repository
public interface TeamMembersRepository extends JpaRepository<TeamMembers, UUID> {

}
