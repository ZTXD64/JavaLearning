package IOFlow.D3_CharacterFlow;

import java.io.FileWriter;
import java.io.Writer;

public class Demo1_fileWrite {
    /**
     *
     * <img src="file:C:\Users\35390\IdeaProjects\javaLearning\src\resources\imgs\fileWriter.png" width="1500">
     */
    static void main(String[] args) {
        //FileWriter文件字符输出流
        //作用：以内存为基准，把内存中的数据以字符的形式写出到文件中去

        //1.创建写入的文件的位置
        try (
                Writer dest = new FileWriter("src/IOFlow/D3_CharacterFlow/WriteSomething.txt",true)) {
            //写入一个字符
            dest.write(97);
            dest.write("a");
            dest.write("b");
            dest.write("\r\n");

            //写入一个字符串
            dest.write("haha");
            dest.write("\r\n");

            //写入一个字符串的一部分
            dest.write("hello",0,5);
            dest.write("\r\n");


            //写入一个字符数组
            char[] charArray = "Baga!".toCharArray();
            dest.write(charArray);
            dest.write("\r\n");

            //这里不用写刷新和关闭因为try-with-resources自动帮助问我们关闭

            //刷新缓冲区,写入数据到硬盘
            dest.flush();

            //刷新后流可以继续使用，但是关闭后不可以继续使用
//            dest.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
