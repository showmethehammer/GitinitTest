package 정렬;

import java.util.*;


public class List_String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정해242424봄");
        int ea = sc.nextInt();
        ArrayList<String>[] list = new ArrayList[51];
        String a;
        for (int i = 0; i < ea; i++) {
            a = sc.next();
            if(list[a.length()] != null && list[a.length()].indexOf(a) < 0){

                list[a.length()].add(a);
            }else if(list[a.length()] == null) {
                list[a.length()] = new ArrayList<>();
                list[a.length()].add(a);
            }
        }
        for (int i = 1; i < list.length; i++) {
            if(list[i] != null){
                Collections.sort(list[i]);
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.println(list[i].get(j));
                }
            }
        }
    }
}
