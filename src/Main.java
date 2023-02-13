import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================== 포켓몬 프로그램 DEMO ==================");
        do {
            System.out.printf("총 %d마리의 포켓몬이 생성되었습니다\n", super_pokemon.count);
            System.out.print("1) 포켓몬 생성  2) 프로그램 종료 :");
            int menu = scanner.nextInt();
            String in_name, in_skill;
            if (menu == 2) {
                // break the loop
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else if (menu == 1) {
                // menu option section
                System.out.print("1) 피카츄  2) 꼬부기  3) 파이리 :");
                int pokemon = scanner.nextInt();

                System.out.print("플레이어 이름 입력 : ");
                in_name = scanner.next();
                scanner.nextLine();

                System.out.print("사용 가능한 기술 입력(/로 구분하여 입력) : ");
                in_skill = scanner.next();
                // attack
                System.out.print("공격 번호 선택 : ");
                scanner.nextLine();
                int x = scanner.nextInt();
                String[] select = in_skill.split("/");

                if (pokemon == 1) {
                    pikachuSub p = new pikachuSub(in_name, in_skill);
                    p.sound();
                    p.show_info();
                    System.out.println(" ");
                    p.attack(select[x-1]);

                } else if (pokemon == 2) {
                    gobugiSub p = new gobugiSub(in_name, in_skill);
                    p.sound();
                    p.swim();
                    p.show_info();
                    System.out.println(" ");
                    p.attack(select[x-1]);

                }
                else if (pokemon == 3) {
                    pairiSub p = new pairiSub(in_name, in_skill);
                    p.sound();
                    p.show_info();
                    System.out.println(" ");
                    p.attack(select[x-1]);
                }
                else {
                    System.out.println("메뉴에서 골라 주세요");
                }
            }
        } while (true);
    }
}