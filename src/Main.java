
public class Main {
    public static void main(String[] args) {
        Gryffindor garryPotter = new Gryffindor("Garry Potter", 89, 68,
                98, 99, 98);
        Gryffindor hermioneGranger =new Gryffindor("Hermione Granger", 99, 99,
                89, 97, 65);
        Gryffindor ronWeasley =new Gryffindor("Ron Weasley", 47, 36,
                71, 88, 27);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 76, 84,
                97, 99, 80, 82, 98);
        Slytherin grahamMontague = new Slytherin("Graham Montegue", 15, 15,
                66, 44, 55, 33, 66);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 15, 3,
                11, 11, 23, 5, 3);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 47, 56,
                87, 89, 92);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 89, 76,
                90, 95, 98);
        Hufflepuff justinFletchley = new Hufflepuff("Justin Finch-Fletchley", 34, 26,
                52, 51, 67);

        Ravenclaw choChang = new Ravenclaw("Cho Chang", 69, 42,
                72, 41, 13, 92);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 26, 19,
                43, 56, 56, 76);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 59, 40,
                71, 51, 28, 73);

        garryPotter.description();
        ronWeasley.compareGryffindor(garryPotter);
        cedricDiggory.compareHufflepuff(justinFletchley);
        padmaPatil.compareRavenclow(choChang);
        gregoryGoyle.compareSlytherin(dracoMalfoy);
        marcusBelby.compareHogwartsStudent(garryPotter);
    }
}