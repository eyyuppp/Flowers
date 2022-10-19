package com.eyyuperdogan.flowers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.eyyuperdogan.flowers.databinding.ActivityMainBinding

private lateinit var binding:ActivityMainBinding
private lateinit var landmarkList:ArrayList<landmark>
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList=ArrayList<landmark>()
        val rose= landmark("Rose","Rosaceae (Gülgiller) ailesinden olan gül, en çok hediye edilen, sevginin, aşkın ve saflığın simgesi olan bir çiçektir. Dünya üzerinde bulunan gül çeşitlerinin hemen hemen hepsi ülkemizde yetişmektedir. Türkiye’de 25 çeşit gül yetiştiği bilinmektedir. Sadece süs bitkisi olarak kullanılmayan gül kozmetikten ilaç sanayine, gıdadan yağ üretimine kadar birçok alanda tercih edilmektedir. Gül, yıllardır evlerin başköşelerinde, bahçelerin en güzel yerlerinde yetiştirilmiş, güzel görünümlü ve genellikle hoş kokulu çiçek türlerindendir.\n" +
                "\n",R.drawable.gul)
        val tulip= landmark("tulip"," Lale Çiçeği Nedir?\n" +
                " Lale çiçeği, Zambakgiller familyasından gelen ve rengarenk çiçeklere sahip olan çok hoş bir bitkidir. Lale çiçeğinin anavatanı Batı Asya’dır. Lale ilk olarak Türkiye'de süs bitkisi olarak yetiştirildi. Soğanlarının üzerinde ise zarımsı bir örtü yer alır. Aynı zamanda yeşil ve etli 2 - 8 yaprağı bulunur.\n" +
                " Lale Çiçeğinin Bakımı Nasıl Yapılır?\n" +
                " Lale çiçeğinin dikimi için en uygun mevsim sonbahardır. Özellikle de Ekim, Kasım ve Aralık aylarında dikilen laleler için çok fazla nem tutmayan bir yer seçilmesi gerekir. Lale dikilmeden önce toprağın gevşetilmesi gerekir.",R.drawable.lale)
        val violet= landmark("violet","Botanik Bilgi : Menekşegiller familyasından 10-40cm boyunda çokyıllık bir bitkidir.. Menekşe yetiştiği toprağa ve iklime göre çok çeşitli şekiller alan bir bitkidir. Aynı bitkinin çiçekleri farklı farklı açabilir. Gövde yuvarlak, oldukça sık çatallaşır. Alt yaprakları kalp, orta yaprakları oval ve üst yaprakları mızrak şeklinde olup, kenarları kertikli, koyu yeşil renkli, alt yaprakları uzun ve üst yaprakları kısa saplıdır. Çiçekleri leylaki veya mor renkdedir. Menekşe çiçeğinin Latince ismi tricolor yani üç renkli anlamına gelen bir isimle anılır. Tohumları  yumurta veya armut şeklindedir ve üst tarafında beyaz bir lekesi mevcuttur.  Kokulu menekşe, doğada özellikle nemli yerlerdeki ağaç altlarında ve ormanlık alanlarda kendiliğinden yetişen, bulunduğu yere yayılıp toprağı iyice örttüğü için bahçelerde süs bitkisi olarak yetiştirilebilir.",R.drawable.menekse)
        val narcissus= landmark("narcissus","  Nergis İsminin Özellikleri \n" +
                "\n" +
                " Bu kişilerin iradeleri güçlü olur ve olumlu bir amaç üzerine odaklanırlar. Detayları sevmezler ve fazla irdelenmesini de istemezler. Kendi çıkarlarını gözetirler ve kendi çıkarları için her şeylerini verebilirler. Eğer kendilerini kontrol etmeyi öğrenirlerse hayatlarının her alanında başarılı olmayı ve mutlu olmayı başarırlar. Rekabetten hoşlanmazlar. Kararlı ve açık sözlülerdir. Risk almaktan korkmazlar ve hızlı öğrenirler. Önderlik etmeyi sevdikleri için çalışma hayatlarında yönetici olmaları mümkündür. \n" +
                "\n" +
                " Nergis İsminin Analizi\n" +
                "\n" +
                " N: Empati kurmayı severler ve sağduyulu olmaları ile tanınırlar. \n" +
                "\n" +
                "E: Sıkıntılı durumlardan kurtulmak için her şeyi yaparlar ve problemleri çözmek için uğraşırlar. \n" +
                "\n" +
                "R: Tereddütlülerdir ve insanlara güvenme konusunda zorluk yaşarlar. Güven problemlerini aşamadıkları sürece sosyal çevrelerini genişletemezler. \n" +
                "\n" +
                "G: İnatçılardır ve istediklerini yaptırana kadar hiçbir işin peşini bırakmazlar. \n" +
                "\n" +
                "İ: Duygusal ve hassas yapıları olması yakın çevrelerinde olumsuz olarak değerlendirilebilir. \n" +
                "\n" +
                "G: Hayal kurmayı severler ve bazen hayal ile gerçeği bile karıştırabilirler. ",R.drawable.nergiz)
        val orchid= landmark("orchid","Orkide çiçeği, Salepgiller familyasına ait destansı güzelliğe sahip bir çiçektir. Tropikal iklimleri seven orkide dünyanın her yerinde yetişme imkanına sahiptir. Orkidelerin dünya üzerinde 20 000’den fazla çeşidi olduğu bilinmektedir. Türkiye’de yetişen 24 çeşidi vardır.\n" +
                "\n" +
                "Dünyada en geniş ikinci familyaya sahiptir. Bu zarif çiçeğin yaprakları sıralı, pul şeklinde ve damarlı olur. En yaygın olan orkide çeşitleri şu şekildedir:\n" +
                "\n" +
                "Cymbidium\n" +
                "Miltonia\n" +
                "Phalaenopsis\n" +
                "Paphiopedilum\n" +
                "Ömrünüzde bir kez de olsa sevdiklerimize çiçek hediye etmişizdir. Orkide çiçeği de bu çiçekler arasında en çok tercih edilenlerden. Oldukça zarif ve güzel olması sebebiyle karşı tarafa kendini değerli hissettirir.\n" +
                "\n",R.drawable.orkide)
        val hydrangea= landmark("hydrangea","rtanca çiçeğinin Latince adı Hydrangea Macrophylla olarak bilinmektedir. Bu çiçeğin gövdesi, çalı şekline benzer. Ortanca çiçeğinin anavatanı ise Japonya'dır. Bununla birlikte ortanca çiçekleri çok değişik renkler ile yetiştirilmektedir. Kokusu olmayan bu çiçek türünün, renk çeşitleri ve yaprak şekilleri ile oldukça büyüleyici bir görünüme sahip olduğu belirtilebilir. Bu özelliklerden dolayı, ortanca çiçeği dünyanın her yerinde çok sık yetiştirilen bir süs bitkisi olduğunu belirtmek yanlış olmayacaktır. \n" +
                "\n" +
                " Ortanca Çiçeği Nedir?\n" +
                "\n" +
                "  Ortanca çiçeği; çalı şeklindeki gövdeye sahip bir bitkidir. Kış aylarında yaprakları döken bu çiçeğin anavatanı Japonya'dır. Ortanca çiçeklerinin pek çok rengi olabilir. Kokusu bulunmayan bu çiçeğin, renklerinin çok gösterişli olduğunu belirtmek mümkündür.\n" +
                "\n",R.drawable.ortanca)
        val daisy= landmark("daisy","Papatyanın Anlamı ve Özellikleri\n" +
                "Papatyanın anlamı rengine göre değişir. Beyaz papatya anlamı saflık, masumiyet, sonsuz sevgi iken sarı papatya anlamı içtenlik, arkadaşlık ve cana yakınlık demektir. Her yerde bulunduğu ve çabuk büyüdüğü için birçok kişi bahçesinde ve balkonunda papatya yetiştirir. Bununla birlikte hediye olarak da çok fazla tercih edilen bir çiçek türüdür. Papatyanın anlamının önemi, her yerde kolayca yetişmesi, çabuk solması ve bunun gibi nedenlerden dolayı buket olarak papatya hediyesi verebilirsiniz. Elbette başka çeşitleri de tercih edebilirsiniz.\n" +
                "\n" +
                "Buket olarak çabuk solması nedeni oldukça önemlidir. Çünkü uzun ömürlü bir çiçek olsaydı ya da büyümesi uzun zaman alsaydı saksı çiçeği olarak hediyelik seçenekleri arasına girerlerdi. Oysaki bu çiçek türü her yerde yetişiyor ve iklim şartlarına karşı da oldukça dayanıklı.\n" +
                "\n" +
                "Çiçeklerin evrensel bir dile sahip olduğunu herkes biliyor. Böylece onları hediye ederek sevdiklerimize yüzlerce mesaj gönderebiliriz. En önemlisi de kalbimizde gizlediklerimizi ya da söyleyemediklerimizi alıcımızın kulağına fısıldarlar. Ayrıca onları birçok sebep ile hediye olarak kullanabiliriz. Bu sebepler arasında anneler günü, sevgililer günü ve doğum günü hediyesi olmaları yer alır. Bu şekilde hediye olarak verilerek papatyanın anlamı iyi ki varsın, doğum günü kutlu olsun, seni seviyorum gibi derin duygular da içerebilir.",R.drawable.papatya)
        val chrysanthemum= landmark("chrysanthemum"," Saksı veya bahçede kasımpatı çiçeği oldukça kolay bir şekilde yetiştirilmektedir. Genellikle ekim ya da kasım aylarında çiçek açmakta olduğundan bu adı aldığını söylemek önemlidir. Bir diğer adı Krizantem şeklindedir. Eşsiz rengiyle birlikte pek çok ayrıcalığıyla sevilen çiçek çeşitleri içinde bulunmaktadır. \n" +
                "\n" +
                " Kasımpatı Çiçeği Nedir?\n" +
                "\n" +
                "  Kasımpatı; papatyagiller ailesinden bir çiçektir. Birbirinden farklı ve güzel renklere sahip olan Kasımpatı çiçekleri, katlı görünüşe ve taç yapraklara sahip bitkidir. Kasımpatı; sonbahar aylarına renk katan nadir çiçeklerin başında gelmektedir. Kasımpatı şeklinde isimlendirilmesinin sebebi; renkli çiçeklerin solduğu veya öldüğü kasımda aniden açması şeklinde görülür. Kasımpatı; cenaze çiçeği şeklinde ifade edilir. Kasımda nedensiz çıkan Kasımpatı çiçekleri, iyimserliği çağrıştırır. . ",R.drawable.kasimpati)

        landmarkList.add(rose)
        landmarkList.add(tulip)
        landmarkList.add(violet)
        landmarkList.add(narcissus)
        landmarkList.add(orchid)
        landmarkList.add(hydrangea)
        landmarkList.add(daisy)
        landmarkList.add(chrysanthemum)


        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        var landmarkAdapter =LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landmarkAdapter

    }
}