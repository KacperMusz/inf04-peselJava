package kmusz;

public class Kalkulator {
    public Kalkulator() {
    }
    public char sprawdzPlec(String pesel){
        char plec = pesel.charAt(9);
        int czyParzysta = Integer.parseInt(String.valueOf(plec));
        char znak;
        if (czyParzysta % 2 == 0){
            znak = 'K';
        }else{
            znak = 'M';
        }
        return znak;
    }

    public boolean sprawdzSumeKontrolna(String pesel){
        int[] wagi = {1,3,7,9,1,3,7,9,1,3};
        int S = 0;
        for (int i = 0; i < 10; i++){
            S += (pesel.charAt(i) - '0') * wagi[i];
        }
        int M = S % 10;
        int R;
        if (M != 0 ){
            R = 10 - M;
        }else{
            R = 0;
        }
        return R == pesel.charAt(10) - '0';

    }

}
