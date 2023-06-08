import java.util.ArrayList;

public class Uczen extends Osoba{
    int klasa;
    ArrayList <Integer> lista_ocen;
    int ocena_koncowa;

    public Uczen(String imie, String nazwisko, int wiek, String adres, int klasa, int ocena_koncowa) {
        super(imie, nazwisko, wiek, adres);
        this.klasa=klasa;
        this.lista_ocen=new ArrayList<>();
        this.ocena_koncowa=ocena_koncowa;
    }
    public void dodajOcene(int ocena){
        lista_ocen.add(ocena);
    }
    public double sr_ocen(){
        double suma = 0;
        for (int i = 0; i < lista_ocen.size(); i++)
        {
            suma += lista_ocen.get(i);
        }
        double srednia = suma/lista_ocen.size();
//        return 5.0d;
        return srednia;
    }

    public void setImie(String noweImie){
         imie = noweImie;
    }


    public void setNazwisko(String noweNazwisko) {
        nazwisko = noweNazwisko;
    }

    public void setKlasa(int nowaKlasa) {
        klasa = nowaKlasa;
    }

    @Override
    public void kimJestem(){
        System.out.println("Jestem uczniem");
    }
}
