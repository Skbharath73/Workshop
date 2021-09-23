package birds.sanctuary;
//Control layer
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to bird sanctuary");
        BirdsRepo birdsRepo = new BirdsRepo();
        UserInterface userInterface=new UserInterface();

        Pecock pecock = new Pecock();
        pecock.ID="P001";
        pecock.gender="Male";

        Penguin penguin = new Penguin();
        penguin.ID="Pen001";
        penguin.gender="Female";

        Hen hen = new Hen();
        hen.ID="H001";
        hen.gender="Female";

        Duck duc = new Duck();
        duc.ID="D001";
        duc.gender="Female";

        Duck duc0 = new Duck();
        duc0.ID="D001";
        duc0.gender="Female";

        Crow crow = new Crow();
        crow.ID="C001";
        crow.gender="Male";

        birdsRepo.add(crow);
        birdsRepo.add(hen);
        birdsRepo.add(duc);
        birdsRepo.add(duc0);
        birdsRepo.add(penguin);
        birdsRepo.add(pecock);
        birdsRepo.add(pecock);

        userInterface.print(birdsRepo.getBirdList());
        birdsRepo.remove(crow);
        System.out.println("After Deletion");
        userInterface.print(birdsRepo.getBirdList());

    }

}
