package alekseybykov.portfolio.json.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Aleksey Bykov
 * @since 18.10.2019
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @JsonProperty("isbn")
    private String isbn;

    @JsonProperty("title")
    private String title;

    @JsonProperty("pages")
    private int pages;
}
