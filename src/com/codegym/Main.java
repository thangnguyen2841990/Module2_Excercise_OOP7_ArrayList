package com.codegym;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        int choice = -1;
        CandidatureManagement candidatureManagement = new CandidatureManagement();
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice > 3) {
                System.out.println("chọn lại Menu!!!!");
            }
            switch (choice) {
                case 1: {
                    candidatureManagement.displayAllCandidature();
                    break;
                }

                case 2: {
                    System.out.println("----Nhập thông tin thí sinh mới----");
                    System.out.println("Nhập số lượng thí sinh: ");
                    int n = scanner.nextInt();
                    Candidature newCandidature;
                    for (int i = 0; i < n; i++) {
                        System.out.println("Thí sinh số: "+ (i+1));
                        newCandidature = creatNewCandidature();
                        candidatureManagement.addNewCandidature(newCandidature);
                        System.out.println("Đã thêm thí sinh thành công!");
                    }

                    break;
                }
                case 3: {
                    Scanner inputName = new Scanner(System.in);
                    System.out.println("----Tìm thí sinh theo Số báo danh----");
                    System.out.println("Nhập SDB thí sinh cần tim: ");
                    int examID = scanner.nextInt();
                    int index = candidatureManagement.findExamIDCandidature(examID);
                    if (index == -1){
                        System.out.println("Không tìm thấy thí sinh có SBD : "+examID);
                    }else {
                        System.out.println(candidatureManagement.getCandidatures().get(index));
                    }
                    break;
                }
            }
        } while (choice != 4);
    }

    public static void menu() {
        System.out.println("----MENU QUẢN LÝ THÍ SINH----");
        System.out.println("1. Hiển thị tất cả thí sinh");
        System.out.println("2. Nhập thông tin  thí sinh mới");
        System.out.println("3. Tìm kiếm thí sinh theo SDB");
        System.out.println("4. Thoát");
    }

    public static BlockA inputNewCandidatureBlockA() {
        System.out.println("Nhập số báo danh: ");
        int examID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập khu vực ưu tiên: ");
        String priorityArea = scanner.nextLine();
        String examObject = "Toán, Lý, Hóa";
        return new BlockA(examID, name, address, priorityArea, examObject);

    }

    public static BlockB inputNewCandidatureBlockB() {
        System.out.println("Nhập số báo danh: ");
        int examID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập khu vực ưu tiên: ");
        String priorityArea = scanner.nextLine();
        String examObject = "Toán, Hóa, Sinh";
        return new BlockB(examID, name, address, priorityArea, examObject);
    }

    public static BlockC inputNewCandidatureBlockC() {
        System.out.println("Nhập số báo danh: ");
        int examID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập khu vực ưu tiên: ");
        String priorityArea = scanner.nextLine();
        String examObject = "Văn, Sử, Địa";
        return new BlockC(examID, name, address, priorityArea, examObject);
    }

    public static Candidature creatNewCandidature() {
        System.out.println("1. Thí sinh khối A.");
        System.out.println("2. Thí sinh Khối B.");
        System.out.println("3. Thí sinh khối C.");
        System.out.println("Bạn hãy lụa chọn: ");
        int choice1 = scanner.nextInt();
        Candidature newCandidature;
        switch (choice1) {
            case 1: {
                System.out.println("---Thêm thí sinh khối A---");
                newCandidature = inputNewCandidatureBlockA();
                break;
            }
            case 2: {
                System.out.println("---Thêm thí sinh khối B---");
                newCandidature = inputNewCandidatureBlockB();
                break;
            }
            default: {
                System.out.println("---Thêm thí sinh khối C---");
                newCandidature = inputNewCandidatureBlockC();
                break;
            }
        }
        return newCandidature;
    }
}
