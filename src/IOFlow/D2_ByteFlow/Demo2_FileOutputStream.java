package IOFlow.D2_ByteFlow;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Demo2_FileOutputStream {
    static void main(String[] args) throws Exception {

//        FileOutputStrean文件字节输出流
//                    作用：以内存为基准，把内存中的数据以字节的形式写出到文件中去。
//        构造器                                                                  说明
//        public FileOutputStream(File file)                                     创建字节输出流管道与源文件对象接通
//        public FileOutputStream(String filepath)                               创建字节输出流管道与源文件路径接通
//        public FileOutputStream(File file, boolean append)                     创建字节输出流管道与源文件对象接通，可追加数据
//        public FileOutputStream(String filepath, boolean append)               创建字节输出流管道与源文件路径接通，可追加数据

        //1.写入文件时，如果没有该文件，会自动创建文件，“true”可以保留写入内容，而不是每次写入都要覆盖前面的内容
//        FileOutputStream is = new FileOutputStream("src/IOFlow/D2_ByteFlow/03.txt",true);
        FileOutputStream is = new FileOutputStream("src/IOFlow/D2_ByteFlow/03.txt");


        //2.写入一个字节数据
        is.write(97);
        is.write('b');
        is.write('我');  //写入字符数据，会乱码

        is.write("\r\n".getBytes());    //写入换行

        //3.写一个字节数组出去
        byte[] bytes = "我爱你中国".getBytes();
        is.write(bytes);
        is.write("\r\n".getBytes());

        //4.写一个字节数组的一部分出去
        is.write(bytes,0,3);
        is.write("\r\n".getBytes());

        //关闭管道，释放资源
        is.close();
    }
}
