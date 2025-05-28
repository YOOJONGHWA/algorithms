package ch04;

import java.util.Scanner;

public class IntStackTester {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 위치 (6) 빔확인 (7) 가득찼는지 (8) 삭제 (0) 종료: ");

            int menu = stdIn.nextInt();
            if(menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다");
                    } catch (IntStack.EmptyStackIntException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다");
                    } catch (IntStack.EmptyStackIntException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:
                    s.dump();
                    break;

                case 5:
                    System.out.print("찾을려는 숫자를 입력하세요");
                    x = stdIn.nextInt();
                    int result = s.indexOf(x);

                    if (result == -1) {
                        System.out.println("해당 숫자는 존재하지 않습니다.");
                    }
                    System.out.println(result);
                    break;

                case 6:
                    if (s.isEmpty()) {
                        System.out.println("비어 있습니다.");
                    }
                    else {
                        System.out.println("비어 있지 않습니다.");
                    }

                    break;

                case 7:
                    if (s.isFull()) {
                        System.out.println("가득차 있습니다.");
                    }
                    else {
                        System.out.println("여유 있음");
                    }
                    break;

                case 8:
                    s.clear();
                    System.out.println("모두 지웠습니다.");
                    break;
            }
        }
    }
}
