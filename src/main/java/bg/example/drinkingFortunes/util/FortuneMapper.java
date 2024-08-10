package bg.example.drinkingFortunes.util;

import bg.example.drinkingFortunes.data.FortuneEntity;
import bg.example.drinkingFortunes.data.FortuneRequestDTO;
import bg.example.drinkingFortunes.data.FortuneResponseDTO;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FortuneMapper {

  List<FortuneResponseDTO> map(List<FortuneEntity> fortunes);

  @Mapping(target = "id", ignore = true)
  FortuneEntity map(FortuneRequestDTO fortuneRequestDTO);

  FortuneResponseDTO map(FortuneEntity fortune);
}
