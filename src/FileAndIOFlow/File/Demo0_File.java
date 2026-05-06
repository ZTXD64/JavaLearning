package FileAndIOFlow.File;

import java.io.File;
import java.io.IOException;

public class Demo0_File {
    static void main(String[] args) throws IOException {
//        File
//        File是java.io.包下的类
//        File类的对象，用于代表当前操作系统的文件（可以是文件、或文件夹）。
        //IO
        //IO用于读写文件或者网络中的数据


//        File类创建文件的功能
//                public boolean createNewFile() 创建一个新的空的文件
//                public boolean mkdir() 只能创建一级文件夹
//                public boolean mkdirs() 可以创建多级文件夹
//        File类删除文件的功能
//                public boolean delete() 删除文件、空文件夹
//        注意：delete方法默认只能删除文件和空文件夹，删除后的文件不会进入回收站。

        File f = new File("C:\\Users\\35390\\IdeaProjects\\javaLearning\\src\\resources\\a.txt");

        File f2 = new File("src/resources/a.txt");      //相对路径

        //ceatNewFile()创建一个新的空的文件
        File f3 = new File("src/resources/b.txt");
        System.out.println(f3.createNewFile());

        //创建一级文件夹
        File f4 = new File("src/resources/new");
        System.out.println(f4.mkdir());

        //创建多级文件夹
        File f5 = new File("src/resources/mkdirs/dir");
        System.out.println(f5.mkdirs());



        //File类的删除文件功能(也可以删除文件夹，但是只能删除非空文件夹)
        System.out.println(f.delete());
        System.out.println(f3.delete());
        System.out.println(f4.delete());
        System.out.println(f5.delete());

//        File提供的遍历文件夹的方法
//        public String[] list() 获取当前目录下所有的”一级文件名称”到一个字符串数组中去返回。
//        public File[] listFiles() 获取当前目录下所有的”一级文件对象”到一个文件对象数组中去返回（重点）
//        使用listFiles方法时的注意事项：
//
//        当主调是文件，或者路径不存在时，返回null
//        当主调是空文件夹时，返回一个长度为0的数组
//        当主调是一个有内容的文件夹时，将里面所有一级文件和文件夹的路径放在File数组中返回
//        当主调是一个文件夹，且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
//        当主调是一个文件夹，但是没有权限访问该文件夹时，返回null

        //list()方法，获取文件和文件夹的名字
        File f6 = new File("D:\\01AAA\\02. 前端Web基础(JS+Vue+Ajax)\\代码\\JS-Vue");
        String[] list = f6.list();
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("==========================");
        //listFiles()获取文件对象
        File[] files = f6.listFiles();
        for (File file : files) {
            if (file.isFile()){
                System.out.println(file.getName());
            } else {
                String[] list1 = file.list();
                for (String string : list1) {
                    System.out.println(string);
                }
            }

        }
    }
}
