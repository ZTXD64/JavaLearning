package IOFlow.D7_IOFrame;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 *
 * <img src="file:C:\Users\35390\IdeaProjects\javaLearning\src\resources\imgs\commonsIO.png" width="1500">
 */
public class Commons_IOFrame {
    static void main(String[] args) throws IOException {

        //目标：IO框架

        //copy File
        FileUtils.copyFile(new File("src\\IOFlow\\D7_IOFrame\\1.txt"), new File("src\\IOFlow\\D7_IOFrame\\new.txt"));

        //deleteDirectory
//        FileUtils.deleteDirectory(new File(""));
    }
}
