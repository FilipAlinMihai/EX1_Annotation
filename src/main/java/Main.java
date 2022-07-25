import java.util.ArrayList;
import java.util.Objects;

public class Main {

    private static boolean verificare(Object object) throws Exception {

        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(ClasaMarcata.class)) {
            throw new Exception("Clasa " + clazz.getSimpleName() + " nu este annotata cu ClasaMarcata");

        }
        else
            return true;
    }

    public static void main(String[] args) {
        Persoana l=new Persoana(33,"Popescu Ion");
        Animal a =new Animal("Caine");
        Cladire c=new Cladire();
        Munte m=new Munte();
        ArrayList<Object> n=new ArrayList<>();
        n.add(l);
        n.add(a);
        n.add(c);
        n.add(m);
        for(Object p:n) {
            try {

                if (verificare(p))
                    System.out.println("Clasa "+ p.getClass().getSimpleName()+" este marcata cu annotatia ClasaMarcata");

            } catch (Exception e) {
                //System.out.println(e.getMessage());
                System.err.println("Clasa "+ p.getClass().getSimpleName()+" NU este marcata cu annotatia ClasaMarcata" );
            }
        }

    }
}
