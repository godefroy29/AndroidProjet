package com.slgp.gestionprojet;

import java.sql.Date;

/**
 * Created by godef on 09/02/2016.
 */
public class ItemProjetDB {

    private int id_projet;
    private String pro_titre;
    private String pro_desc;
    private Date pro_dateD;
    private Date pro_dateFP;
    private Date pro_dateF;
    private double pro_budgetD;
    private double pro_budgetFP;
    private double pro_budgetF;
    private int id_statutProjet;

    public int getId_projet() {
        return id_projet;
    }

    public void setId_projet(int id_projet) {
        this.id_projet = id_projet;
    }

    public String getPro_titre() {
        return pro_titre;
    }

    public void setPro_titre(String pro_titre) {
        this.pro_titre = pro_titre;
    }

    public String getPro_desc() {
        return pro_desc;
    }

    public void setPro_desc(String pro_desc) {
        this.pro_desc = pro_desc;
    }

    public Date getPro_dateD() {
        return pro_dateD;
    }

    public void setPro_dateD(Date pro_dateD) {
        this.pro_dateD = pro_dateD;
    }

    public Date getPro_dateFP() {
        return pro_dateFP;
    }

    public void setPro_dateFP(Date pro_dateFP) {
        this.pro_dateFP = pro_dateFP;
    }

    public Date getPro_dateF() {
        return pro_dateF;
    }

    public void setPro_dateF(Date pro_dateF) {
        this.pro_dateF = pro_dateF;
    }

    public double getPro_budgetD() {
        return pro_budgetD;
    }

    public void setPro_budgetD(double pro_budgetD) {
        this.pro_budgetD = pro_budgetD;
    }

    public double getPro_budgetFP() {
        return pro_budgetFP;
    }

    public void setPro_budgetFP(double pro_budgetFP) {
        this.pro_budgetFP = pro_budgetFP;
    }

    public double getPro_budgetF() {
        return pro_budgetF;
    }

    public void setPro_budgetF(double pro_budgetF) {
        this.pro_budgetF = pro_budgetF;
    }

    public int getId_statutProjet() {
        return id_statutProjet;
    }

    public void setId_statutProjet(int id_statutProjet) {
        this.id_statutProjet = id_statutProjet;
    }
}
