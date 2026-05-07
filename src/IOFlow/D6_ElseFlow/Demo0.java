package IOFlow.D6_ElseFlow;

import java.io.*;

public class Demo0 {
    static void main(String[] args) {
//        字符输入转换流
//        InputStreamReader->继承于Reader

        //目标：演示一个问题：不同编码码，读取文件内容时，会出现乱码的问题。
        //代码UTF-8  文件UTF-8 读取不乱吗
        // 代码UTF-8   文件GBK 读取乱码

        //InputStreamReader(InputStream in, String charsetName) 把原始的字节输入流，按照指定的字符集编码转换为字符输入流

        try (
//                //1.创建文件字符输入流与源文件接通
//                Reader fr = new FileReader("src/IOFlow/D6_ElseFlow/read.txt");
//                //2.创建转换流，将输入流转换为字符输入流
//                BufferedReader br = new BufferedReader(fr);
                //创建文件字节输入流与源文件接通
                InputStream is = new FileInputStream("src/IOFlow/D6_ElseFlow/read.txt");
                InputStreamReader isr = new InputStreamReader(is,"GBK");
                BufferedReader br = new BufferedReader(isr);
        ) {
            //定义读取行变量
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
