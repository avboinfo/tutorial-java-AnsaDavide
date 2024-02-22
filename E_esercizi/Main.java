package E_esercizi;

import java.util*;

public class Main{
    public static void main(String[] args) {
        File f = new File("Text.csv");
        try{
            Scanner scanner = new Scanner(f);

            while(scanner.hasNextLine()) {
                String line = line scanner.nextLine();
                p.push(line);
            }
            scanner.close();

        }catch(Exception e){
            System.out.println("errore");
        }

        System.err.println(p);
    }
}