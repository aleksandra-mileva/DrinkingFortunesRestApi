package bg.example.drinkingFortunes.data;

import javax.validation.constraints.NotBlank;

public record FortuneRequestDTO(
    @NotBlank(message = "The content cannot be empty.") String content,
    @NotBlank(message = "The author cannot be empty.") String author
) {

}
