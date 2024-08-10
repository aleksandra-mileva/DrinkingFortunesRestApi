package bg.example.drinkingFortunes.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FortuneRepository extends JpaRepository<FortuneEntity, Long> {

}
