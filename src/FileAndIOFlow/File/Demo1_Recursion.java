package FileAndIOFlow.File;

public class Demo1_Recursion {
    static void main(String[] args) {
//        什么是递归
//        递归是一种算法，在程序设计语言中广泛应用。
//        从形式上说：方法调用自身的形式称为方法递归（recursion）。
//        递归的形式
//        直接递归：方法自己调用自己。
//        关闭弹幕
//        间接递归：方法调用其他方法，其他方法又回调方法自己。

        //注意：如果递归没有控制好终止，会出现递归死循环，导致栈内存溢出错误

        //递归的三要素：
                //递归的公式：f(n) = f(n-1) * n;
                //递归的终结点：f(1);
                //递归的方向必须走向终结点

        System.out.println("5的阶乘为："+f(5));
        System.out.println("1-5的和为："+sum(5));
        System.out.println("第一天的桃子为："+monkey(1));
        System.out.println("第二天的桃子为："+monkey(2));
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return f(n-1) * n;
        }
    }

//    1+2+3+4+5+....+n --->公式：f(n) = f(n-1)+n
    public static int sum(int n) {
        if (n ==1){
            return 1;
        }else {
            return sum(n-1)+n;
        }
    }

//    猴子第一天摘下若干个桃子，当即吃了一半，觉得好不过瘾，于是又多吃了一个
//    第二天又吃了前天剩余桃子数量的一半，觉得好不过瘾，于是又多吃了一个
//    以后每天都是吃前天剩余桃子数量的一半，觉得好不过瘾，又多吃了一个
//    等到第10天的时候发现桃子只有1个了。
//    请问猴子第一天摘了多少个桃子？
//    公式：f(n+1) = f(n)-f(n)/2-1
//        变形:   2f(n+1)=2f(n)-f(n)-2
//               f(n)=2f(n+1)+2
    public static int monkey(int n) {
        if (n == 10){
            return 1;
        } else {
            return 2*monkey(n+1)+2;
        }
    }
}
