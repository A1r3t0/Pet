public class pets {
    public static class Pet {
        String name;
        public static String petSays() {
            return "";
        }
    }
    public static class universalPet extends Pet {
        public static String petSays() {
            return "РРР";
        }
    }
    public static class Cat extends universalPet {
        public static String petSays() {
            return "Мяу";
        }
    }
    public static class Fox extends universalPet {
        public static String petSays() {
            return "Фыр-фыр";
        }
    }
    public static void main(String[] args) {
        universalPet pet = new universalPet();
        Cat cat = new Cat();
        Fox fox = new Fox();
        System.out.println(pet.petSays());
        System.out.println(cat.petSays());
        System.out.println(fox.petSays());
    }
}
