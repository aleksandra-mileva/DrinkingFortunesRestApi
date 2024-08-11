package bg.example.drinkingFortunes.data;

public class FortuneResponseDTO {

  private Long id;
  private String content;
  private String author;

  public Long getId() {
    return id;
  }

  public FortuneResponseDTO setId(Long id) {
    this.id = id;
    return this;
  }

  public String getContent() {
    return content;
  }

  public FortuneResponseDTO setContent(String content) {
    this.content = content;
    return this;
  }

  public String getAuthor() {
    return author;
  }

  public FortuneResponseDTO setAuthor(String author) {
    this.author = author;
    return this;
  }
}
