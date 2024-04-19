Bu tapşırığı yerinə yetirmək üçün Command Prompt'dan istifadə etdim və aşağıdakı commandları etdim.

1 --> command promptda cd Desktop/learning_java yazdım. cd - change direction

2 --> javac FirstJavaApp.java commandı ilə source kodumuzu bytecode çevirdik və .class uzantılı fayl yarandı.

3 --> java FirstJavaApp commandı Bu command, FirstJavaApp.class faylını JVM vasitəsilə işə salacaq və main metodunu icra edəcək. 
Bu metod System.out.println("Mən Java proqramlaşdırma dilini öyrənməyə başlayıram!"); sətrini icra edəcək və mətni konsolda çap edəcəkdir.

4 --> javap FirstJavaApp.class komandasını işə salaraq bytecode'ın içində nə olduğunu görə bilərsiniz. Bu komanda, 
FirstJavaApp.class faylının tərkibini göstərəcək və sinifin metodlarını və dəyişənlərini nəzərə çatdıracaq.
