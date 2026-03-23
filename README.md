# Notlarım

Bu depo, 42 Kocaeli bünyesinde C/C++ temelinden gelerek Java ve Spring Boot dünyasına geçiş sürecimi ve aldığım notlarımı içerir.

## 📅 1. Hafta: Java & OOP Temelleri
- [x] **Gün 1:** Java Anatomy & Pass-by-Value (Bellek kopyalama olayı)
- [x] **Gün 2:** OOP: Encapsulation & Inheritance (Warrior & Mage hiyerarşisi)
- [ ] **Gün 3:** Abstraction: Abstract Classes & Interfaces (Yarın 🚀)

---

## Derleme

- **Compile:** `javac Main.java`
- **Run:** `java Main`

---

### 1. Bellek ve Metotlar (Pass-by-Value)
* **İlkel Tipler (int, double vb.):** Metota kopyası gider. İçeride ne yaparsan yap dışarısı değişmez.
* **Nesne Tipleri (Class, Array):** Metota nesnenin **referansı** gider. 
    * *Not:* Syntax'ı ilkel tip gibi

### 2. Encapsulation (Kapsülleme)
* Değişkenleri `private` yapıp, dışarıya `getter/setter` ile kontrollü kapı açmak. Veriyi zırhlamak.

### 3. Inheritance (Kalıtım)
* **Keyword:** `extends` (C++'taki `: public` yerine).
* **Superclass:** Genel özelliklerin toplandığı ana sınıf.
* **Subclass:** Sadece o sınıfa özel yeteneklerin eklendiği alt sınıf.
* **`super()`:** Alt sınıfın constructor'ında **en üst satırda** yazılmalı. Üst sınıfın constructor'ını çağırır.

### 4. Static
* Sınıftan nesne üretmeden doğrudan sınıf ismiyle ulaşılır. Eğer aynı sınıfın içindeysen direk metodun ismiyle çağırabilirsin.

---

## Java vs C++ Farkları

* **Garbage Collector (GC):** Java'da `delete` atmaya gerek yok, JVM halleder.
* **Multiple Inheritance:** Java'da bir sınıf sadece **tek bir** sınıftan `extends` edilebilir. (Karmaşayı önlemek için).

---

## Dosya Düzeni
- `.gitignore` ile `.class` dosyalarını ve IDE çöplerini temiz tutuyorum.