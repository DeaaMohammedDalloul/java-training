public class tast5 {
    /*
    أكيد، جرّب هذا السؤال، وبدون مصفوفات:

السؤال:
اكتب برنامج Java يستخدم for loop لطباعة الأرقام من 1 إلى 20، ولكن:

* إذا كان الرقم زوجيًا اطبع Even
* وإذا كان فرديًا اطبع Odd

مثال:

1 Odd
2 Even
3 Odd
...
20 Even

حلّه بنفسك، وأرسل لي الكود وأنا أصححه لك.
     */

    static void main(String[] args) {

        for (int i = 1 ; i <= 20 ; ++i) {

            if ( i % 2 == 0 ){
                System.out.println(i + " Even ");


            }else {
                System.out.println(i + " odd " );
            }
        }

        }



    }

