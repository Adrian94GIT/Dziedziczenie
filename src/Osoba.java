public class Osoba {
    String imie;
    String nazwisko;
    int wiek;
    String adres;
    public Osoba(String imie, String nazwisko, int wiek, String adres){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
        this.adres=adres;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public String getAdres() {
        return adres;
    }

    public void  kimJestem (){
        System.out.println("Nie wiem kim jestem");
    }
}






