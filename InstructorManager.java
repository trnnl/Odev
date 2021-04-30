public class InstructorManager extends UserManager{
    public void egitimleriGoster(Instructor instructor){
        System.out.println(instructor.getEgitimler());
    }

    @Override
    public void isimEkle(User user) {
        System.out.println("Eğitmen " + user.getAd() + " "+ user.getSoyad() + " ekleniyor...");
    }

    public void isimEkle(Instructor instructor){
    System.out.println(instructor.getAd()+ " " + instructor.getSoyad()+ " ' eğitim verdiği diller: " + instructor.getEgitimler());
}

}
