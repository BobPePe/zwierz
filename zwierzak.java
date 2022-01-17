package zwierz;

public class zwierzak {
    int wiek;
    String nazwa;
    String plec;
    String gatunek;
    int ilos_lap;
    String kolor;

    public zwierzak(int wiek, String nazwa, String plec, String gatunek, int ilos_lap, String kolor) {
        this.wiek = wiek;
        this.nazwa = nazwa;
        this.plec = plec;
        this.gatunek = gatunek;
        this.ilos_lap = ilos_lap;
        this.kolor = kolor;
    }


    @Override
    public String toString() {
        return "zwierzak{" +
                "wiek=" + wiek +
                ", nazwa='" + nazwa + '\'' +
                ", plec='" + plec + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", ilos_lap=" + ilos_lap +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
