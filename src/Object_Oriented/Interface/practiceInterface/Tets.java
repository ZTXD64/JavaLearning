package Object_Oriented.Interface.practiceInterface;

public class Tets {
    public static void main(String[] args) {

        //创建乒乓球运动员对象
        PingpangSporter a = new PingpangSporter("李鹏林",20);

        System.out.println(a.getName()+a.getAge());
        a.learn();
        a.speakEnglish();


        //创建乒乓球教练员对象
        PingpangCoach b = new PingpangCoach("ztxd",20);
        System.out.println(b.getName()+b.getAge());
        b.teach();
        b.speakEnglish();

    }
}
