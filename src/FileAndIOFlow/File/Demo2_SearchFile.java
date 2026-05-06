package FileAndIOFlow.File;

import java.io.File;
import java.io.IOException;

public class Demo2_SearchFile {
    public static void main(String[] args) {
        //try catch————————————ctrl+alt+T
        try {
            File dir = new File("D:/");
            searchFile(dir,"steam.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     *
     * @param dir 所寻找的文件夹
     * @param fileName 要寻找的文件名
     * @throws IOException
     */
    public static void searchFile(File dir,String fileName) throws IOException {
        //1.判断极端情况
        if (dir == null || dir.isFile() || !dir.exists()) {
            System.out.println("路径错误"); //三不搜：路径为空，路径是文件，路径不存在
            return;
        }

        //2.获取目录下的所有一级文件夹或者文件
        File[] files = dir.listFiles();

        //判断当前目录下是否存在一级文件对象，存在可以遍历
        if (files != null && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                //如果该对象是文件
                if (files[i].isFile()) {
                    if (files[i].getName().contains(fileName)) {
                        System.out.println("文件找到了!"+files[i].getAbsolutePath());
                        Runtime r = Runtime.getRuntime();
                        r.exec(files[i].getAbsolutePath());
                        r.exec(files[i].getAbsolutePath());
                        r.exec(files[i].getAbsolutePath());
                        r.exec(files[i].getAbsolutePath());
                        r.exec(files[i].getAbsolutePath());
                        r.exec(files[i].getAbsolutePath());
                        r.exec(files[i].getAbsolutePath());
                        r.exec(files[i].getAbsolutePath());
                        r.exec(files[i].getAbsolutePath());
                    }
                }

                //如果该对象不是文件，是文件夹，则遍历该文件夹
                searchFile(files[i],fileName);
            }
        }

    }

}
