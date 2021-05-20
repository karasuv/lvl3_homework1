

import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println(".......задание № 1 и 2 ................");
            genSimple();

        System.out.println(".......задание № 3 ................");

        FruitBox<Apple> AppleBox = new FruitBox<>();
        for (int i = 0; i < 5 ; i++) {
            AppleBox.add(new Apple());
        }
        for (int i = 0; i <AppleBox.getList().size() ; i++) {
            System.out.print(AppleBox.getList().get(i).getWeight()+ " ");
        }
        System.out.println();

        System.out.println("вес applebox:"+ AppleBox.getWeight());

        FruitBox<Orange> OrangeBox = new FruitBox<>();
        for (int i = 0; i < 4 ; i++) {
            OrangeBox.add(new Orange());
        }
        System.out.println("вес Orangebox:"+ OrangeBox.getWeight());

        //  System.out.println("вес applebox:"+ AppleBox.getWeight());
        //  System.out.println("вес orangebox:"+ AppleBox.getWeight());
        System.out.println("веса равны? - "+ AppleBox.compare(OrangeBox));


        AppleBox.add(new Apple());

        System.out.println("вес AppleBox: "+ AppleBox.getWeight());
        System.out.println("вес orangebox:"+ AppleBox.getWeight());
        System.out.println("веса равны? -  " + AppleBox.compare(OrangeBox));

        FruitBox<Apple> Apple123Box = new FruitBox<>();
        Apple123Box.add(new Apple());
        AppleBox.putToAnotherFruitBox(Apple123Box);

        System.out.println("вес applebox:"+ AppleBox.getWeight());
        System.out.println("вес orangebox:"+ OrangeBox.getWeight());
        System.out.println("вес apple123box:"+ Apple123Box.getWeight());



    }


    private static void genSimple() {
        Integer[] arrInt = new Integer[] {1,2,3,4,5,6,7,8,9};
        String[] arrStr = new String[]{"один","два","три","четыре","пять",};

        System.out.println("было:");
        for (int i = 0; i <arrInt.length ; i++) {
            System.out.print(arrInt[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <arrStr.length ; i++) {
            System.out.print(arrStr[i]+" ");
        }

        swapSingleArray(arrInt,0,8);
        swapSingleArray(arrStr,0,4);

        System.out.println();
        System.out.println("стало:");
        for (int i = 0; i <arrInt.length ; i++) {
            System.out.print(arrInt[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <arrStr.length ; i++) {
            System.out.print(arrStr[i]+" ");
        }
        System.out.println();
        ArrayList<Integer> ArrList;
        ArrList = ArrayToArrayList(arrInt);
        swap(ArrList,1,2);
        System.out.println(ArrList);
    }


    public static <T> void swap(ArrayList<T> arr,int i, int j){
        T temp = arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);

    }
    public static <T> void swapSingleArray(T[] arr,int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static <T> ArrayList<T> ArrayToArrayList(T[] arr){
        ArrayList<T> result= new ArrayList<T>();
        // result= Collections.addAll(arr);
        // result.addAll(Arrays.asList(arr));
        for (int i = 0; i <arr.length ; i++) {result.add(arr[i]);
        }
        return result;
    }



}
