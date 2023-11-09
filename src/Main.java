public class Main {
    public static void main(String[] args) {

        InterfaceEmploye employe1 = new Employe("CIN123", "M123", "Dupont", "Jean");
        InterfaceEmploye employe2 = new Employe("CIN456", "M456", "Martin", "Sophie");

        InterfaceDepartement departement1 = new Departement(1, "Ressources Humaines");
        InterfaceDepartement departement2 = new Departement(2, "Développement");


        InterfaceSociete societeHashMap = new SocieteHashMap();


        societeHashMap.ajouterEmployeDepartement(employe1, departement1);
        societeHashMap.ajouterEmployeDepartement(employe2, departement2);


        System.out.println("Liste des employés et de leurs départements (HashMap):");
        societeHashMap.afficherLesEmployesLeursDepartements();


        societeHashMap.supprimerEmploye(employe1);


        System.out.println("\nListe des employés et de leurs départements après suppression (HashMap):");
        societeHashMap.afficherLesEmployesLeursDepartements();


        InterfaceSociete societeTreeMap = new SocieteTreeMap();


        societeTreeMap.ajouterEmployeDepartement(employe1, departement1);
        societeTreeMap.ajouterEmployeDepartement(employe2, departement2);


        System.out.println("\nListe des employés et de leurs départements (TreeMap):");
        societeTreeMap.afficherLesEmployesLeursDepartements();
    }
}


