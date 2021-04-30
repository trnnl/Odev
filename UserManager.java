public class UserManager {
    public void isimEkle(User user){
        System.out.println(user.getAd() + " "+ user.getSoyad() + " ekleniyor...");
    }
    public void cokluİsimEkle(User[] user){
        for(User users : user){
            System.out.println(users.getAd()+ " "+ users.getSoyad()+ " ekleniyor...");
        }
    }
    public void isimSil(User user){
        System.out.println(user.getAd()+" " + user.getSoyad() + " siliniyor...");
    }

}
