public abstract class YemekTarifi {
    protected int kisiSayisi;
    protected int pisirmeSuresi;
    protected String yemekAdi;

    public YemekTarifi(int kisiSayisi, int pisirmeSuresi, String yemekAdi) {
        this.kisiSayisi = kisiSayisi;
        this.pisirmeSuresi = pisirmeSuresi;
        this.yemekAdi = yemekAdi;
    }

    public int getKisiSayisi() {
        return kisiSayisi;
    }

    public int getPisirmeSuresi() {
        return pisirmeSuresi;
    }

    public String getYemekAdi() {
        return yemekAdi;
    }
    public abstract void hazirla();
    public abstract void pisir();
    public abstract void servisYap();
}
