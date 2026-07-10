package Interface.HandsOnAssignment1.live;
import Interface.HandsOnAssignment1.music.Playable;
import Interface.HandsOnAssignment1.music.string.Veena;
import Interface.HandsOnAssignment1.music.wind.Saxophone;
public class Test {
	public static void main(String[] args) {
        Veena v = new Veena();
        v.play();
        
        Saxophone s = new Saxophone();
        s.play();

        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}
