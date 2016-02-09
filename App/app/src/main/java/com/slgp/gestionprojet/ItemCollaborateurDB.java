package com.slgp.gestionprojet;

import java.sql.Date;

/**
 * Created by godef on 09/02/2016.
 */
public class ItemCollaborateurDB {

    private int id_collaborateur;
    private String col_nom;
    private String col_prenom;
    private String col_commentaire;
    private Date col_dateAjout;
    private int id_statutPersonne;

    public int getId_collaborateur() {
        return id_collaborateur;
    }

    public void setId_collaborateur(int id_collaborateur) {
        this.id_collaborateur = id_collaborateur;
    }

    public String getCol_nom() {
        return col_nom;
    }

    public void setCol_nom(String col_nom) {
        this.col_nom = col_nom;
    }

    public String getCol_prenom() {
        return col_prenom;
    }

    public void setCol_prenom(String col_prenom) {
        this.col_prenom = col_prenom;
    }

    public String getCol_commentaire() {
        return col_commentaire;
    }

    public void setCol_commentaire(String col_commentaire) {
        this.col_commentaire = col_commentaire;
    }

    public Date getCol_dateAjout() {
        return col_dateAjout;
    }

    public void setCol_dateAjout(Date col_dateAjout) {
        this.col_dateAjout = col_dateAjout;
    }

    public int getId_statutPersonne() {
        return id_statutPersonne;
    }

    public void setId_statutPersonne(int id_statutPersonne) {
        this.id_statutPersonne = id_statutPersonne;
    }
}
