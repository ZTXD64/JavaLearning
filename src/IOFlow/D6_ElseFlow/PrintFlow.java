package IOFlow.D6_ElseFlow;

import java.io.*;

public class PrintFlow {
    /**
     *
     * <img src="file:C:\Users\35390\IdeaProjects\javaLearning\src\resources\imgs\Print.png" width="1500">
     */
    static void main(String[] args) {
//        打印流有几种？各有什么特点？
//        打印流一般是指：PrintStream,PrintWriter两个类。
//        打印功能2者是一样的使用方式
//                PrintStream继承自字节输出流OutputStream,支持写字节
//        PrintWrite继承自字符输出流Writer,支持写字符
//        打印流的优势是什么？
//        两者在打印功能上都是使用方便，性能高效（核心优势）

        try (
                OutputStream os = new FileOutputStream("C:\\Users\\35390\\IdeaProjects\\javaLearning\\src\\IOFlow\\D6_ElseFlow\\writer.txt",true);
                PrintStream pw = new PrintStream(os);
                //PrintStream和PrintWriter都是字符输出流，所以打印功能一样
        ) {
            pw.println("hello world");
            pw.println(123);
            pw.println(true);
            pw.println(12.345);
            pw.println('a');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
