package bg.example.drinkingFortunes.service;

import bg.example.drinkingFortunes.data.FortuneEntity;
import bg.example.drinkingFortunes.data.FortuneRepository;
import bg.example.drinkingFortunes.data.FortuneRequestDTO;
import bg.example.drinkingFortunes.data.FortuneResponseDTO;
import bg.example.drinkingFortunes.exception.EntityNotFoundException;
import bg.example.drinkingFortunes.util.FortuneMapper;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FortuneServiceImpl implements FortuneService {

  private final FortuneRepository fortuneRepository;
  private final FortuneMapper fortuneMapper;

  public FortuneServiceImpl(FortuneRepository fortuneRepository, FortuneMapper fortuneMapper) {
    this.fortuneRepository = fortuneRepository;
    this.fortuneMapper = fortuneMapper;
  }

  @Override
  public List<FortuneResponseDTO> getAllFortunes() {
    return fortuneMapper.map(fortuneRepository.findAll());
  }

  @Override
  public FortuneResponseDTO createFortune(FortuneRequestDTO fortuneRequestDTO) {
    return fortuneMapper.map(fortuneRepository.save(fortuneMapper.map(fortuneRequestDTO)));
  }

  @Override
  public void deleteFortune(Long id) {
    FortuneEntity fortuneEntity = fortuneRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException(id, "Fortune"));

    fortuneRepository.delete(fortuneEntity);
  }
}
