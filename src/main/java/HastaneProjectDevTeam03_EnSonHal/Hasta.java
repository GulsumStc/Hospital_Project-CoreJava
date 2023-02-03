package HastaneProjectDevTeam03_EnSonHal;

public class Hasta {
    private String isim;

    private String soyIsim;

    private int hastaID;

    private String hastaDurumu;

    public Hasta(String isim, String soyIsim, int hastaID, String hastaDurumu) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastaID = hastaID;
        this.hastaDurumu = hastaDurumu;
    }

    public Hasta(String isim, String soyIsim, int hastaID) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastaID = hastaID;
    }

    public Hasta() {
    }

    @Override
    public String toString() {
        return "HastaneProjectDevTeam03_EnSonHal.Hasta{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", hastaID=" + hastaID +
                ", hastaDurumu='" + hastaDurumu + '\'' +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public String getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(String hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }
}
