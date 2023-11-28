package Capstone.BackEnd.Mosse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MosseRepositery extends JpaRepository<Mosse, Long> {
}
