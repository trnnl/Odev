public class Instructor extends User{
    private String egitimler;

    public Instructor(String ad, String soyad, String id, String egitimler) {
        super(ad, soyad, id);
        this.egitimler = egitimler;
    }

    public String getEgitimler() {
        return egitimler;
    }

    public void setEgitimler(String egitimler) {
        this.egitimler = egitimler;
    }
}

