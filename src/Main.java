import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        initChoice();
        int choice = Integer.parseInt(sc.nextLine());
        int randomNumber = (int) Math.floor(Math.random()*10 +1);
        do{
            switch (choice){
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(3);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                case 5:
                    System.out.println(5);
                    break;
                case 6:
                    System.out.println(6);
                    break;
                case 7:
                    System.out.println(7);
                    break;
                case 8:
                    System.out.println(8);
                    break;
                case 9:
                    System.out.println(9);
                    break;
                case 10:
                    System.out.println(10);
                    break;
            }
        }while(choice == randomNumber);

    }

    private static void initChoice() {
        System.out.println("1.Nhập số N(N lẻ dương)");
        System.out.println("2. Kiểm tra N có là số nguyên tố");
        System.out.println("3. Hiển thị danh sách N số nguyên tố đầu tiên");
        System.out.println("4. Nhập vào mảng gồm N phần tử");
        System.out.println("5. Hiển thị danh sách mảng vừa nhập ở 4");
        System.out.println("6. Liệt kê danh sách các số nguyên tố trong mảng vừa nhập");
        System.out.println("7. Kiểm tra N có tồn tại trong mảng vừa nhập, nếu có trả về vị trí của N trong mảng");
        System.out.println("8. Xóa N khỏi mảng vừa nhập");
        System.out.println("9. Sắp xếp các phần tử của mảng vừa nhập ở 4 theo thứ tự tăng dần");
        System.out.println("10. Nhập vào 1 số X, chèn X vào mảng sắp xếp ở bước 7 sao cho không làm thay đổi thứ tự sắp xếp của mảng \n");
        System.out.print("Enter your choice:");
    }
}
