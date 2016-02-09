package com.slgp.gestionprojet;

import java.sql.Date;

/**
 * Created by godef on 09/02/2016.
 */
public class clsItemTache {

    private int id_tache;
    private String tac_titre;
    private String tac_desc;
    private Date tac_dateD;
    private Date tac_dateF;
    private double tac_duree;
    private int id_statutTache;

    public int getId_statutTache() {
        return id_statutTache;
    }

    public void setId_statutTache(int id_statutTache) {
        this.id_statutTache = id_statutTache;
    }

    public int getId_tache() {
        return id_tache;
    }

    public void setId_tache(int id_tache) {
        this.id_tache = id_tache;
    }

    public String getTac_titre() {
        return tac_titre;
    }

    public void setTac_titre(String tac_titre) {
        this.tac_titre = tac_titre;
    }

    public String getTac_desc() {
        return tac_desc;
    }

    public void setTac_desc(String tac_desc) {
        this.tac_desc = tac_desc;
    }

    public Date getTac_dateD() {
        return tac_dateD;
    }

    public void setTac_dateD(Date tac_dateD) {
        this.tac_dateD = tac_dateD;
    }

    public Date getTac_dateF() {
        return tac_dateF;
    }

    public void setTac_dateF(Date tac_dateF) {
        this.tac_dateF = tac_dateF;
    }

    public double getTac_duree() {
        return tac_duree;
    }

    public void setTac_duree(double tac_duree) {
        this.tac_duree = tac_duree;
    }
}
