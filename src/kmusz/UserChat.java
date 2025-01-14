package kmusz;

import java.util.Scanner;

public class UserChat {
    public void userInput(){
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pesel");
        String pesel = scanner.nextLine();

        if (pesel.length() != 11){
            System.out.println("pesel musi posiadać 11 cyfr");
            return;
        }
        if (kalkulator.sprawdzPlec(pesel) == 'K'){
            System.out.println("Kobieta");
        }else{
            System.out.println("Mężczyzna");
        }

        if (kalkulator.sprawdzSumeKontrolna(pesel)){
            System.out.println("Suma Kontrolna jest poprawna");
        }else{
            System.out.println("Suma kontrolna jest niepoprawna");
        }

    }
}
