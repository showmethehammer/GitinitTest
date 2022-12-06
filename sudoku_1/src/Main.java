
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        int input = 0;                      // input 에 입력하는 숫자만큼 나열함.
        int while_cts = 0;                  // 배열중 중복숫자발생하는것에 횟수제한을 두어 초과하면 해당 x열 전체를 날림.
        int compare = 0;                    // num_1[][] 에 최종 입력될 숫자
        int compare_log = 0;                  // compare log 용도 사용도이며 비교하여 문제발생시 compare를 변경함.
        int arr_x = 0;                      // x 열의 배열값을 비교하기 위한 용도 비교시 다르면 +1 같으면 +0
        int arr_x_log = 0;                    // arr_x 값의 1step전의 log이며, arr_x 1step 후위 값비교하여 같으면 compare를 변경하도록 유도
        int arr_y = 0;                      // y 열의 배열값을 비교하기 위한 용도 비교시 다르면 +1 같으면 +0
        int arr_y_log = 0;                    // arr_y 값의 1step전의 log이며, arr_y 1step 후위 값비교하여 같으면 compare를 변경하도록 유도
        int arry_num_y = 0;
        int arry_num_x = 0;
        int arry_num_xy = 0;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();         // 숫자 입력
        int num_1[][] = new int[input][input];
        int check_x[] = new int[input];
        int check_y[] = new int[input];
        int check_xy[] = new int[input];
        for(int i = 0 ; i < input ; i++ ){
            for (int j = 0; j < input ; j++) {
                num_1[i][j] = -1;
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 비교시작
        for (int i = 0; i < input; i++)
        {
            for (int j = 0; j < input; j++) {
                while(true)
                {
                    while (arr_x < j) {
                        if (arr_x == arr_x_log)         // 값을 입력하기 위해 초기화 작업 진행
                        {
                            compare = 0;
                            compare_log = -1;           // 처음 비교할때 compare와 달라야 compare에 랜덤값을 입력하기 때문에 모든 -1로 설정.
                            arr_x = 0;
                            arr_x_log = 0;
                        }
                        else if (arr_x != arr_x_log)    // 기록변수 arr_x_1 가 arr_x 와다를경우 arr_x_1에 arr_x값을 기록함.
                        {
                            arr_x_log = arr_x;
                        }

                        // 현재값의 compare 와 기록변수 compare_1 이 다를경우 비교중 같은숫자가 나와서 초기화 됐다고 판단하여 다시시행
                        if (compare != compare_log)
                        {
                            compare = (int) (Math.random() * (double) input);
                            compare_log = compare;
                        }

                        if (num_1[i][arr_x] != compare)    // x line 전체를 비교하여 같은수가 하나라도 나오면 랜덤 숫자를 바꾸도록 진행
                        {
                            arr_x++;
                        }
                        else{break;}                       // 같은 숫자가 나오면 빠저나가도록 함.
                    }

                    // Y 방향 숫자 비교
                    while (arr_y < i && arr_x == j)         // x열이 완료된것을 arr_x 가 j 와 같다는것으로 판단하며, 같지않으면 넘어감.
                    {
                        if (arr_y == arr_y_log)
                        {
                            arr_y = 0;
                            arr_y_log = 0;
                        }
                        else if (arr_y != arr_y_log)
                        {
                            arr_y_log = arr_y;
                        }
                        if (compare != compare_log) // compare 와 compare_1 이 다를경우 타변수와 비교중 같은숫자가 나와서 초기화 됬다고 판단하여 다시시행
                        {
                            compare = (int)(Math.random()*(double)input);
                            compare_log = compare;
                        }
                        if (num_1[arr_y][j] != compare)    // arr_x 통과하면 +1 한번이라도 같은수가 나오면 +0
                        {
                            arr_y++;
                        }
                        else{break;}
                    }
                    // 비교 Cycle 완료 후
                    if(arr_y == i && arr_x == j) // 정상적으로 완료 됐을때 arr_y 와 i 값 arr_x 와 j 값이 같아짐.
                    {
                        arr_x = 0; arr_y = 0; compare_log = -1; while_cts = 0;
                        break;
                    }
                    else if (while_cts <= input *2 )
                    {
                        arr_x = 0; arr_y = 0; compare_log = -1; while_cts++;
                    }




                    else if(while_cts > input *2) {  // 랜덤 비교 오류 횟수가 허용횟수 초과시 동작 해당 X열 전체 0로 만든후 재입력

                        for (int k = 0; k < input; k++) {
                            check_y[k] = 0;
                            check_x[k] = 0;
                        }
                        int check_y_point = 0;
                        int check_x_point = 0;
                        int check_xy_point = 0;
                        arry_num_y = 0;
                        arry_num_x = 0;
                        arry_num_xy = 0;
                        for (int k = 0; k < input; k++)
                        {
                            check_x_point = 0;
                            check_y_point = 0;
                            for (int l = 0; l <= i; l++)
                            {
                                if(num_1[l][j] == k)
                                {
                                    check_y_point = 1;
                                    break;
                                }
                                if(check_y_point == 0 && l == i-1)
                                {
                                    check_y[arry_num_y] = k;
                                    arry_num_y++;
                                    break;
                                }
                            }
                            for (int l = 0; l <= j; l++)
                            {
                                if(num_1[i][l] == k)
                                {
                                    check_x_point = 1;
                                    break;
                                }
                                if(check_x_point == 0 && l == j - 1)
                                {
                                    check_x[arry_num_x] = k;
                                    arry_num_x++;
                                    break;
                                }
                            }
                        }
                        for (int l = 0; l < arry_num_y; l++)
                        {
                            for (int m = 0; m < arry_num_x; m++)
                            {
                                check_xy_point = 0;
                                if(check_y[l] != check_x[m])
                                {
                                    check_xy_point = 1;
                                }
                                if(check_xy_point == 0 && m == arry_num_x-1)
                                {
                                    check_xy[arry_num_xy] = check_y[l];
                                    arry_num_xy++;
                                    break;
                                }
                            }
                        }
                        if(arry_num_xy > 0 || arry_num_y != 0){
                            if(arry_num_xy > 0){
                                compare = check_xy[(int)(Math.random()*(double)(arry_num_xy-1))];
                                while_cts = 0;
                            }
                        }else{

                        }


                        if(arry_num_xy == 0){
                            j = 0;
                            for(int k = 0 ; k < input ; k++ ){ // 해당 X열 전체 0으로 만드는 작업.
                                num_1[i][k] = -1;
                            }
                        }

                        arr_x = 0; arr_y = 0; compare_log = -1; while_cts = 0;  // 누적카운트 초기화
                        if(arry_num_xy > 0){
                            break;
                        }
                    }
                }
                num_1[i][j] = compare;   // 비교가 완료되면 해당 값 입력.
//                System.out.print(num_1[i][j]+" ");
//                if(num_1[i][j] >= 10){ System.out.print(" "); }                // 결과값이 2자리수이면 띄어쓰기 1회
//                else{ System.out.print("  "); }          // 결과값이 1자리수이면 띄어쓰기 2회
//                if(j == arr_x){
//                    System.out.println();
//                }
            }

                for (int j = 0; j < input; j++) {
                    System.out.print(num_1[i][j] + " ");
                    if(num_1[i][j] >= 10){ System.out.print(" "); }                // 결과값이 2자리수이면 띄어쓰기 1회
                    else{ System.out.print("  "); }          // 결과값이 1자리수이면 띄어쓰기 2회
                }
                System.out.println("   "+(i+1)+"번째줄");

        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // 배열 입력작업이 끝나면 출력하는 코드.
//        System.out.println();
//        System.out.println();
//        for (int i = 0; i < input; i++) {
//            for (int j = 0; j < input; j++) {
//                System.out.print(num_1[i][j] + " ");
//                if(num_1[i][j] >= 10){ System.out.print(" "); }                // 결과값이 2자리수이면 띄어쓰기 1회
//                else{ System.out.print("  "); }          // 결과값이 1자리수이면 띄어쓰기 2회
//            }
//            System.out.println();
//        }
    }
}