public class Main {
    public static void main(String[] args) {
        Uczen uczen1 = new Uczen("Kamil", "Bolek", 14, "ul. Lipowa 9", 3,4);
        Uczen uczen2 = new Uczen("Adam", "Nowak", 16, "ul. Kwiatowa 5", 10,6);
        Uczen uczen3 = new Uczen("Magdalena", "Kowalczyk", 15, "ul. Szkolna 12",5, 5);
        Uczen uczen4 = new Uczen("Marta", "Wójcik", 13, "ul. Leśna 7", 7,3);
        Uczen uczen5 = new Uczen("Tomasz", "Kowalski", 17, "ul. Parkowa 2", 11,2);

        Nauczyciel nauczyciel1 = new Nauczyciel("Anna", "Nowak", 40, "ul. Kwiatowa 51", "Matematyka");
        Nauczyciel nauczyciel2 = new Nauczyciel("Marcin", "Kowalczyk", 32, "ul. Szkolna 121", "Historia");
        Nauczyciel nauczyciel3 = new Nauczyciel("Marta", "Wójcik", 38, "ul. Leśna 72", "Język polski");
        Nauczyciel nauczyciel4 = new Nauczyciel("Tomasz", "Kowalski", 45, "ul. Parkowa 22", "Fizyka");
        Nauczyciel nauczyciel5 = new Nauczyciel("Ewa", "Jankowska", 37, "ul. Ogrodowa 91", "Biologia");

        Pracownik_administracyjny pracownik1 = new Pracownik_administracyjny("Anna", "Nowak", 30, "ul. Kwiatowa 45", "Asystent", "Obsługa biura");
        Pracownik_administracyjny pracownik2 = new Pracownik_administracyjny("Marcin", "Kowalczyk", 35, "ul. Szkolna 212", "Sekretarz", "Administracja dokumentami");
        Pracownik_administracyjny pracownik3 = new Pracownik_administracyjny("Marta", "Wójcik", 28, "ul. Leśna 57", "Księgowy", "Rozliczanie finansów");
        Pracownik_administracyjny pracownik4 = new Pracownik_administracyjny("Tomasz", "Kowalski", 42, "ul. Parkowa 72", "Dyrektor administracyjny", "Zarządzanie personelem");
        Pracownik_administracyjny pracownik5 = new Pracownik_administracyjny("Ewa", "Jankowska", 33, "ul. Ogrodowa 39", "Referent", "Obsługa dokumentacji kadrowej");

        pracownik2.zmianaDanychUczniaImie(uczen1,"Emil",null,4);
        uczen2.dodajOcene(5);
        uczen2.dodajOcene(6);
//        nauczyciel2.pokazOceny(uczen2);
        System.out.println(uczen2.sr_ocen());
//        nauczyciel2.wystawienieOcenyKoncowej(uczen2, 5);

//        uczen1.kimJestem();
//        nauczyciel1.kimJestem();
//        pracownik2.kimJestem();















    }
}

