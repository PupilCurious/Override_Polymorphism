public class Main {
    public static void main(String[] args) {
        //Polymorphism yani çok biçimliliği kullanabilmek için
        // base class dan inheritance edilen bütün class ları bir dizide topluyoruz.
        // böylelikle istediğimiz zaman ekle çıkar yapabiliyoruz. Polymorphism budur...
        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]
                {new TarimKrediManager(), new AskerKrediManager(), new OgrenciKrediManager()};

        //BaseKredi sınıfı bir dizi olduğu için içerisindeki elemanlarda
        // tek tek gezerek sonuçları ekrana yazdırmak için foreach den yararlanıyoruz.
        for(BaseKrediManager baseKrediManager:baseKrediManagers){
            System.out.println(baseKrediManager.hesapla(1000));
        }
    }
}