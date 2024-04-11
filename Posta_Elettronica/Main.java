public class Main {
    public static void main(String[] args) {
        Mailbox mailbox = new Mailbox();

        Mail mail1 = new Mail("mittente1@example.com", "Oggetto mail 1", "01/01/2022 10:00", "Testo mail 1");
        Mail mail2 = new Mail("mittente2@example.com", "Oggetto mail 2", "02/01/2022 11:00", "Testo mail 2");

        mailbox.aggiungiMail(mail1);
        mailbox.aggiungiMail(mail2);

        System.out.println("Mailbox prima di eliminazione:");
        for (Mail mail : mailbox.cercaMail("mail")) {
            System.out.println(mail);
        }

        mailbox.eliminaMail(1);

        System.out.println("\nMailbox dopo eliminazione:");
        for (Mail mail : mailbox.cercaMail("mail")) {
            System.out.println(mail);
        }
    }
}