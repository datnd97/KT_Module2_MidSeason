import java.util.Scanner;

public class Products {
    private int id;
    private String name;
    private float price;
    private String descripion;

    public Products(int id, String name, float price, String descripion) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descripion = descripion;
    }

    public Products() {
    }

    public Products(String name,float price) {
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }
    public void hienThi() {
        System.out.println("---------");
        System.out.println("Ma san pham: "+id);
        System.out.println("Ten san pham: "+name);
        System.out.println("Gia san pham: "+price);
        System.out.println("Thong tin san pham: "+descripion);
        System.out.println("---------");

  }
  public void capNhap() {
      Scanner sc = new Scanner(System.in);
      System.out.println("MENU:");
      System.out.println("1. Sua ten San pham");
      System.out.println("2. Sua gia San pham");
      System.out.println("3. Sua Thong tin san pham");
      int chose = Integer.parseInt(sc.nextLine());
      switch (chose) {
          case 1:
              System.out.print("Nhap ten moi: ");
              String nhap = sc.nextLine();
              setName(nhap);
              break;
          case  2:
              System.out.println("Nhap gia moi: ");
              price = new Scanner(System.in).nextFloat();
              break;
          case 3:
              System.out.println("Nhap thong tin moi: ");
              descripion = new Scanner(System.in).nextLine();
              break;
          default:
              System.out.println("Out");
      }
  }
  public void xoaPhanTu() {
      Scanner sc = new Scanner(System.in);
      int chose = Integer.parseInt(sc.nextLine());
  }


}