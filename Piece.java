public class Piece {
    // Step 1
    String name;
    String color;
    int[] position;

    // Step 2 Piece class
    public Piece (String name, String color, int[] position){
        this.name = name;
        this.color = color;
        this.position = position;
    }
    //Getters
    public String nameGetter(){
        return name;
    }
    public String colorGetter(){
        return color;
    }
    public int[] positionGetter(){
        return position;
    }

}
