package models;

/**
 * Created by Michael on 1/22/2016.
 */
public class Column {
    public int spaceAvail; //how many spaces the column has
    public int spaceTaken; //how many cards are in the column
    public String[] order; //the order of the Cards: first element is top of the column, last element is the bottom

    //default constructor makes an empty column
    public Column(){
        spaceAvail = 14;
        spaceTaken = 0;
        order = new String[14];
    }

    //constructor which fills column with array of strings
    public Column(String[] fillColumn){
        spaceAvail = 14;
        spaceTaken = fillColumn.length;
        order = new String[14];

        for(int i = 0; i < spaceTaken; i++){
            order[i] = fillColumn[i];
        }
    }
}
