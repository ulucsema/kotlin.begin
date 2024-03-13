package com.semauluc.beginkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //logcat'e yazdırır
        println("Merhaba Kotlin")
        println(5 * 10)

        //Integer (tam sayılar)(Int)

        println("--------INTEGAR------")

        //Değişkenler
        var a = 7
        var b = 10
        println(a * b)

        var yas = 60
        println(yas / 5 * 8 )

        //sabitler
        val x = 5
        val y= 20
        println(x+y)

        println(yas*x)

        //camelCase
        //snake_case

        val yasSonucu = yas * x
        println(yasSonucu)

      //Tanımlama -Defining
        val benimIntegerim : Int

      //Başlatma Değerini Atama (Intializing, Initializition)

        benimIntegerim = 5
        var yeniInteger : Int = 20
        println(benimIntegerim/2)  //cevap 2 çıktı çünkü integer tam sayı veriyo

        println("--------LONG------")
        //var benimLong : long = 100
        //benimLong = 50000000
        //println(benimLong)

        println("--------Double & Float------")

        val pi = 3.14
        println(pi*2)

        val floatPi : Float = 3.14f  //float sayılarda (ondalıklı)  sonuna f harfi koy
        println(floatPi * 2)

        val yeniDouble = 5.0
        println(yeniDouble/2)


      //String-Metin
        println("--------Double & Float------")
          val benimString ="Benim Yeni metnim"
          println(benimString.length)
          val isim = "sema"
          val soyisim = " yüce"
          val tamisim = isim + soyisim
          println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"
        val baskaBirString ="20"
        println(yeniBirString+baskaBirString)  //1020 olucak metin olarak algıladı

        //String-Metin
        println("--------Boolean------")
        var benimBoolean = true
        benimBoolean = false

        // != eşit değildir
        //== eşittir
        // <= küçük eşittir
        // >= büyük eşittir
        // && ve
        //|| veya

        println(3>=1)
        println(4!=4)

        //veri tipi dönüştürme
        println("--------Dönüştürme------")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"  //bu bir string
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

        //Koleksiyon
        //Array -Dizi
        println("--------Koleksiyon------")
        val stringOrnek = "sema"
        val benimDizim = arrayOf(stringOrnek,"505","ayşe","ajda","asya")

        //index
        benimDizim[0]
        println(benimDizim[0])
        println(benimDizim[1])
        println(benimDizim[3])
        benimDizim[2] = "ali"
        println(benimDizim.get(4))
        println(benimDizim[2])
        benimDizim.set(3,"yüce")
        println(benimDizim[3])

        val numaraDizisi = doubleArrayOf(1.0,2.0,3.0)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Sema",24,3.6,true)
        println(karisikDizi[3])
        println(karisikDizi.get(0))

        //Array List
        println("-------ArrayList-----")
        val isimListesi = arrayListOf<String>("Sema","Tete","Pete")  //arrayListOf() diye bırakamazsın ya parantezi doldur ya da <String> yaz

        println(isimListesi[0])
        println(isimListesi.get(1))

        isimListesi.add("Atlas")
        isimListesi.add("Violet")
        println(isimListesi.get(4))
        
        
        val karisikArrayList = arrayListOf<Any>()  //Int de olur String de olur Any ile
        karisikArrayList.add("Sema")
        karisikArrayList.add(505)
        karisikArrayList.add(false)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))

        //Set
        println("------SET-------")

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")
        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,10)
        println(benimSet.size)  // 4 çıktı tekrar eden sayıları almadı

        //for each
        benimSet.forEach {
          println(it)  // 7 8 9 10 çıkarıcak
        }

        val digerSet = HashSet<String>()
        digerSet.add("Sema")
        digerSet.add("Sema")
        digerSet.add("Sema")
        digerSet.add("Yüce")

        digerSet.forEach {
            println(it)
        }

        //map
        println("------Map--------")

        //Anahtar Kelime (Key-Value Pairing)

        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,250,460)
        println("${yemekDizisi.get(0)} 'nın kalorisi : ${kaloriDizisi.get(0)} 'dur")

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",250)
        yemekKaloriMap.put("Tavuk",460)

        println(yemekKaloriMap.get("Et"))

        val benimMapim = HashMap<String,String>()
        benimMapim.put("örnek","değer")

        val yeniMap = hashMapOf<String, Int>("Sema" to 505, "Hey" to 5)
        println(yeniMap.get("Sema"))

        //Matematiksel işlemler
        println("-----MAtematiksel İşlemler-----")

        var sayi = 8
        println(sayi)
        sayi = sayi +1
        println(sayi)
        sayi++
        println(sayi++)
        sayi--
        println(sayi)

        var digerSayi = 23
        println(digerSayi > sayi)
        // && -> ve
        // || -> veya

        println(digerSayi > sayi && 2 > 3) // tarafta doğru olmalı
        println(digerSayi > sayi || 2 > 3) // en az biri olmalı

        println(2+2)
        println(2*2)
        println(2/2)
        println(2-2)

        //Reminder (kalanı bul)
        println(10%3) //%'de işareti ile

        //If Statements Eğer kontrolleri
        println("-------Eğer Kontroller-------")

        val skor = 78

        if (skor < 10) {
            println("Oyunu Kaybettin")
        } else if (skor >= 10 && skor < 20) {
            println("Eh işte")
        } else if (skor >= 20 && skor < 30) {
            println("Fena değil")
        } else {
            println("Efsanesin bro")
        }





    }
    }