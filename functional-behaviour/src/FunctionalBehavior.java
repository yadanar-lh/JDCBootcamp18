import java.awt.desktop.AppForegroundListener;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalBehavior {
    static void main(String[] args) {
        List<Apple> appleList = List.of(new Apple("Red", 20),
                new Apple("REd",25  ),
                new Apple("Green",30),
                new Apple("Green",10),
                new Apple("Green",25));
                new Apple("Yellow",30);
                new Apple("Yellow",25);
                new Apple("Yellow",20);

//        List<Apple> applesByColor = searchAppleByColor(appleList,"Green");
//        applesByColor.forEach(System.out::println);

//        List<Apple> apples = searchAppleByColorAndWeight(appleList,"Green", 25);
//        apples.forEach(System.out::println);

//        List<Apple> apples = search(appleList,
//                a -> a.getColor().equals("Green"));
//        apples.forEach(System.out::println);

        appleList.stream()
                .filter(a -> a.getColor().equals("Green")
                && a.getWeight() >= 25)
                .forEach(System.out::println);

    }

    public static<T> List<T> search(List<T> list, Predicate<T> p){
        List<T> tList = new ArrayList<>();
        for(T t:list){
            if(p.test(t)){
                tList.add(t);
            }
        }
        return tList;
    }
    public static List<Apple> searchAppleByColorAndWeight(List<Apple> list, String color, int weight){
        List<Apple> apples = new ArrayList<>();
        for(Apple apple:list){
            if(apple.getColor().equals(color) && apple.getWeight()>= weight){
                apples.add(apple);
            }
        }
            return apples;
    }

    public static List<Apple> searchAppleByWeight(List<Apple> list,int weight){
        List<Apple> apples = new ArrayList<>();
        for (Apple apple:list){
            if (apple.getWeight() >= weight){
                apples.add(apple);
            }
        }
        return apples;
    }
    public static List<Apple> searchAppleByColor(List<Apple> list,String color){
        List<Apple> apples = new ArrayList<>();
        for (Apple apple:list){
            if (apple.getColor().equals(color)){
                apples.add(apple);
            }
        }
        return apples;
    }
}