package com.example.gebruiker.androidproject20.Enums;

/**
 * Created by Gebruiker on 24-3-2017.
 */

public enum Gamemodus {

    //enums
    Schoppe_mien(20, 0, "S", Overboden.Basis, true, 0),
    Rikken(10, 5, "R", Overboden.Basis, true, 8),
    Beter_rikken(10, 5, "BR", Overboden.Overbod, true, 8),
    Pieken(60, 0, "P", Overboden.Basis, true, 1),
    Misere(90, 5, "M", Overboden.Basis, true, 0),
    Open_piek(120, 0, "*P", Overboden.Overbod, true, 5),
    Piek_M_praatje(165, 0, "~P", Overboden.Overbod, true, 5),
    Open_misere(10, 5, "*M", Overboden.Overbod, true, 5),
    Misere_M_praatje(10, 5, "~M", Overboden.Overbod, true,5),

    Acht_Alleen(30, 5, "8A", Overboden.Overbod, true, 8),
    Negen_Alleen(60, 5, "9A", Overboden.Overbod, true, 9),
    Tien_Alleen(90, 5, "10A", Overboden.Overbod, true, 10),
    Elf_Alleen(120, 5, "11A", Overboden.Overbod, true, 11),
    Twaalf_Alleen(180, 5, "12A", Overboden.Overbod, true, 12),
    Dertien_Alleen(210, 5, "13A", Overboden.Overbod, true, 13),
    Troela(10, 5, "T", Overboden.Both, true, 5);

    //fields
    private int Points;
    private int Extrapoints;
    private String abbreviation;
    private Overboden Overbod;
    private boolean Activated;
    private int hitsneeded;

    //constructor
    private Gamemodus(int points, int extrapoints, String abbreviation, Overboden overbod, Boolean activated, int hitsneeded) {
        this.Points = points;
        this.Extrapoints = extrapoints;
        this.Overbod = overbod;
        this.Activated = activated;
        this.abbreviation = abbreviation;
        this.hitsneeded = hitsneeded;
    }

    //propertys
    public int getPoints() {
        return Points;
    }
    public void SetPoints(int n) {this.Points = n;}

    public int getExtrapoints() {
        return Extrapoints;
    }
    public void SetExtrapoints(int n) {this.Extrapoints = n;}

    public String getAbbrevation() {
        return abbreviation;
    }
    public void SetAbbrevation(String n) {this.abbreviation = n;}

    public Overboden getOverbod() {
        return this.Overbod;
    }
    public void SetOverbod(Overboden n) {this.Overbod = n;}

    public boolean getActivated() {
        return this.Activated;
    }
    public void SetActivated(boolean n) {this.Activated = n;}

    public int getHitsneeded() {
        return hitsneeded;
    }
    public void SetHitsneeded(int n) {this.hitsneeded = n;}


    public static void ResetOriginalValues()
    {
         //schoppe_mien
        Schoppe_mien.Points = 20;
        Schoppe_mien.Extrapoints = 0;
        Schoppe_mien.abbreviation = "S";
        Schoppe_mien.Overbod = Overboden.Basis;
        Schoppe_mien.Activated = true;
        Schoppe_mien.hitsneeded = 0;

        Rikken.Points = 10;
        Rikken.Extrapoints = 5;
        Rikken.abbreviation = "R";
        Rikken.Overbod = Overboden.Basis;
        Rikken.Activated = true;
        Rikken.hitsneeded = 8;

        Beter_rikken.Points = 10;
        Beter_rikken.Extrapoints = 5;
        Beter_rikken.abbreviation = "BR";
        Beter_rikken.Overbod = Overboden.Overbod;
        Beter_rikken.Activated = true;
        Beter_rikken.hitsneeded = 8;

        Pieken.Points = 60;
        Pieken.Extrapoints = 0;
        Pieken.abbreviation = "P";
        Pieken.Overbod = Overboden.Basis;
        Pieken.Activated = true;
        Pieken.hitsneeded = 1;

        Misere.Points = 90;
        Misere.Extrapoints = 0;
        Misere.abbreviation = "M";
        Misere.Overbod = Overboden.Basis;
        Misere.Activated = true;
        Misere.hitsneeded = 0;

        Open_piek.Points = 10;
        Open_piek.Extrapoints = 5;
        Open_piek.abbreviation = "*P";
        Open_piek.Overbod = Overboden.Overbod;
        Open_piek.Activated = true;
        Open_piek.hitsneeded = 5;

        Piek_M_praatje.Points = 10;
        Piek_M_praatje.Extrapoints = 5;
        Piek_M_praatje.abbreviation = "~P";
        Piek_M_praatje.Overbod = Overboden.Overbod;
        Piek_M_praatje.Activated = true;
        Piek_M_praatje.hitsneeded = 5;

        Open_misere.Points = 10;
        Open_misere.Extrapoints = 5;
        Open_misere.abbreviation = "*M";
        Open_misere.Overbod = Overboden.Overbod;
        Open_misere.Activated = true;
        Open_misere.hitsneeded = 5;

        Misere_M_praatje.Points = 10;
        Misere_M_praatje.Extrapoints = 5;
        Misere_M_praatje.abbreviation = "~M";
        Misere_M_praatje.Overbod = Overboden.Overbod;
        Misere_M_praatje.Activated = true;
        Misere_M_praatje.hitsneeded = 5;

        Acht_Alleen.Points = 30;
        Acht_Alleen.Extrapoints = 5;
        Acht_Alleen.abbreviation = "8A";
        Acht_Alleen.Overbod = Overboden.Overbod;
        Acht_Alleen.Activated = true;
        Acht_Alleen.hitsneeded = 8;

        Negen_Alleen.Points = 60;
        Negen_Alleen.Extrapoints = 5;
        Negen_Alleen.abbreviation = "9A";
        Negen_Alleen.Overbod = Overboden.Overbod;
        Negen_Alleen.Activated = true;
        Negen_Alleen.hitsneeded = 9;

        Tien_Alleen.Points = 90;
        Tien_Alleen.Extrapoints = 5;
        Tien_Alleen.abbreviation = "10A";
        Tien_Alleen.Overbod = Overboden.Overbod;
        Tien_Alleen.Activated = true;
        Tien_Alleen.hitsneeded = 10;

        Elf_Alleen.Points = 120;
        Elf_Alleen.Extrapoints = 5;
        Elf_Alleen.abbreviation = "11A";
        Elf_Alleen.Overbod = Overboden.Overbod;
        Elf_Alleen.Activated = true;
        Elf_Alleen.hitsneeded = 11;

        Twaalf_Alleen.Points = 180;
        Twaalf_Alleen.Extrapoints = 5;
        Twaalf_Alleen.abbreviation = "12A";
        Twaalf_Alleen.Overbod = Overboden.Overbod;
        Twaalf_Alleen.Activated = true;
        Twaalf_Alleen.hitsneeded = 12;

        Dertien_Alleen.Points = 210;
        Dertien_Alleen.Extrapoints = 5;
        Dertien_Alleen.abbreviation = "13A";
        Dertien_Alleen.Overbod = Overboden.Overbod;
        Dertien_Alleen.Activated = true;
        Dertien_Alleen.hitsneeded = 13;

        Troela.Points = 10;
        Troela.Extrapoints = 5;
        Troela.abbreviation = "T";
        Troela.Overbod = Overboden.Both;
        Troela.Activated = true;
        Troela.hitsneeded = 5;
    }
}
