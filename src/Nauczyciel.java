import java.util.ArrayList;

public class Nauczyciel extends Osoba {
    String przedmiot;

    public Nauczyciel(String imie, String nazwisko, int wiek, String adres, String przedmiot) {
        super(imie, nazwisko, wiek, adres);
        this.przedmiot=przedmiot;
    }
    public void wystawienieOcenyKoncowej(Uczen uczen, int ocena_koncowa){
        uczen.ocena_koncowa = ocena_koncowa;
    }

    public void pokazOceny(Uczen uczen){
        for(int i =0; i< uczen.lista_ocen.size();i++){
            System.out.print(uczen.lista_ocen.get(i)+", ");
        }
    }
    @Override
    public void kimJestem(){
        System.out.println("Jestem nauczycielem.");
    }


}
