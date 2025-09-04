package Historique;

public class Frais {
    private int id;
    private String label;
    private double montantPaye;
    private String deadline;

    public Frais(int id, String label, double montantPaye, String deadline) {
        this.id = id;
        this.label = label;
        this.montantPaye = montantPaye;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        double totalPaye;
        String dateAct;

        if (dateAct < deadline && montantPaye != totalPaye) {
            return "En cours";
        }else if (montantPaye == totalPaye) {
            return "Payé";
        } else if (dateAct > deadline && montantPaye != totalPaye) {
            return "En surplus";
        }

    }

}


