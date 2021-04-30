public class StudentManager extends UserManager{
    @Override
    public void isimEkle(User user) {
        System.out.println("Öğrenci " + user.getAd() +" "+user.getSoyad() + " ekleniyor...");

    }
    public void isimEkle(Student student){
        System.out.println(student.getOgrenciNo() +" nolu öğrenci " + student .getAd() +" "+student.getSoyad());
    }

    @Override
    public void cokluİsimEkle(User[] user) {
        super.cokluİsimEkle(user);
    }

    @Override
    public void isimSil(User user) {
        super.isimSil(user);
    }
}
