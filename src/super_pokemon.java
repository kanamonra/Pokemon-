public class super_pokemon
{
    protected String pokemon = null ;
    protected String owner = null ;
    protected String[] skills = null ;
    public static int count = 0;
    public super_pokemon(){} // super default constructor

    // super constructor
    public super_pokemon(String owner, String skills)
    {
        this.owner = owner;
        this.skills = skills.split("/");
        ++count;

    }
    public void show_info() {
        System.out.println("포켓몬들의 특징");
    } // will use override
    public void sound() {
        System.out.println("포켓몬들의 특징 사운드!");
    }   // will use override
    public void attack() {
        System.out.println("포켓몬들에 공격");
    } // will use override
    public static int getCount(){
        return count;
    }
}
