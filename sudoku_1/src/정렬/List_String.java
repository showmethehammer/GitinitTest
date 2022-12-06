package 정렬;

import java.util.PriorityQueue;
import java.util.Scanner;

public class List_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ea = sc.nextInt();
        String a = "";
        PriorityQueue<String> list = new PriorityQueue<>();
        for (int i = 0; i < ea; i++) {
            a = sc.next();

            if(a != null && a != "" && a.length() < 10){
                a = "0" + a.length() + a;
                list.add(a);
                continue;
            }
            a = "0" + a.length() + a;
            list.add(a);
        }
        a = "";
        String out = "";
        while(true){
            if(a.equals(list.peek())){
                list.poll();
                continue;
            }
            a = list.poll();
            if(a != null){
                out += a.substring(2,a.length()) + "\n";
                continue;
            }
            break;
        }
        System.out.println(out);
    }
}
