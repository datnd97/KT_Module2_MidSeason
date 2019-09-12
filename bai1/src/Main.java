import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //    Bài 1: Viết chương trình quản lý sản phẩm bao gồm những thông tin sau:
    public static void main(String[] args) {
        ArrayList<Products> listProducts = new ArrayList<Products>();
        int dem = 0;
        int id = 0;
        String  name ="";
        System.out.println("Nhap 'add' de them san pham: ");
        System.out.println("Nhap 'display' de hien thi san pham: ");
        System.out.println("Nhap 'update' de sua san pham: ");
        System.out.println("Nhap 'find' de tim san pham: ");
        System.out.println("Nhap 'delete' de xoa san pham: ");

        do {
            System.out.println("Ban chon: ");
            Scanner sc = new Scanner(System.in);
            String chose = sc.nextLine();
            switch (chose.toLowerCase()) {
                case "add":
                    dem++;
                    id = dem;
                    System.out.println("Moi nhap ten san pham: ");
                     name = sc.nextLine();
                    do {
                        if (name.isEmpty()) {
                            System.out.println("Chua nhap ten,moi nhap ten: ");
                            name = sc.nextLine();
                        }
                    } while (name.isEmpty() == true);
                    System.out.println("Moi nhap gia san pham: ");
                    float price = Integer.parseInt(sc.nextLine()); ;
                    do {
                        if(price <=0 ) {
                            System.out.println("Chua nhap gia.moi nhap gia: ");
                            price=sc.nextFloat();
                        }

                    } while (price <= 0);
                    System.out.println("Moi nhap thong tin san pham: ");
                    String description = sc.nextLine();
                    do {
                        if(description.isEmpty()) {
                            System.out.println("Chua nhap thong tin moi nhap thong tin sp: ");
                            description =sc.nextLine();
                        }
                    }while (description.isEmpty());
                   Products product1 = new Products(id,name,price,description);
                   listProducts.add(product1);

                    break;

                case "display":
                    if(listProducts.size() == 0) {
                        System.out.println("Ban chua nhap thong tin nao ca.");
                    }
                    for (int i = 0 ;i <listProducts.size();i++) {
                            listProducts.get(i).hienThi();
                    }
                    break;
                case "update":
                    System.out.println("Nhap id nhan vien can sua: ");
                    int idProduct = sc.nextInt();
                    for (int i = 0 ; i < listProducts.size();i++) {
                        if(id == idProduct) {
                            listProducts.get(i).capNhap();
                            break;
                        }
                    }
                    break;
                case "find":
                    System.out.println("Moi ban nhap ten: ");
                    String nameToFind = sc.nextLine();
                    for(int i =0;i <listProducts.size();i++) {
                        if(listProducts.get(i).getName().equals(nameToFind)){
                            listProducts.get(i).hienThi();
                        }
                    }
                    break;
                case "delete":
                    System.out.println("Moi ban nhap vi tri can xoa: ");
                    int indexDelete = sc.nextInt();
                    do {
                        System.out.println("Khong ton tai hoac ban nhap sai.Moi nhap lai: ");
                        indexDelete = sc.nextInt();
                    }while (listProducts.size()== 0|| indexDelete > listProducts.size() ||   indexDelete < 0);
                        listProducts.remove(0);
                    break;
                default:
                    System.out.println("Lua chon khong ton tai.");
            }
        } while (true);
    }
}
