import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numVillages = input.nextInt();
        int tempStore = 0;
        int[] villageLocation = new int[numVillages];
        for (int i = 0; i < numVillages; i++) {
            villageLocation[i] = input.nextInt();
        }

        for(int i = 0; i < numVillages; i++) {
            for(int j = 0; j < numVillages-1; j++) {
                if(villageLocation[j] > villageLocation[j+1]){
                    tempStore = villageLocation[j];
                    villageLocation[j] = villageLocation[j+1];
                    villageLocation[j+1] = tempStore;
                }
            }
        }

        for (int i = 0; i < numVillages; i++) {
            System.out.print(villageLocation[i] + ", ");
        }
    }
}