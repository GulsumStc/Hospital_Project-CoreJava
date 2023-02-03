package HastaneProjectDevTeam03_EnSonHal;

public class Durum extends Hasta{
    private String aktuelDurum;

    private String aciliyet;

    public Durum(String isim, String soyIsim, int hastaID, String aktuelDurum, String aciliyet) {
        super(isim, soyIsim, hastaID);
        this.aktuelDurum = aktuelDurum;
        this.aciliyet = aciliyet;

    }

    public Durum() {
    }

    public String getAktuelDurum() {
        return aktuelDurum;

    }

    public void setAktuelDurum(String aktuelDurum) {
        this.aktuelDurum = aktuelDurum;
    }

    public String getAciliyet() {
        return aciliyet;
    }

    public void setAciliyet(String aciliyet) {
        this.aciliyet = aciliyet;
    }
}
