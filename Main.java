public class Main{

    public static void printSlogan(String newSlogan){
        System.out.println(newSlogan);
    }

    public static void main(String[] args){

        SuperHero larry = new SuperHero();
        
        larry.setAge(26);
        larry.setName("Larry");
        larry.setSuperPower("Teleportation");
        larry.setWeakness("Sandwiches");

        System.out.println("Name: " + larry.getName());
        System.out.println("Age: " + larry.getAge());
        System.out.println("Super Power: " + larry.getSuperPower());
        System.out.println("Weakness: " + larry.getWeakness());

        printSlogan("the medicine tasted horrible but i guess the paitient needed it");

        // A repository is a way to store code in a central location (GutHub servers). 
        // Github allows you to collaborate 
        // Commiting pushes your code to the repository where other computers can access it
        // A directory is how we organize our files and folders. For example, we might have a directory for only JSON files
        // The staging area is where git knows what is being changed in a file
        // Branches help you organize your progect into sections. These sections can be merged into Main (the master branch) 
        // Remote is what is in the cloud on GitHub's servers. Local is localhost: your version of the code on your computer

    }
}