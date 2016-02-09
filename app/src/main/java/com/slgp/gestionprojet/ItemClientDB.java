package com.slgp.gestionprojet;

/**
 * Created by godef on 09/02/2016.
 */
public class ItemClientDB {

    private int id_client;
    private String cli_intitule;
    private String cli_adresse;
    private String cli_mail;
    private String cli_tel;
    private String cli_commentaire;

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getCli_intitule() {
        return cli_intitule;
    }

    public void setCli_intitule(String cli_intitule) {
        this.cli_intitule = cli_intitule;
    }

    public String getCli_adresse() {
        return cli_adresse;
    }

    public void setCli_adresse(String cli_adresse) {
        this.cli_adresse = cli_adresse;
    }

    public String getCli_mail() {
        return cli_mail;
    }

    public void setCli_mail(String cli_mail) {
        this.cli_mail = cli_mail;
    }

    public String getCli_tel() {
        return cli_tel;
    }

    public void setCli_tel(String cli_tel) {
        this.cli_tel = cli_tel;
    }

    public String getCli_commentaire() {
        return cli_commentaire;
    }

    public void setCli_commentaire(String cli_commentaire) {
        this.cli_commentaire = cli_commentaire;
    }
}
