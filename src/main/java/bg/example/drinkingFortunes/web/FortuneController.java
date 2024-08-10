package bg.example.drinkingFortunes.web;

import bg.example.drinkingFortunes.data.FortuneRequestDTO;
import bg.example.drinkingFortunes.data.FortuneResponseDTO;
import bg.example.drinkingFortunes.service.FortuneService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fortunes")
public class FortuneController {

  private final FortuneService fortuneService;

  public FortuneController(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @GetMapping
  public ResponseEntity<List<FortuneResponseDTO>> getAllFortunes(){
    return new ResponseEntity<>(fortuneService.getAllFortunes(), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<FortuneResponseDTO> createFortune(@RequestBody @Valid FortuneRequestDTO fortuneRequestDTO){
    return new ResponseEntity<>(fortuneService.createFortune(fortuneRequestDTO), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deleteFortune(@PathVariable Long id) {
    fortuneService.deleteFortune(id);
  }
}
