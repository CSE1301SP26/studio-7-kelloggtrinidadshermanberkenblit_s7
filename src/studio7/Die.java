public class Die {

    private int sides;

    public Die(int initSides){
        sides = initSides;
    }

    public int rollDie(){
        return (int)(Math.random()*sides)+1;
    }

    public static void main(String[] args){
        Die d6 = new Die(6);
        System.out.println(d6.rollDie());
        System.out.println(d6.rollDie());
        System.out.println(d6.rollDie());
        Die d10 = new Die(10);
        System.out.println(d10.rollDie());
        System.out.println(d10.rollDie());
        System.out.println(d10.rollDie());
    }
}
