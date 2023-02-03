public class OgrenciKrediManager extends BaseKrediManager {
    // Override işlemi tam olarak aşağıda gördüğünüz şeydir.
    // base bir sınıfı inheritance etti. Ancak operasyon adı aynı ama yapılan işlem farklıdır.
    // bu yüzden base operasyonu değil bu sınıftaki operasyon çalışır. Override edilir. Üstüne yazılır.
    public double hesapla(double kredi){
        return kredi*1.10;
    }
}
