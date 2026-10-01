package accounts;

import java.util.Random;

public class AccountNumberService {
    public static String GenerateAccountNumber(){

        Random random = new Random();
        int[] vahy = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
        String kodBanky = "0800";

        while (true) {
            String cislo = String.format("%010d", random.nextLong(1_000_000_0000L));

            int soucet = 0;
            for (int i = 0; i < 10; i++) {
                int cifra = cislo.charAt(9 - i) - '0';
                soucet += cifra * vahy[i];
            }
            if (soucet % 11 == 0 && soucet > 0) {
                String cisteCislo = cislo.replaceFirst("^0+", "");
                return cisteCislo + "/" + kodBanky;
            }
        }
    }

}
