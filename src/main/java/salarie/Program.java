package salarie;

public class Program {
    public static void main(String[] args) {
        //Une salariée
        Salarie s1 = new Salarie();
        s1.setNom("Zorina");
        s1.setPrenom("Tatiana");
        s1.sePresenter();
        System.out.println(s1.toString());

        //Un salarié
        Salarie s2 = new Salarie(1, "Marley", "Bob", 1500, 3000);
        System.out.println(s2.getNom() + " " + s2.getPrenom());
        System.out.println(s2.toString());
        System.out.println(s2.SalaireAnnuel());
        System.out.println(s2.getRevenuAnnuel());
    }
}
