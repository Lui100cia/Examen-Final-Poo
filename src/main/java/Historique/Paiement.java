package Historique;

public class Paiement {
    private int id;
    private double montant;
    private String dateEtHeure;

    public Paiement(int id, double montant, String dateEtHeure) {
        this.id = id;
        this.montant = montant;
        this.dateEtHeure = dateEtHeure;
    }

    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public String getDateEtHeure() {
        return dateEtHeure;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDateEtHeure(String dateEtHeure) {
        this.dateEtHeure = dateEtHeure;
    }
}

