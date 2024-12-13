package weeekTwelve.Lab11;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    //Scanner
    Scanner scnr = new Scanner(System.in);
    Pokedex pokedex = new Pokedex();

    public void displayMenu(){
        int input;
        while(true){
            System.out.println("**********MENU**********" +
                    "\nPlease Make A Selection:\n" +
                    "1) Add Pokemon\n" +
                    "2) Remove Pokemon\n" +
                    "3) Display Pokemon Info\n" +
                    "4) Display All Pokemon Info\n" +
                    "5) Exit");
            input = Integer.parseInt(scnr.nextLine());
            if (input == 1){
                createPokemon();
            }
            else if (input == 2){
                deletePokemon();
            }
            else if (input == 3){
                displayPokemon();
            }
            else if (input == 4){
                displayAllPokemon();
            }
            else if (input == 5){
                System.out.println("Exiting......");
                break;
            }
            else{
                System.out.println("Invalid Entry Please Try Again");}}}

    private void createPokemon(){

        String name, moveName;
        int hp, movePower,moveSpeed, userChoice;
        Pokemon pokemon;
        Move move;

        System.out.println("Would you like to " +
                "(1) enter Details manually, or" +
                "(2) select from File?");
        userChoice = Integer.parseInt(scnr.nextLine());
        if(userChoice == 1){
            System.out.println("Enter Pokemon Name: ");
            name = scnr.nextLine();
            System.out.println("Enter Pokemon HP: ");
            hp = Integer.parseInt(scnr.nextLine());
            pokemon = new Pokemon(name, hp);

            addMovesToPokemon(pokemon);

            pokedex.addPokemon(pokemon);
            System.out.printf("\nPokemon: %s Added to Pokedex \n\n",name );
        }
        else if(userChoice == 2){

            FileRead fileReader = new FileRead();
            ArrayList<String[]> pokemonData;

            try {
                pokemonData = fileReader.readPokemonData("CharacterStatsFile.txt");
                if(pokemonData.isEmpty()){
                    System.out.println("No Pokemon Data Available");
                    return;
                }
                for(int i = 0; i<pokemonData.size();i++){
                    System.out.printf("%d: %s\n",(i+1), pokemonData.get(i)[0]);

                }
                int selectedIndex = Integer.parseInt(scnr.nextLine())-1;
                if(selectedIndex >= 0 && selectedIndex< pokemonData.size()){
                    String [] selectedPokemonData = pokemonData.get(selectedIndex);
                    name = selectedPokemonData[0];
                    hp = Integer.parseInt(selectedPokemonData[1]);
                    moveName = selectedPokemonData[2];
                    movePower = Integer.parseInt(selectedPokemonData[3]);
                    moveSpeed = Integer.parseInt(selectedPokemonData[4]);
                    pokemon = new Pokemon(name,hp);
                    move = new Move(moveName,movePower,moveSpeed);
                    pokemon.addMove(move);
                    pokedex.addPokemon(pokemon);
                    System.out.print("The Pokemon has been added to Pokedex from File Data\n\n");

                }
                else{
                    System.err.println("invalid SELECTION");
                }
            }
            catch(FileNotFoundException e){
                System.err.println("ERROR POKEMON DATA FILE NOT FOUND");
            }
        }
        else{
            System.err.println("INVALID ENTRY FROM CREATEPOKEMON METHOD"); ;
        }

    }
    private void deletePokemon(){
        String name;
        Pokemon pokemon;
        System.out.println("Enter name of pokemon to delete");
        name = scnr.nextLine();
        pokemon = pokedex.getPokemon(name);
        if(pokemon == null){
            System.out.println("pokemon not Found");
        }
        else{
            pokedex.removePokemon(pokemon);
        }
    }
    private void displayPokemon(){
        String name;
        Pokemon pokemon;
        System.out.println("Enter name of pokemon to Display");
        name = scnr.nextLine();
        pokemon = pokedex.getPokemon(name);
        if(pokemon == null){
            System.out.println("pokemon not Found");
        }
        else{
            System.out.println(pokemon);
        }
    }
    private void displayAllPokemon(){
        ArrayList<Pokemon> pokemonArrayList =  pokedex.getAllPokemon();
        if(pokemonArrayList.isEmpty()){
            System.out.println("no pokemon in the pokedex");
            return;
        }
        System.out.println("All Pokemon in The Pokedex");
        for(Pokemon pokemon: pokemonArrayList){
            System.out.printf("Name: %s\n", pokemon.getName());
            System.out.printf("HP: %d\n", pokemon.getHp());
            ArrayList<Move> movesArrayList = pokemon.getMoveArrayList();
            if(movesArrayList.isEmpty()){
                System.out.println("No moves available for this pokemon");
            }
            else {
                System.out.println("Moves:");
                for (Move move : movesArrayList) {

                    System.out.printf("\tMove Name: %s\n", move.getMoveName());
                    System.out.printf("\tMove Power: %d\n", move.getMovePower());
                    System.out.printf("\tMove Speed: %d\n", move.getMoveSpeed());
                }
            }
            System.out.printf("\n");
        }
    }
    private void addMovesToPokemon(Pokemon pokemon){
        while(true){
            System.out.println("Enter a Move Name or q to Finish");
            String moveName = scnr.nextLine();
            if(moveName.equalsIgnoreCase("q")){
                break;
            }
            else{
                System.out.println("Enter Move power");
                int movePower = Integer.parseInt(scnr.nextLine());
                System.out.println("Enter Move Speed");
                int moveSpeed = Integer.parseInt(scnr.nextLine());

                Move move = new Move(moveName,movePower,moveSpeed);
                pokemon.addMove(move);
            }
        }
    }
}
