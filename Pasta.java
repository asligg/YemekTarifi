public class Pasta extends YemekTarifi implements ITatliTarifi{
    private String tatliTur;
    private String malzemeler;

    public Pasta(int kisiSayisi, int pisirmeSuresi, String yemekAdi, String tatliTur, String malzemeler) {
        super(kisiSayisi, pisirmeSuresi, yemekAdi);
        this.tatliTur = tatliTur;
        this.malzemeler = malzemeler;
    }

    public Pasta(int kisiSayisi, int pisirmeSuresi, String yemekAdi) {
        super(kisiSayisi, pisirmeSuresi, yemekAdi);

    }

    @Override
    public void hazirla() {
        System.out.println("Pasta hazırlanıyor...");
    }

    @Override
    public void pisir() {
        System.out.println("Pasta pişiriliyor...");
    }

    @Override
    public void servisYap() {
        System.out.println("Pasta servis ediliyor...");
    }

    public String getTatliTur() {
        return tatliTur;
    }

    public String getMalzemeler() {
        return malzemeler;
    }

    @Override
    public void cirpma() {
        System.out.println("Pasta malzemleri çırpılıyor...");
    }
}
