package IOFlow.D4_BufferFlow;

import java.io.*;

/**
 *
 * <img src="file:C:\Users\35390\IdeaProjects\javaLearning\src\resources\imgs\BufferedFileReader.png" width="1500">
 */
public class Demo2_Reader {
    static void main(String[] args) {
//        构造器                                              说明
//        public BufferedReade(Reader r)  把低级的字符输入流包装成字符缓冲输入流管道，从而提高字符输入流读字符数据的性能

        //字符缓冲输入流新增的功能：按照行读取字符
        //public String readLine()              读取一行数据，如果没数据可读了，返回null

        try (
                Reader is = new FileReader("C:\\Users\\35390\\IdeaProjects\\javaLearning\\src\\IOFlow\\D4_BufferFlow\\poem.txt");

                BufferedReader bis = new BufferedReader(is);
                //为什么不写成Reader bis = new BufferedReader(is);???
                //多态写法无法调用子类的特有方法，readline（）为Reader子类BufferedReader的特有方法
        ) {
            String lines;
            while ((lines = bis.readLine()) != null) {
                System.out.println(lines);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
