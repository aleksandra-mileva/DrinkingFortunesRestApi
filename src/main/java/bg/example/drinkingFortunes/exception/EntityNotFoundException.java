package bg.example.drinkingFortunes.exception;

public class EntityNotFoundException extends RuntimeException{

  public EntityNotFoundException(Long id, String entity) {
    super(entity + " with id " + id + " does not exist.");
  }
}
