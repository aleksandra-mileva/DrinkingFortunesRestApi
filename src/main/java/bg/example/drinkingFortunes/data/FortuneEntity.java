package bg.example.drinkingFortunes.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "fortunes")
public class FortuneEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank(message = "The content cannot be empty.")
  private String content;

  @NotBlank(message = "The author cannot be empty.")
  private String author;

  public Long getId() {
    return id;
  }

  public FortuneEntity setId(Long id) {
    this.id = id;
    return this;
  }

  public @NotBlank(message = "The content cannot be empty.") String getContent() {
    return content;
  }

  public FortuneEntity setContent(
      @NotBlank(message = "The content cannot be empty.") String content) {
    this.content = content;
    return this;
  }

  public @NotBlank(message = "The author cannot be empty.") String getAuthor() {
    return author;
  }

  public FortuneEntity setAuthor(
      @NotBlank(message = "The author cannot be empty.") String author) {
    this.author = author;
    return this;
  }
}
