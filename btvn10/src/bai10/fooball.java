package bai10;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class fooball {
        public static void main(String[] args) {
            FootballTeam footballTeam1 = new FootballTeam(1,"Chau",10,20);
            FootballTeam footballTeam2 = new FootballTeam(2,"Anh",9,0);
            FootballTeam footballTeam3 = new FootballTeam(3,"Triet",11,7);
            FootballTeam footballTeam4 = new FootballTeam(4,"Nam",15,5);
            FootballTeam footballTeam5 = new FootballTeam(5,"Toan",20,4);
            FootballTeam footballTeam6 = new FootballTeam(6,"Linh",1,2);
            List<FootballTeam> footballTeams = new ArrayList<>();
            footballTeams.add(footballTeam1);
            footballTeams.add(footballTeam2);
            footballTeams.add(footballTeam3);
            footballTeams.add(footballTeam4);
            footballTeams.add(footballTeam5);
            footballTeams.add(footballTeam6);
            System.out.println("danh sach cau thu");
            for (FootballTeam team:footballTeams
            ) {
                System.out.println(team);
            }
            System.out.println("danh sach sap xep theo diem so cao den thap la");
            bubbleSort(footballTeams,(o1, o2) -> o1.getScore()-o2.getScore());
            for (FootballTeam team:footballTeams
            ) {
                System.out.println(team);
            }
        }


        public static <T> void bubbleSort(List<T> arr , Comparator<T> comparator) {
            boolean flag = true;
            for (int i = 1; i < arr.size() && flag; i++) {
                flag = false;
                for (int j = 0; j < arr.size() - i; j++) {
                    if (comparator.compare(arr.get(j), arr.get(j + 1)) > 0) {
                        T temp = arr.get(j);
                        arr.set(j, arr.get(j + 1));
                        arr.set(j + 1, temp);
                        flag = true;
                    }
                }
            }
        }
    }
