import java.util.LinkedList;
import java.util.List;

public class Mailbox {
    private List<Mail> listaMail;

    public Mailbox() {
        this.listaMail = new LinkedList<>();
    }

    public void aggiungiMail(Mail mail) {
        listaMail.add(0, mail);
    }

    public void eliminaMail(int posizione) {
        if (posizione >= 0 && posizione < listaMail.size()) {
            listaMail.remove(posizione);
        } else {
            System.out.println("Posizione non valida.");
        }
    }

    public List<Mail> cercaMail(String testo) {
        List<Mail> mailTrovate = new LinkedList<>();
        for (Mail mail : listaMail) {
            if (mail.getOggetto().contains(testo)) {
                mailTrovate.add(mail);
            }
        }
        return mailTrovate;
    }
}