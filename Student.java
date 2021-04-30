public class Student extends User{
    String ogrenciNo;

    public Student(String ad, String soyad, String id, String ogrenciNo) {
        super(ad, soyad, id);
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
}
