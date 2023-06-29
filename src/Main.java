import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // try... catch ... finally
        try {
            System.out.println("Bắt đầu try");
            // khối code có thể sinh ra lỗi
            int div = 10/3;
            int[] arr = {1,2,3};
            System.out.println(arr[4]);
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e2){
//            e2.printStackTrace();
        }finally {
            System.out.println("kết thúc qua trình try catch");
        }

        // throw
        // bài toán nhập các cạnh tam giác

//      getSideTriangle();
        checkNullException();
        System.out.println("jddjd");
    }
    public static int[] getSideTriangle(){
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vào cạnh thứ "+(i+1));
            int so = new Scanner(System.in).nextInt();
            if(so<=0){
                throw new IllegalArgumentException("Không thể nhập 1 cạnh có độ dài <=0");
            }else {
                    arr[i] = so;
            }
        }
        // kiểm tra tính đúng đắn
        int a =arr[0];
        int b =arr[1];
        int c =arr[2];
        if(a+b<=c || a+c<=b ||b+c<=a){
            throw new IllegalArgumentException("3 cạnh không hợp lệ");
        }
        return arr;
    }
    // throws
    public static void checkNullException () throws NullPointerException{
        List<String> list =  new ArrayList<>();
        list.add("Hùng");
        list.add("Nam");
        for (String str: list) {
            System.out.println(str.length());
        }
    }
}