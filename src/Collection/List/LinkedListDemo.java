package Collection.List;

import java.util.LinkedList;

public class LinkedListDemo {
    static void main() {
        //由于linkedlist首尾操作速度极快，所以我们可以用来开发队列对象

        //创建队列对象
        LinkedList<String> list = new LinkedList();

        //入列
        list.addLast("张三");
        list.addLast("李四");
        list.addLast("王五");
        list.addLast("赵六");
        System.out.println(list);

        //出列
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());

        System.out.println(list);

        //还可以开发栈：栈是先进后出，后进先出
        //push:压栈
        //pop:弹栈
        //以上两种方法与addfirst，removefirst在源码中无区别。
        LinkedList<String> clip = new LinkedList<>();
        clip.addFirst("bullet_1");
        clip.addFirst("bullet_2");
        clip.addFirst("bullet_3");
        clip.addFirst("bullet_4");
        clip.push("bullet_5");
        clip.push("bullet_6");
        System.out.println(clip);

        clip.pop();
        clip.pop();
        clip.pop();
        System.out.println(clip);
    }
}
