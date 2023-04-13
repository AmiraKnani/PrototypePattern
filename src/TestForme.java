
public class TestForme {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(1, 2, 10, "rouge");
        Cercle cercle2 = new Cercle(4, 2, 11, "bleu");
        Rectangle rectangle1 = new Rectangle(1, 2, 100, 200, "rouge");

      
        Cercle cercle1Clone = cercle1.clone();
        Cercle cercle2Clone = cercle2.clone();
        Rectangle rectangle1Clone = rectangle1.clone();

       
        System.out.println("Objets clonés :");
        System.out.println(cercle1Clone.getState());
        System.out.println(cercle2Clone.getState());
        System.out.println(rectangle1Clone.getState());

	}

}
