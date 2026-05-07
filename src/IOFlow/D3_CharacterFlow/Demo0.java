package IOFlow.D3_CharacterFlow;

import java.io.FileReader;
import java.io.Reader;

public class Demo0 {
    static void main(String[] args) {
        //Reader->FileReader    Writer->FileWriter

//        FileReader文件字符输入流
//        作用：以内存为基准，可以把文件中的数据以字符的形式读入到内存中去。
//        构造器                                             说明
//        public FileReader(File file)                    创建字符输入流管道与源文件接通
//        public FileReader(String pathname)              创建字符输入流管道与源文件接通


//        方法名称                    说明
//        public int read()                      每次读取一个字符返回，如果发现没有数据可读会返回-1.
//        public int read(char[] buffer)        每次用一个字符数组去读取数据，返回字符数组读取了多少个字符，如果发现没有数据可读会返回-1.


        try (
                //1.创建文件字符输入流与源文件接通
                Reader fr = new FileReader("src/IOFlow/D3_CharacterFlow/poem.txt")
        ) {
            //2.采用字符数组的方式读取，每次读取多个字符
            char[] chars = new char[3];
            int len;
            while ((len = fr.read(chars)) != -1) {
                //3.把读取的字符转为字符串并输出
                String str  = new String(chars,0,len);
                System.out.print(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
