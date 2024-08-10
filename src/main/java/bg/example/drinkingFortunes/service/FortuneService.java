package bg.example.drinkingFortunes.service;

import bg.example.drinkingFortunes.data.FortuneRequestDTO;
import bg.example.drinkingFortunes.data.FortuneResponseDTO;
import java.util.List;
import javax.validation.Valid;

public interface FortuneService {

  List<FortuneResponseDTO> getAllFortunes();

  FortuneResponseDTO createFortune(@Valid FortuneRequestDTO fortuneRequestDTO);

  void deleteFortune(Long id);
}
