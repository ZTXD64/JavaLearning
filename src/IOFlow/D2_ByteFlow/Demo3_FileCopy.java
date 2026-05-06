package IOFlow.D2_ByteFlow;

import java.io.*;

public class Demo3_FileCopy {
    static void main(String[] args) {
        //目标：使用字节流完成文件的复制操作
        //源文件：src/IOFlow/D2_ByteFlow/03.txt
        //目标文件：src/IOFlow/D2_ByteFlow/TestSrc/new.txt(复制过去的时候必须带文件名的，否则无法自动生成文件名)
        fileCopy("src/IOFlow/D2_ByteFlow/ztxd.jpg", "src/IOFlow/D2_ByteFlow/TestSrc/new.jpg");
    }

    public static void fileCopy(String srcPath, String destPath){
        try(
                //创建字节输入输出管道
                InputStream src = new FileInputStream(srcPath);
                OutputStream dest = new FileOutputStream(destPath);
                I newI = new I();
                //try-with-resources
                //由于实现了Closable接口，所以调用之后会自动关闭。可以自定义一个类实现Closable接口，也会被认为是资源对象
                ) {


            //输入字节流并写入
            byte[] bytes = new byte[1024];
            int a;
            while ((a = src.read(bytes)) != -1) {       //.read方法返回的是字节的个数，把读取到的数据存入括号内的字节数组
                dest.write(bytes, 0, a);  //读取多少个字节，就写入多少个字节
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        //关闭流
//        src.close();
//        dest.close();


        //资源释放的方式
//        try-catch-finally
//        try{
//            ......
//        }
//        } catch (IOException e) {
//        e.printStackTrace();
//        } finally {

//            }
//        finally代码区的特点：无论try中的程序是正常执行了，还是出现了异常，最后都一定会执行finally区，除非VM终止。
//        作用：一般用于在程序执行完成后进行资源的释放操作（专业级做法）。

        //这样不好
        //新的资源释放方法：try with resources
        //把管道定义在try（）括号内部
        //该资源使用完毕后，会自动调用其close()方法，完成对资源的释放



    }

    static class I implements Closeable {

        @Override
        public void close() throws IOException {
            System.out.println("自定义的资源对象自动关闭了");
        }
    }
}
