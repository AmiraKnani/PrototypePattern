public class Cercle extends Forme {
    private int rayon;

    public Cercle(int x, int y, int rayon, String couleur) {
        super(x, y, couleur);
        this.rayon = rayon;
    }

    

    @Override
    public String getState() {
        return "Cercle [ x= " + x + ", y= " + y + ", rayon= " + rayon + ", couleur= " + couleur +" ]";
    }

    @Override
    public Cercle clone() {
        return new Cercle(this.x, this.y, this.rayon, this.couleur);
    }
}