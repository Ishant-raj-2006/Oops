public class Q8 {

    static class Pokemon {
        private int power;
        String type;

        Pokemon(String type, int power) {
            this.power = power;
            this.type = type;
        }

        void print() {
            System.out.println(this.power + " " + this.type);
        }

        // setter for power
        void setPower(int power) {
            this.power = power;
        }
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric", 78);
        
        pikachu.type = "Fire";   // allowed (default access)
        pikachu.setPower(34);    // use setter
        
        pikachu.print();
    }
}