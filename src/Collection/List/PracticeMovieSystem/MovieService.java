package Collection.List.PracticeMovieSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieService {
    ArrayList<Movie> movies = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public void start() {
        Movie movie = new Movie("抓娃娃","戏剧",9.9,"沈腾,吴亦凡",59.9);
        movies.add(movie);
        while (true) {
            System.out.println("——————系统启动——————");
            System.out.println("1.上架电影");
            System.out.println("2.下架电影");
            System.out.println("3.查询电影");
            System.out.println("4.封杀明星");
            System.out.println("5.展示全部电影");
            System.out.println("6.退出");
            System.out.println("请输入操作");
            switch (scanner.next()) {
                case "1":
                   //上架电影的方法
                    addMovie();
                    break;
                case "2":
                    //删除电影方法
                    deletMovie();
                    break;
                case "3":
                    //查询电影方法
                    queryMovieByName();
                    break;
                case "4":
                    //封杀明星方法
                    banActor();
                    break;
                case "5":
                    //展示全部电影
                    queryAllMovies();
                    break;
                case "6":
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入错误");

            }
        }

    }

    //展示全部电影
    private void queryAllMovies() {
        System.out.println("——————全部电影——————");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).getName() +" "+ movies.get(i).getType()+" "+ movies.get(i).getScore()+" "+movies.get(i).getActor()+ " "+ movies.get(i).getPrice());
        }
    }

    //封杀明星的所有电影
    private void banActor() {
        System.out.println("——————封杀明星——————");
        System.out.println("请输入要封杀的明星名称");
        String actor = scanner.next();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getActor().contains(actor)) {
                movies.remove(i);
                i--; //删除一个元素，索引会自动减1
            }
        }
    }

    //根据名称查询电影对象
    private void queryMovieByName() {
        System.out.println("——————查询电影——————");
        System.out.println("请输入要查询的电影名称");
        String name = scanner.next();
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                System.out.println(movie.getName() +" "+ movie.getType()+" "+ movie.getScore()+" "+movie.getActor()+ " "+ movie.getPrice());
            } else {
                System.out.println("没有此电影");
            }
        }

    }


    //删除电影方法
    private void deletMovie() {
        System.out.println("——————删除电影——————");
        System.out.println("请输入要删除的电影名称");
        String name = scanner.next();
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getName().equals(name)) {
                movies.remove(i);
                System.out.println("删除成功");
                i--;
            }
        }
        queryAllMovies();
    }

    //上架电影
    private void addMovie() {
        System.out.println("——————上架电影——————");
        //创建电影对象
        Movie movie = new Movie();
        //往电影对象里面输入内容
        System.out.println("请输入电影名称");
        movie.setName(scanner.next());
        System.out.println("请输入电影类型");
        movie.setType(scanner.next());
        System.out.println("请输入电影评分");
        movie.setScore(scanner.nextDouble());
        System.out.println("请输入电影主演");
        movie.setActor(scanner.next());
        System.out.println("请输入电影价格");
        movie.setPrice(scanner.nextDouble());
        movies.add(movie);
        System.out.println("添加成功");
    }


}
