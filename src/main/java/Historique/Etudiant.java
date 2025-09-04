package Historique;

public class Etudiant {
    private int id;
    private String nom;
    private String prenom;
    private String dateEntree;
    private String historiqueGroupe;

    public Etudiant(int id, String nom, String prenom, String dateEntree, String historiqueGroupe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEntree = dateEntree;
        this.historiqueGroupe = historiqueGroupe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(String dateEntree) {
        this.dateEntree = dateEntree;
    }

    public String getHistoriqueGroupe() {
        return historiqueGroupe;
    }

    public void setHistoriqueGroupe(String historiqueGroupe) {
        this.historiqueGroupe = historiqueGroupe;
    }
}
