
public class ClassesAndObjects {

    public static void main(String args[]) {
        Cat garfield = new Cat("Garfield");
        garfield.setFavoriteFood("lasagna");
        garfield.setAge(8);
        System.out.println(garfield.getFavoriteFood());
        System.out.println(garfield.getAge());


        Cat pinkPanther = new Cat("Pink Panther");
        pinkPanther.setFavoriteFood("lolipops");
        pinkPanther.setAge(13);
        System.out.println(pinkPanther.getFavoriteFood());
        System.out.println(pinkPanther.getAge());


        Cat catWoman = new Cat("Cat Woman");
        catWoman.setFavoriteFood("licorice");
        catWoman.setAge(7);
        System.out.println(catWoman.getFavoriteFood());
        System.out.println(catWoman.getAge());


        Person janeDoe = new Person("Jane Doe")


        isOlder(garfield, catWoman);
        makeBestFriends(pinkPanther, garfield);
        makeKitten(pinkPanther, catWoman);
        adoption(garfield, janeDoe);

    }

    public boolean isOlder(Cat1, Cat2) {
        if (Cat1.getAge() > Cat2.getAge()) {
            return true;
        } else {
            return false;
        }

    }

    public void makeBestFriends(Cat1, Cat2) {
        Cat2.setFavoriteFood(Cat1.getFavoriteFood().toString);
    }

    public Cat makeKitten(Cat1, Cat2) {
        String parent1 = Cat1.getName();
        String parent2 = Cat2.getName();

        String kittenName = parent1 + parent2;
        Cat newKitty = new Cat(kittenName);

        return newKitty;

        newKitty.setAge(0);
        System.out.println(newKitty.getName());
        System.out.println(newKitty.getAge());
    }



    public void adoption(Cat, Person) {
        System.out.println(Person.getName() + "is now "
                + Cat.getName() + "'s owner!");
    }

}
}
