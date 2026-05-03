package Collection.List.PracticeMovieSystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    //创建电影类的成员变量。
    private String name;
    private String type;
    private double score;
    private String actor;
    private double price;
}
