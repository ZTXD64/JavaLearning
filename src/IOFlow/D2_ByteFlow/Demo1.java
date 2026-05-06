package IOFlow.D2_ByteFlow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    static void main(String[] args) throws Exception {
//        文件字节输入流，读取文件数据的步骤？
//            一次性读取完全部字节。
//            可以定义与文件一样大的字节数组读取，也可以使用官方API.
//        如何使用字节输入流读取中文内容输出时不乱码呢？
//            一次性读取完全部字节。
//            ●可以定义与文件一样大的字节数组读取，也可以使用官方API.
//         直接把文件数据全部读取到一个字节数组可以避免乱码，是否存在问题？
//            如果文件过大，定义的字节数组可能引起内存溢出。


//        构造器                                         说明
//        public FileInputStream(File file) 创建字节输入流管道与源文件接通
//        public FileInputStream(String pathname) 创建字节输入流管道与源文件接通
//
//            方法名                               说明
//        public int read()             每次读取一个字节返回，如果发现没有数据可读会返回-1.
//
//        public int read(byte[] buffer) 每次用一个字节数组去读取数据，返回字节数组读取了多少个字节，如果发现没有数据可读会返回-1.


//        一次读取完全部字节
//        Java官方为InputStream提供了如下方法，可以直接把文件的全部字节读取到一个字节数组中返回。
//        方法名称                                                    说明
//        public byte[] readAllBytes() throws IOException 直接将当前字节输入流对应的文件对象的字节数据装到一个字节数组返回
//        注意事项：：
//        直接把文件数据全部读取到一个字节数组可以避免乱码，是否存在问题？
//        如果文件过大，创建的字节数组也会过大，可能引起内存溢出。
//        读取文本适合字符流 ，，字节流适合做数据的转移，比如：文件复制

        FileInputStream is = new FileInputStream("C:\\Users\\35390\\IdeaProjects\\javaLearning\\src\\IOFlow\\D2_ByteFlow\\01.txt");

        //一开始我这样写是错误的，因为在这个循环中，单词循环读取了两次文件，然后输出第二次读取的文件，然后把第一次读取的字节丢弃，导致只读了三个字节
//        while (is.read() != -1) {
//            System.out.print(is.read());
//        }
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }
        //每次读取单个字节，性能较差，而且读取汉字字节一定会乱码


        System.out.println("====================");
//        每次用一个字节数组去读取数据，返回字节数组读取了多少个字节
        FileInputStream is2 = new FileInputStream("C:\\Users\\35390\\IdeaProjects\\javaLearning\\src\\IOFlow\\D2_ByteFlow\\02.txt");

        //定义一个变量存储每次读取了多少字节
        int c;
        byte[] bytes = new byte[3];
        while ((c = is2.read(bytes)) != -1) {
            String str = new String(bytes,0,c); //这里读取到多少个字节，就转化多少字节的字符串
            System.out.print(str);
        }
        //字节流不适合读内容，只适合复制文件


        //一次性读取全部内容，但是只适合小文件
        System.out.println("=============================");
        FileInputStream is3 = new FileInputStream("C:\\Users\\35390\\IdeaProjects\\javaLearning\\src\\IOFlow\\D2_ByteFlow\\02.txt");

        byte[] bytes1 = is3.readAllBytes();
        System.out.println(new String(bytes1));


    }
}
