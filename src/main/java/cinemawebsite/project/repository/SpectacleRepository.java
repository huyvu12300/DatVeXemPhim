package cinemawebsite.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cinemapj.ADVH.model.Spectacle;

@Repository
public interface SpectacleRepository extends JpaRepository<Spectacle, Long> {

    Spectacle findByTitle(final String title);
}