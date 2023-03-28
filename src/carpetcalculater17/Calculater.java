package carpetcalculater17;

public class Calculater {

    private Floor floor;
    private Carpet carpet;

    public Calculater(Floor floor,Carpet carpet ) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){

        return floor.getArea()*carpet.getCost();
    }
}






