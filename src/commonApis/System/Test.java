package commonApis.System;

public class Test {
    public static void main(String[] args) {
//        public static void eixt(int status)
//        终止当前运行的Java虚拟机
//        public static long currentTimeMillis()
//        返回当前系统的时间（毫秒值形式）
//        publicstaticvoidarraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数）数组拷贝




        //返回从1970.1.1 8.00到目前系统的时间，单位是毫秒
        long l = System.currentTimeMillis();
        System.out.println(l);


        //拷贝数组
        //第一个参数：原数组
        //第二个数组：启示索引
        //第三个参数：目的地数组
        //第四个参数：拷贝个数
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] a2 = new int[10];
        System.arraycopy(a,0,a2,4,4);
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }


        //1.exit
        //参数0表示正常终止，其他参数表示异常终止
        System.exit(0);
    }
}
