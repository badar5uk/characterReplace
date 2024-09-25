public class RemoveCharacter {
    public static void removeCharacter(){
        String myWord = "Welcome to my code, I hope you like it";
        String characters = myWord.replace('o',' ');
        System.out.println(characters);
    }

    public static void main(String[]args){
       removeCharacter();
    }
}
