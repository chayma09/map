import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private Map<InterfaceEmploye, InterfaceDepartement> employeDepartementMap;

    public SocieteHashMap() {
        employeDepartementMap = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(InterfaceEmploye e, InterfaceDepartement d) {
        employeDepartementMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(InterfaceEmploye e) {
        employeDepartementMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<InterfaceEmploye, InterfaceDepartement> entry : employeDepartementMap.entrySet()) {
            System.out.println("Employe : " + entry.getKey() + ", Departement : " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (InterfaceEmploye e : employeDepartementMap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (InterfaceDepartement d : employeDepartementMap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(InterfaceEmploye e) {
        InterfaceDepartement d = employeDepartementMap.get(e);
        if (d != null) {
            System.out.println("Departement de l'employe " + e + " : " + d);
        } else {
            System.out.println("Cet employe n'appartient à aucun département.");
        }
    }

    @Override
    public boolean rechercherEmploye(InterfaceEmploye e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(InterfaceDepartement d) {
        return employeDepartementMap.containsValue(d);
    }
}
