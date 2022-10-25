public class APINot {

    /*

-Bütün Web Service'ler API'dir ama her API bir Web Service degildir

1) GET: Sunucudan sadece veri çekmek(okuma) istiyorsak
yani veri üzerinde herhangi bir değişiklik (ekleme, slime, modifiye)
yapılmayacaksa GET metodunu kullanmamız tavsiye ediliyor.
CRUD operasyonlarından Read’e karşılık geldiğini söyleyebiliriz.
Ör: GET /students kullandığımızda bize öğrenciler listesini dönmesi.

2) POST: Server Api’e body kısmını doldurarak ve veri üzerinde değişiklik yapmak istediğimizde kullanabiliriz
Değişilik yapmak ile kastedilen CRUD operasyonlarından Create ve Update kısımlarını kapsar.
Ör: Post /createUser ile body kısmına kullanıcı bilgileri girip veritabanında bir kullanıcı oluşturulması istenmesi

3) PUT: Post isteğinin özelliklerine sahiptir.
Yani CRUD operasyonlarından Create ve Update operasyonlarını yapmak istediğimizde kullanıyoruz.
Post’dan ayrılan tarafı Put isteğinin idempotent ve not cacheable olarak tanımlanması

4) DELETE: CRUD operasyonlarından Delete’e karşılık gelir. Bir veriyi silmek istediğimizde kullanılması tavsiye ediliyor.


https://petstore.swagger.io/   --> Swagger Petstore incaleme sitesi

https://petstore.swagger.io/			--> API
https://restful-booker.herokuapp.com/booking	--> Tets
https://jsonplaceholder.typicode.com/todos	--> Site
https://reqres.in/api/users			--> Örnekleri


GET : getir
	-->id ve benzer verileri inceleyabiliriz
	-->Pretty'den kalıbı kopyalayabiliriz

POST : Yeni kayıt oluştur
	--> Kopyaladıgımız kalıpla body'de JSON dili ile yeni kayıt olusturabiliriz
	--> Mevcut id degisiyor dogal olarak

PATCH : Yama yapma (Yani düzeltme)
	--> Mevcut datanın bir kısmını guncellemek için kullanılır

PUT : Bütün datayı guncelleme
	--> Mevcut id degismeden data'da komple degisiklik yapilabilir

DELETE : Kayıt silme
	--> Mevcut kaydı silmek icin kullanılır

     */
}
