package Capstone.BackEnd.Giocatori;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiocatoriRepository extends JpaRepository<Giocatori, Long> {
}
