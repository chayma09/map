import java.util.Objects;

class Employe implements InterfaceEmploye, Comparable<Employe> {
    private String cin;
    private String matricule;
    private String nom;
    private String prenom;

    public Employe(String cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }


    @Override
    public String getCin() {
        return cin;
    }

    @Override
    public String getMatricule() {
        return matricule;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }


    @Override
    public int compareTo(Employe other) {

        return getCin().compareTo(other.getCin());
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employe employe = (Employe) obj;
        return Objects.equals(cin, employe.cin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin);
    }
}
