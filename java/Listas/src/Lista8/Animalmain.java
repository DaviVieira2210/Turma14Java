package Lista8;

public class Animalmain {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("PRETO","Bob",7,true);
		Cavalo horse = new Cavalo("MARROM","Elias",22,true);
		Preguica slothAnimal = new Preguica("BEGE","Thomas", 35, true);
		
		System.out.println("CACHORRO");
		System.out.println("NOME: "+dog.getNome());
		System.out.println("COR: "+dog.getCor());
		System.out.println("ANOS: "+dog.getIdade());
		System.out.println(dog.animalEmitiSom('S'));
		System.out.println(dog.setanimalcorre('S'));
		
		System.out.println("\n\nCAVALO");
		System.out.println("NOME: "+horse.getNome());
		System.out.println("COR: "+horse.getCor());
		System.out.println("ANOS: "+horse.getIdade());
		System.out.println(horse.animalEmitiSom('S'));
		System.out.println(horse.setanimalcorre('S'));
		
		System.out.println("\n\nPREGUIÇA");
		System.out.println("NOME: "+slothAnimal.getNome());
		System.out.println("COR: "+slothAnimal.getCor());
		System.out.println("ANOS: "+slothAnimal.getIdade());
		System.out.println(slothAnimal.animalEmitiSom('S'));
		System.out.println(slothAnimal.setanimalcorre('S'));
		
		
		
	}
}
