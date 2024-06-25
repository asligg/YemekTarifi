public class Kebap extends YemekTarifi implements IAnaYemekTarifi{
    private String etTur;
    private String sebzeTur;

    public Kebap(int kisiSayisi, int pisirmeSuresi, String yemekAdi, String etTur, String sebzeTur) {
        super(kisiSayisi, pisirmeSuresi, yemekAdi);
        this.etTur = etTur;
        this.sebzeTur = sebzeTur;
    }

    public Kebap(int kisiSayisi, int pisirmeSuresi, String yemekAdi) {
        super(kisiSayisi, pisirmeSuresi, yemekAdi);

    }

    @Override
    public void hazirla() {
        System.out.println("Kebap hazırlanıyor...");
    }

    @Override
    public void pisir() {
        System.out.println("Kebap pişiriliyor...");
    }

    @Override
    public void servisYap() {
        System.out.println("Kebap servis ediliyor...");
    }

    public String getEtTur() {
        return etTur;
    }

    public String getSebzeTur() {
        return sebzeTur;
    }

    @Override
    public void dogra() {
        System.out.println("Kebap malzemleri doğranıyor...");
    }
}
