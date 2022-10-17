package salarie;

public class Salarie {
    private int id;
    private String nom;
    private String prenom;
    private double salaire;
    private double prime;

    /*Modificateurs*/

    public void setId(int id){
        this.id = id;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public void setSalaire(double salaire){
        this.salaire = salaire;
    }
    public void setPrime(double prime){
        this.prime = prime;
    }

    /*Acceseurs*/
    public int getId(){
        return this.id;
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public double getSalaire(){
        return this.salaire;
    }
    public double getPrime(){
        return this.prime;
    }

    /*Constructeur par défaut de la class Salarie*/

    public Salarie(){

    }

    /*Constructeur avec les 5 paramètres*/
    public Salarie(int Unid, String unNom, String unPrenom, double unSalaire, double unePrime){
        this.id = Unid;
        this.nom = unNom;
        this.prenom = unPrenom;
        this.salaire = unSalaire;
        this.prime = unePrime;
    }
    public void sePresenter(){
        System.out.println("Je m'appelle " + this.prenom + " " + this.nom);
    }
    public String toString(){
        return "id : " + this.id + " ; nom : " + this.nom + " ; prenom : " + this.prenom + " ; salaire : " + this.salaire + " ; prime : " + this.prime;
    }
    public double SalaireAnnuel(){
        return this.salaire * 12;
    }
    public double getRevenuAnnuel(){
        return SalaireAnnuel() + this.prime;
    }
}
