package ArrPractice;

public class ArrayPractice {
    /*
        กำหนด value ตอนสร้าง array เลย
    */
    String[] foods = {"Hamburger", "Sausage", "Sandwhich", "rice"};
    
    public static void printArr(String[] str) {
        for (String i : str) {
            System.out.println(i);
        }
    }
    
    public void Array() {
        /*
            print attribute ที่ถูกสร้างไปแล้ว
        */
        printArr(foods);
        
        /*
            สร้าง array ก่อนแล้วมากำหนด value ทีหลัง
        */
        String[] drink = new String[3];
        drink[0] = "coke";        
        drink[1] = "milk";
        drink[2] = "tea";
        printArr(drink);
    }
}
