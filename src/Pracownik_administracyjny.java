public class Pracownik_administracyjny extends Osoba {
    String stanowisko;
    String obowiazki;

    public Pracownik_administracyjny(String imie, String nazwisko, int wiek, String adres, String stanowisko, String obowiazki) {
        super(imie, nazwisko, wiek, adres);
        this.obowiazki=obowiazki;
        this.stanowisko=stanowisko;
    }

    public void zmianaDanychUczniaImie(Uczen uczen,String noweImie, String noweNazwisko, int nowaKlasa){
        uczen.setImie(noweImie);
        uczen.setNazwisko(noweNazwisko);
        uczen.setKlasa(nowaKlasa);
    }
    @Override
    public void kimJestem(){
        System.out.println("Jestem pracownikiem administracyjnym");
    }
}
