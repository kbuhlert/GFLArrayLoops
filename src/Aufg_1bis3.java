import java.util.Arrays;

public class Aufg_1bis3 {
    public static void main(String[] args) {
        //Aufg1 Summen in Arrayfeld berechnen
        int erg = 0;        //initialisierung der Variable erg
        int[] summenArray = new int[]{2,4,5,7}; //initialisierung und befüllen von Array
        for (int element : summenArray){    //forEach-Schleife um ArraySumme zu berechnen
            erg = erg + element;
        }System.out.println(erg);        //Ausgabe des letzten Ergebnisses (der Summe)

        //Aufg2 Array mit dreifachen Wert befüllen
        int[] dreifachArray = new int[]{2,4,5,7};
        int erg2 = 0;
        for (int index = 0; index<dreifachArray.length; index++) {
            erg2 = dreifachArray[index];
            dreifachArray[index] = erg2*3;
        }
        System.out.println(Arrays.toString(dreifachArray));

        //Aufruf Auf3 (der oben definierte und veränderte dreifachArray wird weiterverwendet, Werte sind also: [6,12,15,21]

        int[] ergebnisArray = dreifachWertArray(dreifachArray);
        System.out.println("Mit Methode berechneter Array: " + Arrays.toString(ergebnisArray));

    }

    //Aufg3 Methode zur Berechnung von dreifachen Wert im Array
    public static int[] dreifachWertArray (int[] dreifachArray){
        int erg3 = 0;
        for (int index = 0; index<dreifachArray.length; index++) {
            erg3 = dreifachArray[index];
            dreifachArray[index] = erg3*3;
        } return dreifachArray;
    }
}
