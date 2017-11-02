package ma.youscam.competition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.youscam.competition.model.Club;

@Repository
public interface ClubRepository extends JpaRepository<Club, String> {

}
