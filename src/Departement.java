class Departement implements InterfaceDepartement {
    private int identifiant;
    private String nom;

    public Departement(int identifiant, String nom) {
        this.identifiant = identifiant;
        this.nom = nom;
    }


    @Override
    public int getIdentifiant() {
        return identifiant;
    }

    @Override
    public String getNom() {
        return nom;
    }
}
