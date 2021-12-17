package midteam;
import java.util.Scanner;

public class main {
	
    public static void LuaChon() 

    { 

        System.out.println("vui long chon: an phim 1 de them sach, phim 2 de sua sach, phim 3 xoa sach, phim 4 de tim sach, phim 5 de xem sach "); 
    } 

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        store sach = new store();
        int select;
        while(true)
        {
        	LuaChon();
        select = input.nextInt();
        switch(select)
        {
            case 1:
            {
                System.out.println("Ban da chon nhap them sach");
                sach.add();
                break;
            }
            case 2:
            {
                System.out.println("Ban da chon sua thong tin sach");
                System.out.println("Nhap id sach can sua: ");
                int idSua = input.nextInt();
                sach.edit(idSua);
                break;
            }
            case 3:
            {
                System.out.println("Ban da chon xoa sach");
                System.out.println("Nhap id sach can xoa: ");
                int idXoa = input.nextInt();
                sach.delete(idXoa);
                break;
            }
            case 4:
            {
            	input.nextLine();
                System.out.println("Ban da chon tim sach");
                System.out.println("Nhap ten sach can tim:");
                String name = input.nextLine();
                sach.find(name);
                break;
            }
            case 5: 
            {
                System.out.println("Ban da chon hien thi tat ca");
                sach.list();
                break;
            }
            default:
                System.out.println("########");
        }  
        }
        
    }

}
