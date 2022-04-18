package HomeWork3;

public class Main {
    public static void main(String[] args){
        fillingBox();
    }
    public static void fillingBox(){
        Box<Apple> appleBox = new Box(1.0f);
        Box<Orange> orangeBox = new Box(1.5f);


        for(int i = 0; i < 30; i++){
            appleBox.addFruit(new Apple());
            orangeBox.addFruit(new Orange());
        }


        System.out.println("Вес ящика с яблоками: " + appleBox.getBoxWeight());
        System.out.println("Вес ящика с апельсинами: " + orangeBox.getBoxWeight());
        System.out.println("Сравнение ящиков: " + orangeBox.compare(appleBox));
    }

}
