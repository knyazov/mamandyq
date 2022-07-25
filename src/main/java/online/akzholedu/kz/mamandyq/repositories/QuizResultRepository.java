package online.akzholedu.kz.mamandyq.repositories;

import online.akzholedu.kz.mamandyq.entities.QuizResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface QuizResultRepository extends JpaRepository<QuizResult, Long> {
}
