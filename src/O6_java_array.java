public class O6_java_array {
    public static void main(String[] args) {
        //声明数组变量
        int[] newarray;


        //创建数组：dataType[] arrayRefVar = new dataType[arraySize];
        double[] myList = new double[10];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;

        double total = 0;
        for (int i = 0; i < 10; i++) {
            total+=myList[i];
        }

        System.out.println(total+"\n");


        //forEach循环 它能在不使用下标的情况下遍历数组。
        for (double element: myList){
            System.out.println(element);
        }

    }
}
