public class DisplayChar {
    private char character='a';
    
    public void nextCharacter(){
        this.character++;
    }

    public char getCharacter(){
        return this.character;
    }
    
    public static void main (String [] args){
        DisplayChar a = new DisplayChar();
        System.out.println(a.getCharacter());
        a.nextCharacter();
        System.out.println(a.getCharacter());

        for(int i = 0; i<30; i++){
            a.nextCharacter();
        System.out.println(a.getCharacter());
        }

    }
}
