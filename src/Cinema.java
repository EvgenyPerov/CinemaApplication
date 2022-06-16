import java.util.Calendar;

public class Cinema {
    private String filmName;
    private String janre;
    private float hour;

    public Cinema(String filmName, String janre, float hour) {
        this.filmName = filmName;
        this.janre = janre;
        this.hour = hour;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getJanre() {
        return janre;
    }

    public void setJanre(String janre) {
        this.janre = janre;
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }
}
