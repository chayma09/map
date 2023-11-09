public interface InterfaceSociete {
    void ajouterEmployeDepartement(InterfaceEmploye e, InterfaceDepartement d);
    void supprimerEmploye(InterfaceEmploye e);
    void afficherLesEmployesLeursDepartements();
    void afficherLesEmployes();
    void afficherLesDepartements();
    void afficherDepartement(InterfaceEmploye e);
    boolean rechercherEmploye(InterfaceEmploye e);
    boolean rechercherDepartement(InterfaceDepartement d);
}
