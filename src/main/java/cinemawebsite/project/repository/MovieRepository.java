package cinemawebsite.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cinemapj.ADVH.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    Movie findByTitle(final String title);
}