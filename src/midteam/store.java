package midteam;
import java.util.ArrayList;
import java.util.Scanner;

public class store extends book{
	Scanner input = new Scanner(System.in);
	int totalItems = 0;
	int maxItem = 10;
	ArrayList<book> listItems = new ArrayList();
	
	public void add() {
		book b1 = new book();
        System.out.println("Nhap id sach: ");
        b1.setID(input.nextInt());
        input.nextLine();
        System.out.println("Nhap ten sach: ");
        b1.setName(input.nextLine());
        System.out.println("Nhap gia sach: ");
        b1.setPrice(input.nextInt());
        listItems.add(b1);
        totalItems++;
	}
	
	public void delete (int id)
    {
       for(book x: listItems)
        {
            if(x.getID()== id)
            {
                listItems.remove(x);
                totalItems--;
                System.out.println("Xoa thanh cong sach");
                break;
            }
            else
            {
                System.out.println("Khong co sach trung voi id can xoa");
                break;
            }
        }
    }
	
    public void find(String name)
    {
        for(book x: listItems)
        {
            if(x.getName().equalsIgnoreCase(name))
            {
                System.out.println(x.toString());
                break;
            }
            else
            {
                System.out.println("Khong tim duoc sach ");
                break;
            }
        }
    }
    
    public void edit(int id)
    {
        for(book x: listItems)
        {
            if(x.getID()== id)
            {          
            	input.nextLine();
                System.out.println("Nhap ten sach ");
                x.setName(input.nextLine());
                System.out.println("Nhap gia sach moi: ");
                x.setPrice(input.nextInt());
                break;
            }
            else
            {
                System.out.println("Khong co sach nao trung");
                break;
            }  
        }
    }
    
    public void list()
    {
        System.out.println("so sach la: " + totalItems);
        for(book x: listItems)
        {
            System.out.println(x + "");
        }
    }
    
    
}
