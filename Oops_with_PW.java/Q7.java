public class Q7 {

        private static class  Pokemon{
            int hp;
            int speed;
            int attack;
            int defense;
            String type;
            String name;
        }
    
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu"; p1.type ="Electric"; p1.attack=70;
        Pokemon p2 = new Pokemon();
        p2.name ="Charizarad"; p2.type = "Fire"; p2.attack =110;
        System.out.println(p1.type);
        Pokemon p3 = p1; // P3 is shallow copy of p1 (can control).
        p3.type = "Water";
        System.out.println(p3.type);
        
    }
}
