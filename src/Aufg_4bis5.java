import java.util.Arrays;

public class Aufg_4bis5 {
    public static void main(String[] args) {

        //Aufg4 Summe benachbarter Zahlen im Feld
        int[] startArray = new int[]{2,4,2,5,6,9};
        int [] zielArray = new int[startArray.length/2];    //das neue Array ist halb so lang wie das startArray
        for (int index = 0; index<zielArray.length; index++){
            zielArray[index] = startArray[2*index] + startArray[2*index+1];
        }
        System.out.println(Arrays.toString(startArray));
        System.out.println(Arrays.toString(zielArray));

        System.out.println("-------");

        //Ausgabe Aufg 5 / Methode um Array mit Summe zu befüllen
        int[] ausgabeArray = arrayFeldAddieren(startArray);
        System.out.println(Arrays.toString(ausgabeArray));

    }
        //Aufg 5 / Methode die Felder aus startArray Addiert und mit den Summen ein zielArray befüllt
    public static int[] arrayFeldAddieren (int[]startArray){
        int []zielArray = new int[startArray.length/2];
        for(int feld = 0; feld<zielArray.length; feld++){
            zielArray[feld] = startArray[feld*2] + startArray[feld*2+1];
        } return zielArray;
    }

}
