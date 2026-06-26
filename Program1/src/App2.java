import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        List <String>list = new ArrayList<>();
        for(int i = 0;i<6; i++){
            System.out.println("Adicione uma fruta: ");
            String fruta = sc.nextLine();
            list.add(fruta);
        }
        System.out.println(list);

        sc.close();
    }
    
}
