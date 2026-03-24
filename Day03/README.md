# Subject: Day 03 - Abstraction & Polymorphism

## Objectives
Nesne üretilemeyen soyut şablonlar (Abstract), yetenek sözleşmeleri (Interface) ve çalışma zamanı çok biçimliliğini (Polymorphism) birleştirmek.

## Instructions
- **Abstraction:** `Warrior` sınıfını `abstract` yaparak doğrudan `new` anahtar kelimesiyle üretilmesini engelleyin.
- **Interface:** `IShowInfo` isminde bir arayüz oluşturun ve tüm savaşçı sınıflarına bu yeteneği kazandırın.
- **Polymorphism:** `Warrior[]` tipinde bir dizi oluşturarak içine farklı alt sınıf nesnelerini (Mage, Archer) ekleyin.
- **Type Checking:** Bir döngü içinde `instanceof` kontrolü yaparak nesnelerin gerçek türlerini tespit edin ve tür dönüşümü (Downcasting) yaparak sınıfa özel metotları tetikleyin.