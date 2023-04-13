public class Rectangle extends Forme {
    private int largeur;
    private int hauteur;

    public Rectangle(int x, int y, int largeur, int hauteur, String couleur) {
        super(x, y, couleur);
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    

    @Override
    public String getState() {
        return "Rectangle [ x= " + x + ", y= " + y + ", largeur= " + largeur + ", hauteur= " + hauteur + ", couleur= " + couleur+" ]";
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.x, this.y, this.largeur, this.hauteur, this.couleur);
    }
}
