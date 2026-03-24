# Notlarım

Bu depo, 42 Kocaeli bünyesinde C/C++ temelinden gelerek Java ve Spring Boot dünyasına geçiş sürecimi ve aldığım notlarımı içerir.

## 📅 1. Hafta: Java & OOP Temelleri
- [x] **Gün 1:** Java Anatomy & Pass-by-Value (Bellek kopyalama olayı)
- [x] **Gün 2:** OOP: Encapsulation & Inheritance (Warrior & Mage hiyerarşisi)
- [x] **Gün 3:** Abstraction: Abstract Classes & Interfaces
- [x] **Gün 4:** Polymorphism: Çok Biçimlilik (instanceof & Casting)
- [ ] **Gün 5:** Collections (ArrayList & List) (Yarın 🚀)

---

## Derleme

- **Compile:** `javac Main.java`
- **Run:** `java Main`

---

### 1. Bellek ve Metotlar (Pass-by-Value)
* **İlkel Tipler (int, double vb.):** Metota kopyası gider. İçeride ne yaparsan yap dışarısı değişmez.
* **Nesne Tipleri (Class, Array):** Metota nesnenin **referansı** gider. 
    * *Not:* Syntax'ı ilkel tip gibi olsa da metota nesnenin referansı gittiği için değişiklikler kalıcıdır.

### 2. Encapsulation (Kapsülleme)
* Değişkenleri `private` yapıp, dışarıya `getter/setter` ile kontrollü kapı açmak. Veriyi zırhlamak.

### 3. Inheritance (Kalıtım)
* **Keyword:** `extends` (C++'taki `: public` yerine).
* **Superclass:** Genel özelliklerin toplandığı ana sınıf.
* **Subclass:** Sadece o sınıfa özel yeteneklerin eklendiği alt sınıf.
* **`super()`:** Alt sınıfın constructor'ında **en üst satırda** yazılmalı. Üst sınıfın constructor'ını çağırır.

### 4. Static
* Sınıftan nesne üretmeden doğrudan sınıf ismiyle ulaşılır. Eğer aynı sınıfın içindeysen direk metodun ismiyle çağırabilirsin.

### 5. Abstraction (Soyutlama)
* **Abstract Class:** `abstract` keyword'ü ile sınıfı şablon haline getirir. `new` ile nesne üretilemez.
* **Interface:** Bir "sözleşme"dir. `implements` ile sınıfa yetenek kazandırılır. Java'da çoklu kalıtım yoktur ama sınırsız interface uygulanabilir.
* *Not:* Interface'in tüm metotları implement edilen fonksiyonda override edilmek zorundadır yoksa hata verir.
* **Metotlar:** Interface içindeki metotlar varsayılan olarak `public`'tir belirtmeye gerek yok, override ederken tekrar public olarak tanımlanmalıdır.

### 6. Polymorphism (Çok Biçimlilik)
* **Upcasting:** Farklı nesneleri (Mage, Archer) tek bir listede (Warrior[]) toplamayı sağlar.
* **Downcasting:** Alt sınıfa özel bir yeteneğe (buyuAt()) ulaşmak için instanceof ile kontrol edilip asıl türüne dönüştürülmesidir.
* **instanceof:** Bir nesnenin o anki çalışma zamanında bir sınıftan veya interface'ten türeyip türemediğini kontrol eder.
* *Not:* Ortak metotlarda nesne üst sınıf gibi davranır; özel metotlar için ise aslına döndürülür.

---

## Java vs C++ Farkları

* **Garbage Collector (GC):** Java'da `delete` atmaya gerek yok, JVM halleder.
* **Multiple Inheritance:** Java'da bir sınıf sadece **tek bir** sınıftan `extends` edilebilir. (Karmaşayı önlemek için).
* **Interface:** C++'ta tüm metotları saf sanal (= 0) olan bir Abstract Class'tır. Java'da bu bir sınıf değil, hiyerarşiden bağımsız ve sınırsız sayıda kuşanılabilen bir yetenek sözleşmesidir.

---

## Dosya Düzeni
- `.gitignore` ile `.class` dosyalarını ve IDE çöplerini temiz tutuyorum.