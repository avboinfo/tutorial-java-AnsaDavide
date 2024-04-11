public class Mail {
    private String mittente;
    private String oggetto;
    private String dataOra;
    private String testo;

    public Mail(String mittente, String oggetto, String dataOra, String testo) {
        this.mittente = mittente;
        this.oggetto = oggetto;
        this.dataOra = dataOra;
        this.testo = testo;
    }

    public String getMittente() {
        return mittente;
    }

    public String getOggetto() {
        return oggetto;
    }

    public String getDataOra() {
        return dataOra;
    }

    public String getTesto() {
        return testo;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mittente='" + mittente + '\'' +
                ", oggetto='" + oggetto + '\'' +
                ", dataOra='" + dataOra + '\'' +
                ", testo='" + testo + '\'' +
                '}';
    }
}