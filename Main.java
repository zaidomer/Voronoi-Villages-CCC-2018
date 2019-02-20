import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numVillages = input.nextInt();
        int tempStore = 0;
        double lowest =  0;
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

        // for (int i = 0; i < numVillages; i++) {
        //     System.out.print(villageLocation[i] + ", ");
        // }

        // for(int i = 1; i < numVillages-1; i++) {
        //     double neighbourhoodSize = ((villageLocation[i] - villageLocation[i-1])/2.0) + ((villageLocation[i+1] - villageLocation[i])/2.0);
        //     if(neighbourhoodSize < lowest || lowest == 0) {
        //         lowest = (double)Math.round(neighbourhoodSize * 10)/10; 
        //     }
        // }

        // System.out.println(lowest);

        for(int i = 1; i < numVillages-1; i++) {
            double neighbourhoodSize = ((villageLocation[i] - villageLocation[i-1])/2.0) + ((villageLocation[i+1] - villageLocation[i])/2.0);
            if(neighbourhoodSize < lowest || lowest == 0) {
                lowest = neighbourhoodSize;
            }
        }

        System.out.println(String.format("%.1f", lowest));
    }
}