package all;
import all.logic.easy.*;
import all.strings.easy.*;
import all.arrays.easy.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        //0 - 1 - 0 - 2
        System.out.println(CaughtSpeeding.caughtSpeeding(60, false));
        System.out.println(CaughtSpeeding.caughtSpeeding(65, false));
        System.out.println(CaughtSpeeding.caughtSpeeding(65, true));
        System.out.println(CaughtSpeeding.caughtSpeeding(100, true));

        // true - false  - true
        System.out.println(Love6.love6(6, 4));
        System.out.println(Love6.love6(5, 5));
        System.out.println(Love6.love6(1, 5));

        // false  - true -  true
        System.out.println(More20.more20(20));
        System.out.println(More20.more20(21));
        System.out.println(More20.more20(22));

        // true - false  - true
        System.out.println(NearTen.nearTen(12));
        System.out.println(NearTen.nearTen(17));
        System.out.println(NearTen.nearTen(19));

        // 1 - 0  - 2
        System.out.println(TeaParty.teaParty(6, 8));
        System.out.println(TeaParty.teaParty(3, 8));
        System.out.println(TeaParty.teaParty(20, 6));

        // "Hello Bob!" - "Hello Alice!"  - "Hello X!"
        System.out.println(HelloName.helloName("Bob"));
        System.out.println(HelloName.helloName("Alice"));
        System.out.println(HelloName.helloName("X"));

        // "<<Yay>>" -  "<<WooHoo>>" - "[[word]]"
        System.out.println(MakeOutWord.makeOutWord("<<>>", "Yay"));
        System.out.println(MakeOutWord.makeOutWord("<<>>", "WooHoo"));
        System.out.println(MakeOutWord.makeOutWord("[[]]", "word"));

        //"Woo" - "Hello" - "abc"
        System.out.println(FirstHalf.firstHalf("WooHoo"));
        System.out.println(FirstHalf.firstHalf("HelloThere"));
        System.out.println(FirstHalf.firstHalf("abcdef"));

        //"ellohere" - "avaode" - "hotlava"
        System.out.println(NonStart.nonStart("Hello", "There"));
        System.out.println(NonStart.nonStart("java", "code"));
        System.out.println(NonStart.nonStart("shotl", "java"));

        // true - false - false
        System.out.println(EndsLy.endsLy("oddly"));
        System.out.println(EndsLy.endsLy("y"));
        System.out.println(EndsLy.endsLy("oddy"));

        // true - true - false
        int[] array1 = {1, 2, 6}, array2= {1, 2, 6}, array3 = {1, 2, 6};
        System.out.println(FirstLast6.firstLast6(array1));
        System.out.println(FirstLast6.firstLast6(array2));
        System.out.println(FirstLast6.firstLast6(array3));

        // true - false - true
        int[] array4 = {1, 2, 3}, array5= {7, 3}, array6 = {7, 3, 2}, array7 = {1, 3};
        System.out.println(CommonEnd.commonEnd(array4, array5));
        System.out.println(CommonEnd.commonEnd(array4, array6));
        System.out.println(CommonEnd.commonEnd(array4, array7));

        // [3, 2, 1] - [9, 11, 5] - [0, 0, 7]
        int[] array8 = {1, 2, 3}, array9= {5, 11, 9}, array10 = {7, 0, 0};
        System.out.println(Arrays.toString(Reverse3.reverse3(array8)));
        System.out.println(Arrays.toString(Reverse3.reverse3(array9)));
        System.out.println(Arrays.toString(Reverse3.reverse3(array10)));

        // [2, 5] - [7, 8] - [2, 4]
        int[] array11 = {1, 2, 3}, array12= {4, 5, 6}, array13 = {7, 7, 7}, array14 = {3, 8, 0}, array15 = {5, 2, 9}, array16 = {1, 4, 5};
        System.out.println(Arrays.toString(MiddleWay.middleWay(array11, array12)));
        System.out.println(Arrays.toString(MiddleWay.middleWay(array13, array14)));
        System.out.println(Arrays.toString(MiddleWay.middleWay(array15, array16)));

        // true - false - false
        int[] array17 = {4, 5}, array18= {4, 2}, array19 = {3, 5};
        System.out.println(No23.no23(array17));
        System.out.println(No23.no23(array18));
        System.out.println(No23.no23(array19));


    }
}