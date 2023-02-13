public class pikachuSub extends super_pokemon{

    private final String name;
    public pikachuSub(String owner, String skills) // pikachu constructor
    {
        super(owner, skills);
        this.name = "피카츄";
    }
    @Override
    public void sound() {
        System.out.print("피카피카 ⊂(๑•.•๑)\n");
    }
    @Override
    public void show_info(){
        System.out.println("포켓몬 정보: 피카츄\n특징: 귀여움, 전기 공격이 최고임");
        int idx = 0;
        for (String skill : skills){
            System.out.println("스킬 정보: ");
            System.out.println(idx++ + " : " + skill);
        }
    }
    @Override
    public void attack(String x)
    {
        System.out.println(owner + "의 " + name + "가 " + x + " 공격 성공! ( う-*)づ̿╤── <(˚☐˚”)");
    }

}

