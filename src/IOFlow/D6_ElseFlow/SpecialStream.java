package IOFlow.D6_ElseFlow;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class SpecialStream {
    /**
     *
     * <img src="file:C:\Users\35390\IdeaProjects\javaLearning\src\resources\imgs\DataInputOutputStream.png" width="1500">
     *     <img src="file:C:\Users\35390\IdeaProjects\javaLearning\src\resources\imgs\DataOutputStream.png" width="1500">
     */
    public static void main(String[] args) {
        //特殊数据流：DataInputStream,DataOutputStream
        //DataOutputStream:把数据写入文件，允许把数据和其类型一块写进去

        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/IOFlow/D6_ElseFlow/writer.txt"))
        ) {
            dos.writeInt(123); // 写入一个整数
            dos.writeBoolean(true); // 写入一个布尔值
            dos.writeChar('a'); // 写入一个字符
            dos.writeDouble(123.456);//写入一个双精度浮点数
            dos.writeUTF("hello world");//写入一个字符串

        } catch (Exception e) {
            e.printStackTrace();
        }

        try (
                DataInputStream dis = new DataInputStream(new FileInputStream("src/IOFlow/D6_ElseFlow/writer.txt"))
        ) {
            System.out.println(dis.readInt());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
