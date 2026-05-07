package IOFlow.D4_BufferFlow;

import java.io.*;

public class Demo3_Writer {
    /**
     *
     * <img src="file:C:\Users\35390\IdeaProjects\javaLearning\src\resources\imgs\BufferedWriter.png" width="1500">
     */
    static void main(String[] args) throws Exception {
//        Writer fw = new FileWriter("C:\\Users\\35390\\IdeaProjects\\javaLearning\\src\\resources\\imgs\\fileWriter.png");

        try (
                Writer fw = new FileWriter("C:\\Users\\35390\\IdeaProjects\\javaLearning\\src\\IOFlow\\D4_BufferFlow\\writeOut.txt");

                BufferedWriter bfw = new BufferedWriter(fw);
        ) {

            bfw.write("你好");
            bfw.newLine();
            bfw.write("我是ZTXD64");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
